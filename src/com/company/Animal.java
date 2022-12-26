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
    public void fishing(Player player){
        System.out.println("Fishing is in progress...🎣");
        if(this.randomGenerator(2) == 1){
            System.out.println("Yay! I got "+ this.name);
            player.energyFromFood+=2;
            System.out.println(player.name+ " Energy: "+ player.energyFromFood);
        }else{
            System.out.println("Damn! fishing isn't going too well...😥");
        }
    }
    public int randomGenerator(int max) {
        int result = 0;
        {
            int min = 1;
            int range = max - min + 1;
            // generate random numbers within 1 to 3
            for (int i = 0; i < 3; i++) {
                int rand = (int) (Math.random() * range) + min;
                result = rand;
            }

        }
        return result;
    }
}