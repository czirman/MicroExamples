package automatic;

import org.springframework.stereotype.Component;

@Component
public class StateBean {

    public CityBean cityBean;

    public StateBean(CityBean cityBean) {
        this.cityBean = cityBean;
    }

}
