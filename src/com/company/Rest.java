package com.company;

import com.company.Character.Player;

import java.util.Scanner;

public class Rest {
    Player player;
    Scanner in= new Scanner(System.in);
    public Rest(Player player){
        this.player=player;
    }


    public void goToBed(){
        System.out.println("\uD83D\uDCA4 \uD83D\uDCA4 \uD83D\uDCA4 \uD83D\uDCA4 \uD83D\uDCA4 \uD83D\uDCA4");
        int bonusPoints=RandomGenerator.randomGenerator(5);
        this.player.energyFromRest +=bonusPoints;
        this.player.hp+=bonusPoints;
        System.out.println(this.player.name + " Energy: "+ this.player.energyFromRest);

    }

    public void watchNetflix(){
        System.out.println("\uD83D\uDCA4 \uD83D\uDCA4 \uD83D\uDCA4 \uD83D\uDCA4 \uD83D\uDCA4 \uD83D\uDCA4");
        int bonusPoints=RandomGenerator.randomGenerator(5);
        this.player.energyFromRest +=bonusPoints;
        this.player.hp+=bonusPoints;
        System.out.println(this.player.name + " Energy: "+ this.player.energyFromRest);
    }

    public void takeAbath(){
        System.out.println("\uD83D\uDEC0 \uD83D\uDEC0 \uD83D\uDEC0 \uD83D\uDEC0 \uD83D\uDEC0 \uD83D\uDEC0");
        int bonusPoints=RandomGenerator.randomGenerator(5);
        this.player.energyFromRest +=bonusPoints;
        this.player.hp+=bonusPoints;
        System.out.println(this.player.name + " Energy: "+ this.player.energyFromRest);
    }
    public void restChoices(){
        System.out.println("1. Go to bed");
        System.out.println("2. Watch Netflix");
        System.out.println("3. Take a bath");
        int restChoice= in.nextInt();
        if(restChoice==1){
            this.goToBed();
        }else if(restChoice==2){
            this.watchNetflix();
        }else if(restChoice==3){
            this.takeAbath();
        }
    }

}

