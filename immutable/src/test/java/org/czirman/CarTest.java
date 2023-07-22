package org.czirman;

import org.czirman.constructor.Engine;
import org.czirman.serialization.Radiator;
import org.czirman.staticmethod.Carburettor;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class CarTest {

    @Test
    public void copyConstructor_DeepCopy() {
        //given
        Car car = initializeObject();

        //when
        Engine copyEngine = car.getEngine();
        copyEngine.setName("change");
        copyEngine.setGearWheel(new GearWheel("inny"));

        //then
        Engine orginalEngine = car.getEngine();
        assertEquals("micro", orginalEngine.getName());
        assertEquals("small", orginalEngine.getGearWheel().getSize());
    }

    @Test
    public void staticMethod_DeepCopy() {
        //given
        Car car = initializeObject();
        //when
        Carburettor copyCarburettor = car.getCarburettor();
        copyCarburettor.setName("change");
        copyCarburettor.setGearWheel(new GearWheel("inny"));

        //then
        Carburettor orginalCarburettor = car.getCarburettor();
        assertEquals("gaznik", orginalCarburettor.getName());
        assertEquals("medium", orginalCarburettor.getGearWheel().getSize());

    }

    @Test
    public void serialization_DeepCopy() {
        //given
        Car car = initializeObject();

        //when
        Radiator copyRadiator = car.getRadiator();
        copyRadiator.setName("zmiana");
        copyRadiator.setGearWheel(new GearWheel("inny"));

        //then
        Radiator orginalRadiator = car.getRadiator();
        assertEquals("powietrzny", orginalRadiator.getName());
        assertEquals("big", orginalRadiator.getGearWheel().getSize());

    }

    @Test
    public void serialization_by_apacheCommons() {
        //given
        Car car = initializeObject();

        //when
        Engine copyEngine = car.getUtilsEngine();
        //then
        Engine orginalEngine = car.getEngine();
        assertEquals("micro", orginalEngine.getName());
        assertEquals("small", orginalEngine.getGearWheel().getSize());

    }

    @Test
    public void change_collection() {
        //given
        Car car = initializeObject();

        //when
        List<String> copyButtons = car.getButtons();

        //then
        assertThrows(UnsupportedOperationException.class, () -> {
            copyButtons.add("nowy");
            copyButtons.set(0, "nowy");
        });
    }

    private Car initializeObject() {
        GearWheel gearWheelSmall = new GearWheel("small");
        GearWheel gearWheelMedium = new GearWheel("medium");
        GearWheel gearWheelBig = new GearWheel("big");
        Engine engine = new Engine("micro", gearWheelSmall);
        Carburettor carburettor = new Carburettor("gaznik", gearWheelMedium);
        Radiator radiator = new Radiator("powietrzny", gearWheelBig);
        List buttonsModifiable = new ArrayList();
        buttonsModifiable.add("a");
        buttonsModifiable.add("b");
        buttonsModifiable.add("c");

        Car car = new Car(1, "Ford", engine, carburettor, radiator, buttonsModifiable);
        return car;
    }
}
