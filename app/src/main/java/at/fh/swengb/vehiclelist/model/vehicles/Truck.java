package at.fh.swengb.vehiclelist.model.vehicles;

import java.io.Serializable;

/**
 * Created by Florian on 23.11.2016.
 */

public class Truck extends Vehicle implements Serializable {

    public int numberOfAxles;

    public int getNumberOfAxles() {
        return numberOfAxles;
    }

    public void setNumberOfAxles(int numberOfAxles) {
        this.numberOfAxles = numberOfAxles;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "brandName='" + brandName + '\'' +
                ", manuDate=" + manuDate +
                ", color='" + color + '\'' +
                ", wheels=" + wheels +
                ", owner='" + owner + '\'' +
                ", registrationNumber=" + registrationNumber +
                ", numberOfAxles=" + numberOfAxles  + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Truck truck = (Truck) o;

        if (manuDate != truck.manuDate) return false;
        if (wheels != truck.wheels) return false;
        if (!brandName.equals(truck.brandName)) return false;
        if (numberOfAxles != truck.numberOfAxles) return false;
        return owner.equals(truck.owner);

    }

    @Override
    public int hashCode() {
        int result = brandName.hashCode();
        result = 31 * result + manuDate;
        result = 31 * result + wheels;
        result = 31 * result + owner.hashCode();
        result = 31 * result + numberOfAxles;


        return result;
    }



    public Truck() {
    }

    public Truck(String brandName, int manuDate, String color, int wheels, String owner, int registrationNumber,int numberOfAxles) {
        this.brandName = brandName;
        this.manuDate = manuDate;
        this.color = color;
        this.wheels = wheels;
        this.owner = owner;
        this.registrationNumber = registrationNumber;
        this.numberOfAxles = numberOfAxles;
    }
    public void brumm(String sound) {
        System.out.println("I am a " + brandName + " and I have " + numberOfAxles +" Axles! " + sound);
    }

}
