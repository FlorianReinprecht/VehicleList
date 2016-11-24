package at.fh.swengb.vehiclelist.model.vehicles;

import java.io.Serializable;

/**
 * Created by Florian on 23.11.2016.
 */

public class Car extends Vehicle implements Serializable {

    public int numberOfDoors;

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brandName='" + brandName + '\'' +
                ", manuDate=" + manuDate +
                ", color='" + color + '\'' +
                ", wheels=" + wheels +
                ", owner='" + owner + '\'' +
                ", registrationNumber=" + registrationNumber +
                ", numberOfDoors=" + numberOfDoors  + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (manuDate != car.manuDate) return false;
        if (wheels != car.wheels) return false;
        if (!brandName.equals(car.brandName)) return false;
        if (numberOfDoors != car.numberOfDoors) return false;
        return owner.equals(car.owner);

    }

    @Override
    public int hashCode() {
        int result = brandName.hashCode();
        result = 31 * result + manuDate;
        result = 31 * result + wheels;
        result = 31 * result + owner.hashCode();
        result = 31 * result + numberOfDoors;

        return result;


    }

    public Car() {
    }

    public Car(String brandName, int manuDate, String color, int wheels, String owner, int registrationNumber,int numberOfDoors) {
        this.brandName = brandName;
        this.manuDate = manuDate;
        this.color = color;
        this.wheels = wheels;
        this.owner = owner;
        this.registrationNumber = registrationNumber;
        this.numberOfDoors = numberOfDoors;
    }

    public void vrmm(String sound) {
        System.out.println("I am a " + brandName + " and I have " + numberOfDoors + " Doors! " + sound);
    }

}
