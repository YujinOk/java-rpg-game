package com.company;

import com.company.Character.Player;
import java.security.SecureRandom;
public class Animal {
    public String name;
    Player player;
    boolean isFish;
    SecureRandom rand= new SecureRandom();
    public Animal(String [] animalNames,Player player, boolean isFish){
        String animalName=animalNames[rand.nextInt(animalNames.length)];
        this.name=animalName;
        this.player=player;
        this.isFish=isFish;
    }
}