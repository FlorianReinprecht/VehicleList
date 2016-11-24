package at.fh.swengb.vehiclelist.model.vehicles;

import java.io.Serializable;

/**
 * Created by Florian on 23.11.2016.
 */

public class Motorcycle extends Vehicle implements Serializable {

    public boolean hasSidecar;

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }


    @Override
    public String toString() {
        return "Motorcycle{" +
                "brandName='" + brandName + '\'' +
                ", manuDate=" + manuDate +
                ", color='" + color + '\'' +
                ", wheels=" + wheels +
                ", owner='" + owner + '\'' +
                ", registrationNumber=" + registrationNumber +
                ", hasSidecar=" + hasSidecar  + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Motorcycle motorcycle = (Motorcycle) o;

        if (manuDate != motorcycle.manuDate) return false;
        if (wheels != motorcycle.wheels) return false;
        if (!brandName.equals(motorcycle.brandName)) return false;
        return owner.equals(motorcycle.owner);

    }

    @Override
    public int hashCode() {
        int result = brandName.hashCode();
        result = 31 * result + manuDate;
        result = 31 * result + wheels;
        result = 31 * result + owner.hashCode();

        return result;
    }


    public Motorcycle() {
    }

    public Motorcycle(String brandName, int manuDate, String color, int wheels, String owner, int registrationNumber,boolean hasSidecar) {
        this.brandName = brandName;
        this.manuDate = manuDate;
        this.color = color;
        this.wheels = wheels;
        this.owner = owner;
        this.registrationNumber = registrationNumber;
        this.hasSidecar = hasSidecar;
    }

    public void niii(String sound) {
        System.out.println("I am a " + brandName + " and " + owner + " is my Owner! " + sound);
    }
}
