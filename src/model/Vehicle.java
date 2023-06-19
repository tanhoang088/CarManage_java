package model;

public class Vehicle {
    String carModel;
    String carName;
    double carValue;
    int cylinderCapacity;

    public Vehicle(String carModel, String carName, double carValue, int cylinderCapacity) {
        this.carModel = carModel;
        this.carName = carName;
        this.carValue = carValue;
        this.cylinderCapacity = cylinderCapacity;
    }
    public Vehicle(){

    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public double getCarValue() {
        return carValue;
    }

    public void setCarValue(double carValue) {
        this.carValue = carValue;
    }

    public int getCylinderCapacity() {
        return cylinderCapacity;
    }

    public void setCylinderCapacity(int cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }
}
