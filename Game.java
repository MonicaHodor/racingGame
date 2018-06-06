 package org.fasttrackit;


 import java.util.ArrayList;
 import java.util.List;

 public class Game {

     Vehicle[] competitors = new Vehicle[10];
     List<Vehicle> competitorsList = new ArrayList<>();
     Vehicle firstCompetitor;
     Vehicle secondCompetitor;


     public void start() {
         Car car1 = new Car("Dacia");
         car1.setColor("red");
         car1.setDoorCount(3);
         car1.setMileage(7.5);
         car1.setFuelLevel(50);
         Engine engine1 = new Engine();
         engine1.setManufacturer("Renault");

         Car car2 = new Car("Ford");
         car2.setColor("black");
         car2.setDoorCount(2);
         car2.setMileage(8.2);
         car2.setFuelLevel(4.7);

         Engine engine2 = new Engine();
         engine2.setManufacturer("Ford");

         car2.setEngine(engine2);


         Truck truck = new Truck("Volvo");
         truck.setColor("white");
         truck.setDoorCount(2);
         truck.setMileage(9);
         truck.setFuelLevel(65);

         Engine engineTruck = new Engine();
         engineTruck.setManufacturer("Volvo");

         truck.accelerate(7.2, 6.9);

         competitors[0] = car1;
         competitors[1] = car2;

         competitorsList.add(car1);
         competitorsList.add(car2);

         for (int i = 0; i < competitors.length; i++) {
             System.out.println("Iteration number" + i);
             System.out.println(competitors[i]);
         }

         firstCompetitor = car1;
         secondCompetitor = car2;

         car1.accelerate(7.2, 6.9);
     }
 }











