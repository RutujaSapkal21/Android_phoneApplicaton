package com.example.phone;

import java.io.Serializable;

public class Details implements Serializable {
    String nameofperson;
    String number;
    String samenumber;

    public String getNameofperson() {
        return nameofperson;
    }

    public void setNameofperson(String nameofperson) {
        this.nameofperson = nameofperson;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSamenumber() {
        return samenumber;
    }

    public void setSamenumber(String samenumber) {
        this.samenumber = samenumber;
    }
}
