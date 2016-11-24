package at.fh.swengb.vehiclelist.model.vehicles;

import java.io.Serializable;

/**
 * Created by Florian on 23.11.2016.
 */

public class Vehicle implements Serializable {

    protected String brandName;
    protected int manuDate;
    protected String color;
    protected int wheels;
    protected String owner;
    protected int registrationNumber;

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getManuDate() {
        return manuDate;
    }

    public void setManuDate(int manuDate) {
        this.manuDate = manuDate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }


}
