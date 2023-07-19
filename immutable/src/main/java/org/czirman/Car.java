package org.czirman;

import org.apache.commons.lang3.SerializationUtils;
import org.czirman.constructor.Engine;
import org.czirman.serialization.Radiator;
import org.czirman.staticmethod.Carburettor;

import java.util.Collections;
import java.util.List;

// główny obiekt niemutowalny
public final class Car {

    private final Integer version;
    private final String name;
    private final Engine engine;// deep copy constructor
    private final Carburettor carburettor;// static method
    private final Radiator radiator;// serialization

    private final List<String> buttons;

    public Car(Integer model, String name, Engine engine, Carburettor carburettor, Radiator radiator, List unmodificableList) {
        this.version = model;
        this.name = name;
        this.engine = engine;
        this.carburettor = carburettor;
        this.radiator = radiator;
        this.buttons = unmodificableList;
    }

    public Integer getVersion() {
        return version;
    }

    public String getName() {
        return name;
    }

    public Engine getEngine() {
        return new Engine(engine);
    }

    public Engine getUtilsEngine() {
        return SerializationUtils.clone(engine);
    }

    public Carburettor getCarburettor() {
        return Carburettor.newInstance(carburettor);
    }

    public Radiator getRadiator() {
        return radiator.deepCopy();
    }

    public List<String> getButtons() {
        return Collections.unmodifiableList(buttons);
    }
}
