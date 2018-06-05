package org.fasttrackit;

public class AutoVehicle extends Vehicle {

   private  Engine engine;


    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public AutoVehicle(String name) {
        super(name);

    }

    public AutoVehicle(String name, Engine engine) {
        super(name);
        this.engine = engine;}

}
