package com.company.Train;

import com.company.Character.Player;
import com.company.Music;

import java.util.Scanner;

public class Training {
    Player player;
    String question;
    String answer;
    String confirmationAnswer;
    String filePath;
    String type;

//    question needs to be printed with sleep (1 ms?)-> then answer printed
//    -> then the results either fail or success
    public Training(Player player){
        this.player=player;
    }

    Scanner in= new Scanner(System.in);

    public void getTheAnswer() throws InterruptedException {
        System.out.println(this.question);


        Music sound = new Music(filePath);
        sound.start();
        for(int i=0; i<this.answer.length(); i++){
            Thread.sleep(90);
            System.out.print(this.answer.charAt(i));
        }
        sound.stopPlaying();

        System.out.print("\n");

       if(this.type=="intelligence"){
           this.player.setIntelligence(this.player.intelligence+20);
       }else{
           this.player.setPhysicalPower(this.player.physicalPower+20);
       }

        System.out.println(this.confirmationAnswer);

//        }
//        else{
//            this.answer="Answer: " + RandomGenerator.randomGenerator(5);
//            for(int i=0; i<this.answer.length(); i++){
//                Thread.sleep(90);
//                System.out.print(this.answer.charAt(i));
//            }
//            System.out.print("\n");
//
//            this.confirmationAnswer="Wrong! FAILED! you loser! \uD83D\uDE29";
//            System.out.println(confirmationAnswer);
//
//        }
    }
    public void trainingChoices() throws InterruptedException {
        System.out.println("1. Do a math problem");
        System.out.println("2. Learn programming");
        System.out.println("3. Twerking!");
        System.out.println("4. Burpees! uh");

        int trainingChoices= in.nextInt();


        if(trainingChoices==1){
//            this.calculating();
            Calculating calculating= new Calculating(player);
            calculating.getTheAnswer();



        }else if(trainingChoices==2){
//            this.programming();
            Programming programming= new Programming(player);
            programming.getTheAnswer();

        }else if(trainingChoices==3){
//            this.twerking();
            Twerking twerking= new Twerking(player);
            twerking.getTheAnswer();

        }else if(trainingChoices==4){
//            this.burpees();
            Burpee burpee= new Burpee(player);
            burpee.getTheAnswer();

        }
    }



}

