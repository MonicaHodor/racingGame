package org.fasttrackit;

public class Truck extends AutoVehicle {

   private int doorCount;
    private double weight;

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Truck(String name) {
        super(name);
    }
    public double accelerate(double speed) {
        return accelerate(speed, 60);

    }

    @Override
    public double accelerate(double speed, double time) {
        return super.accelerate(speed*2, time);
    }
}



