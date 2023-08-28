package org.example;

import java.security.SecureRandom;
import java.util.*;

public class Participants {
    private String name;
    private int idParticipant;


    public Participants(String name, int idParticipant) {
        this.name = name;
        this.idParticipant = idParticipant;
    }

    public String getName() {
        return name;
    }

    public String setName() {
        return name;
    }

    public String getInfo() {
        return "id участника: " + idParticipant + " ; " + " имя участника " + name;
    }

    public int getIdPart() {
        return idParticipant;
    }
    public int setIdPart() {
        return idParticipant;
    }

    public ArrayList<Participants> getRandomParticipants(int amount, ArrayList<Participants> list) {
        ArrayList<Participants> returnList = new ArrayList<Participants>(list);
        Collections.shuffle(returnList);
        if (returnList.size() > amount) {
            //list.subList(returnList.size() - (amount-1), returnList.size()).clear();
            list.subList(0, 9).clear();
        }
        return returnList;
    }



}

