package org.example.Models;

public class Plumber {
    int plumber_id;

    String plumber_name;

    String company_name;

    Double average_cost_per_visit;

    public int getPlumber_id() {
        return plumber_id;
    }

    public void setPlumber_id(int plumber_id) {
        this.plumber_id = plumber_id;
    }

    public String getPlumber_name() {
        return plumber_name;
    }

    public void setPlumber_name(String plumber_name) {
        this.plumber_name = plumber_name;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public Double getAverage_cost_per_visit() {
        return average_cost_per_visit;
    }

    public void setAverage_cost_per_visit(Double average_cost_per_visit) {
        this.average_cost_per_visit = average_cost_per_visit;
    }

    public Plumber(int plumber_id, String plumber_name, String company_name, Double average_cost_per_visit) {
        this.plumber_id = plumber_id;
        this.plumber_name = plumber_name;
        this.company_name = company_name;
        this.average_cost_per_visit = average_cost_per_visit;
    }
}