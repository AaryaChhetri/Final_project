package org.example.Models;

public class Electrician {

    int electrician_id;

    String electrician_name;

    String company_name;

    Double average_cost_per_visit;

    public int getElectrician_id() {
        return electrician_id;
    }

    public void setElectrician_id(int electrician_id) {
        this.electrician_id = electrician_id;
    }

    public String getElectrician_name() {
        return electrician_name;
    }

    public void setElectrician_name(String electrician_name) {
        this.electrician_name = electrician_name;
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

    public Electrician(int electrician_id, String electrician_name, String company_name, Double average_cost_per_visit) {
        this.electrician_id = electrician_id;
        this.electrician_name = electrician_name;
        this.company_name = company_name;
        this.average_cost_per_visit = average_cost_per_visit;
    }
}
