package com.company.Place;

import com.company.Animal;
import com.company.Character.Player;
import com.company.GameStart;
import com.company.Random.RandomTreasure;
import com.company.RandomGenerator;

import java.security.SecureRandom;

public class TallMountain extends Mountain{
    int height;
    SecureRandom rand = new SecureRandom();
//    Music typingSound= new Music("src/com/company/Music/type-writing-6834.wav");
    public TallMountain(int height, Player player, GameStart gameStart){
        super(true, player, gameStart);

        this.height=height;
    }

    public void climbing() throws InterruptedException {

        String s=player.name+ " is climbing the mountain";

        System.out.println(s);
        RandomTreasure randomTreasure = new RandomTreasure("Chocolate",0, 5, this.player);
        if(RandomGenerator.randomGenerator(5)==2){
//            random treasure
            randomTreasure.increaseEnergyByFood();
        }else if(RandomGenerator.randomGenerator(5)==3){
            randomTreasure.name="Cow poo";
            randomTreasure.hpValue=7;
            randomTreasure.energyValue=0;
            randomTreasure.decreaseHp();
        }else if(RandomGenerator.randomGenerator(5)==1){
            randomTreasure.name="Shoulder massage";
            randomTreasure.hpValue=7;
            randomTreasure.energyValue=0;
            randomTreasure.increaseHp();
        }else{
            System.out.println("And...heard some sound...felt something unusual...then realised that ");
            Animal mountainAnimals= new Animal(new String[]{"Tiger", "Lion", "Wild pig", "Rabbit", "Bear"},player,false);
//            String animalName=mountainAnimals[rand.nextInt(mountainAnimals.length)];
            System.out.println(mountainAnimals.name + " was staring at " + player.name);
            super.friendsOrBeKilled();

        }
    }






}

