package com.company.Train;

import com.company.Character.Player;

import java.util.Scanner;

public class Training extends Thread{
    Player player;
    String question;
    String answer;
    String confirmationAnswer;

//    question needs to be printed with sleep (1 ms?)-> then answer printed
//    -> then the results either fail or success
    public Training(Player player){
        this.player=player;
    }

    Scanner in= new Scanner(System.in);


    public void trainingChoices() throws InterruptedException {
        System.out.println("1. Do a math problem");
        System.out.println("2. Learn programming");
        System.out.println("3. Twerking!");
        System.out.println("4. Burpees! uh");

        int trainingChoices= in.nextInt();


        if(trainingChoices==1){
//            this.calculating();
            Calculating calculating= new Calculating(player);
            calculating.start();
            calculating.join();

        }else if(trainingChoices==2){
//            this.programming();
            Programming programming= new Programming(player);
            programming.start();
            programming.join();
        }else if(trainingChoices==3){
//            this.twerking();
            Twerking twerking= new Twerking(player);
            twerking.start();
            twerking.join();
        }else if(trainingChoices==4){
//            this.burpees();
            Burpee burpee= new Burpee(player);
            burpee.start();
            burpee.join();
        }
    }


}

