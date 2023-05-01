package model;

import java.util.ArrayList;
import java.util.List;

public class Fraud {

    public List<Report> getStatusPeople(){
        List<Report> result = new ArrayList<Report>();
        result.add(new Report(11, true));
        result.add(new Report(2, false));
        result.add(new Report(3, true));
        result.add(new Report(4, false));
        result.add(new Report(1, true));

        result.add(new Report(6, true));
        result.add(new Report(7, false));
        result.add(new Report(8, true));
        result.add(new Report(9, false));
        result.add(new Report(10, true));
        result.add(new Report(5, false));

        return result;
    }
}
