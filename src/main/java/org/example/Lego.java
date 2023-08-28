package org.example;

public class Lego extends EducationalToys {
    public Lego(String name, int count, int weight, int frequency){
        super(name, count, weight, frequency);
    }
    public Lego(){
        super("Lego", 40, 400, 0);
    }
}
