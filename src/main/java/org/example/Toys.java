package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public abstract class Toys {

    public String name;
    public int count;
    public int weight;

    private int frequency;



    public Toys(String name, int count, int weight, int frequency) {
        this.name = name;
        this.count = count;
        this.weight = weight;
        this.frequency = frequency;
    }

    public int getFrequency() {
        return frequency;
    }

    public String getInfo() {
        return "Игрушка: " + name;
    }

    public int getWeight() {
        return weight;
    }

//    public int getCount() {
//        return count;
//    }

    public void Sort(ArrayList<Toys> list) {
        Collections.sort(list, (o1, o2) -> o2.getWeight() - o1.getWeight());
    }


    public void getToy(ArrayList<Toys> listToys, ArrayList<Participants> participants) throws IOException {
        int countOfPrize = 10;

        for (int i = 1; i <= countOfPrize; i++) {
            Toys toy = (Toys) listToys.remove(0);
            Participants participants1 = participants.remove(0);
            //list2.remove(0);

            System.out.println("Участник  " + participants1.getName() + " получил приз " + toy.getInfo());
            try {
                String prizeFilePath = "C:\\Users\\Ирина\\IdeaProjects\\ToyStore\\src\\main\\java\\Prize.txt";
                FileWriter writer = new FileWriter(prizeFilePath, true);
                writer.write("Участник  " + participants1.getName() + " получил приз " + toy.getInfo() + "\n");
                writer.close();
            } catch (IOException e) {
                System.out.println("Ошибка при записи в файл игрушки");
            }
            //System.out.println(listToys);
        }

    }

    public int getCount(int countOfSpend, Toys toy){
        int balance = count - countOfSpend;
        System.out.println("Остаток игрушек  в магазине " + toy.getInfo() + " " + balance);
        count = balance;
        //System.out.println(count);
        return count;
    }


//    public void getToy1(ArrayList<Toys> list2, ArrayList<Participants> participants) {
//        Iterator<Toys> iterator = list2.iterator();
//        Iterator<Participants> iterator2 = participants.iterator();
//        while (iterator.hasNext()) {
//            Toys toy = iterator.next();
//            Participants participants1 = iterator2.next();
//            iterator.remove();
//            iterator2.remove();
//            list2.remove(0);
//            System.out.println("Участник под номером " + participants1.idParticipant + " получил приз " + toy.getInfo());
//            //System.out.println(list2);
//        }
//
//    }
}





