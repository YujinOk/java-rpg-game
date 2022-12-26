package com.company;

import com.company.Character.Player;

import java.util.Scanner;

public class Rest {
    Player player;
    Scanner in= new Scanner(System.in);
    public Rest(Player player){
        this.player=player;
    }
//       public void rest(){
//        System.out.println("1. Take a nap");
//        System.out.println("2. Watch Netflix");
//        System.out.println("3. Take a bath");
//        in.nextInt();
//        this.hp+=this.randomGenerator(5);
//
//    }

    public void takeAnap(){
        System.out.println("\uD83D\uDCA4 \uD83D\uDCA4 \uD83D\uDCA4 \uD83D\uDCA4 \uD83D\uDCA4 \uD83D\uDCA4");

        this.player.energyFromRest+=this.randomGenerator(5);
        System.out.println(this.player.name + " Energy: "+ this.player.energyFromRest);
    }

    public void watchNetflix(){
        System.out.println("\uD83D\uDCA4 \uD83D\uDCA4 \uD83D\uDCA4 \uD83D\uDCA4 \uD83D\uDCA4 \uD83D\uDCA4");
        this.player.energyFromRest+=this.randomGenerator(5);
        System.out.println(this.player.name + " Energy: "+ this.player.energyFromRest);
    }

    public void takeAbath(){
        System.out.println("\uD83D\uDEC0 \uD83D\uDEC0 \uD83D\uDEC0 \uD83D\uDEC0 \uD83D\uDEC0 \uD83D\uDEC0");
        this.player.energyFromRest+=this.randomGenerator(5);
        System.out.println(this.player.name + " Energy: "+ this.player.energyFromRest);
    }
    public void restChoices(){
        System.out.println("1. Take a nap");
        System.out.println("2. Watch Netflix");
        System.out.println("3. Take a bath");
        int restChoice= in.nextInt();
        if(restChoice==1){
            this.takeAnap();
        }else if(restChoice==2){
            this.watchNetflix();
        }else if(restChoice==3){
            this.takeAbath();
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

