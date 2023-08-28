package org.example;


import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static ArrayList<Participants> participants = new ArrayList<>();
    public static ArrayList<Toys> listToys = new ArrayList<>();
    public static ArrayList<Participants> participantsSort = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        participants.add(new Participants("Igor", 1));
        participants.add(new Participants("Marya", 2));
        participants.add(new Participants("Andrei", 3));
        participants.add(new Participants("Pavel", 4));
        participants.add(new Participants("Olga", 5));
        participants.add(new Participants("Darya", 6));
        participants.add(new Participants("Aleksandr", 7));
        participants.add(new Participants("Alena", 8));
        participants.add(new Participants("Vladislav", 9));
        participants.add(new Participants("Tatyana", 11));
        participants.add(new Participants("Oleg", 12));
        participants.add(new Participants("Irina", 13));
        participants.add(new Participants("Ludmila", 14));
        participants.add(new Participants("Vladimir", 15));
        participants.add(new Participants("Valentina", 16));
        participants.add(new Participants("Semen", 17));
        participants.add(new Participants("Gennadyi", 18));
        participants.add(new Participants("Anastasia", 19));
        participants.add(new Participants("Anna", 20));


        for (int i = 0; i < participants.size(); i++) {
            System.out.println(participants.get(i).getInfo());
        }


        System.out.println();


        for (int i = 0; i < 10; i++) {
            participantsSort = participants.get(i).getRandomParticipants(10, participants);

        }
        for (Participants participant : participantsSort) {
            System.out.println("Участник розыгрыша: " + participant.getInfo());
        }

        System.out.println();
//        for (int i = 1; i < 11; i++) {
//            switch (new Random().nextInt(1, 5)) {
//                case 1:
//                    listToys.add(new Barbie());
//                    break;
//                case 2:
//                    listToys.add(new Truck());
//                    break;
//                case 3:
//                    listToys.add(new Lego());
//                    break;
//                case 4:
//                    listToys.add(new Bear());
//                    break;
//
//            }
//        }

        int prizeCount = 10;
        Random rand = new Random();
        int carCount = 0;
        int barbieCount = 0;
        int legoCount = 0;
        int bearCount = 0;

        for(int i =0; i < prizeCount; i++){
            if(rand.nextInt(4) == 0){
                listToys.add(new Lego());
                legoCount++;
            }
            else if (rand.nextInt(4) == 1){
                listToys.add(new Barbie());
                barbieCount++;
            }
            else if (rand.nextInt(4) == 2){
                listToys.add(new Bear());
                bearCount++;
            }
            else {
                listToys.add(new Truck());
                carCount++;
            }
        }




        for (Toys toys : listToys) {
            System.out.println("В розыгрыше участвует: " + toys.getInfo());
        }
        System.out.println();

        for (int i = 0; i < listToys.size(); i++) {
            listToys.get(i).Sort(listToys);
        }

        int number = 1;
        for (Toys toys : listToys) {
            System.out.println("Игрушка розыгрыша под номером " + number + " " + toys.getInfo());
            number++;
        }

        System.out.println();

        for (int i = 0; i <= listToys.size() ; i++) {
            listToys.get(i).getToy(listToys, participantsSort);
        }

        System.out.println();

//        Barbie barbie = new Barbie();
//        barbie.getBalanceOfToys(barbieCount, barbie);

        Barbie barbie = new Barbie();
        barbie.getCount(barbieCount, barbie);

        Truck truck = new Truck();
        truck.getCount(carCount, truck);

        Bear bear = new Bear();
        bear.getCount(bearCount, bear);

        Lego lego = new Lego();
        lego.getCount(legoCount, lego);

    }

}