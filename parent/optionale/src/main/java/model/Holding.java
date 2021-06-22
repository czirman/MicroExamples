package model;

import java.util.List;

public class Holding {

    public Holding() {
    }

    public Holding(List<Company> companies) {
        this.companies = companies;
    }

    private List<Company> companies;
    public List<Company> getCompanies() {
        return null;
    }

    public Company firstElement(List<Company> companies) {
        return companies.get(0);
    }
}
