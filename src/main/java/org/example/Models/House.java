package org.example.Models;

public class House {
    int house_no;

    int electrican_id;

    int plumber_id;

    public int getHouse_no() {
        return house_no;
    }

    public void setHouse_no(int house_no) {
        this.house_no = house_no;
    }

    public int getElectrican_id() {
        return electrican_id;
    }

    public void setElectrican_id(int electrican_id) {
        this.electrican_id = electrican_id;
    }

    public int getPlumber_id() {
        return plumber_id;
    }

    public void setPlumber_id(int plumber_id) {
        this.plumber_id = plumber_id;
    }

    public House(int house_no, int electrican_id, int plumber_id) {
        this.house_no = house_no;
        this.electrican_id = electrican_id;
        this.plumber_id = plumber_id;
    }
}
