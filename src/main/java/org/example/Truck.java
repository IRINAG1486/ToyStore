package org.example;

public class Truck extends Cars {
    public Truck(String name, int count, int weight, int frequency){
        super(name, count, weight, frequency);
    }
    public Truck(){
        super("Car", 35, 400, 3);
    }
}
