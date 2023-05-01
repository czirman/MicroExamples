package model;

public class Report {

    private Integer id;
    private Boolean isFrauded;

    public Report(Integer id, Boolean isFrauded) {
        this.id = id;
        this.isFrauded = isFrauded;
    }

    public Boolean getFrauded() {
        return isFrauded;
    }

    public Integer getId() {
        return id;
    }
}
