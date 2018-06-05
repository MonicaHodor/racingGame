package org.fasttrackit;

public class Vehicle {

    private String name;
    private String color;
    private double mileage;
    private double fuelLevel;
    // demontrating constatnts
    public final static String RADIO_CONTROL = "Radio Control";

    public Vehicle(String name) {
        this.name = name;
    }

    public double accelerate(double speed) {
        return accelerate(speed, 60);
    }


    public double accelerate(double speed, double time) {
        System.out.println("Vehicle accelerate with" + speed + "for" + time + "seconds");
        double traveledDistance = speed * time;
        System.out.println("Traveled distance:" + traveledDistance);
        return traveledDistance;
    }


    public double getFuelLevel() {
        return fuelLevel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;


    }

    public Vehicle() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
