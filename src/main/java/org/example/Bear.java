package org.example;

public class Bear extends SoftToys {
    public Bear(String name, int count, int weight, int frequency){
        super(name, count, weight, frequency);
    }
    public Bear(){
        super("Teddy", 20, 300, 2);
    }

}
