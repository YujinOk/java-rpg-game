package com.company;

import com.company.Character.Player;

import java.util.Scanner;

public class Training {
    Player player;

    public Training(Player player){
        this.player=player;
    }
    Scanner in= new Scanner(System.in);
    public void calculating(){
        System.out.println(" \uD83D\uDC49 Mission: Write the sum of 58 + 32 within 10 sec! 👈 ");
//        this.player.intelligence+=10;
        if(this.randomGenerator(2)==1){
            System.out.println("🙋‍ Answer: 90");
            this.player.setIntelligence(this.player.intelligence+20);
            System.out.println("Congrats! 🎉 you smartie! \u200D  you just earned "+ this.player.intelligence + " Intelligence");
        }else{
            System.out.println("Answer: "+ this.randomGenerator(5));
            System.out.println("Wrong! FAILED! you loser! \uD83D\uDE29");
        }
    }

    public void programming(){
        System.out.println(" \uD83D\uDC49 Mission: make one variable within 10 sec!  👈");

        if(this.randomGenerator(2)==1){
            System.out.println("🙋‍ ️Answer: boolean amIawesome = true");
            this.player.setIntelligence(this.player.intelligence+ 20);
            System.out.println("Congrats! 🎉 you Smartie! \u200D you just earned "+ this.player.intelligence + " Intelligence");
        }else{
            System.out.println("Answer: String amIloser = 3 ");
            System.out.println("Wrong! FAILED! you loser! \uD83D\uDE29");
        }
    }

    public void twerking(){
        System.out.println(" \uD83D\uDC49  Mission: Twerking for 10 sec!  👈 ");
        if(this.randomGenerator(2)==1){
            this.player.setPhysicalPower(this.player.physicalPower+30);
            System.out.println("Hell yah! 🎉 you got the Kim kardashian ASS \uD83D\uDD25");
            System.out.println("You just earned "+ this.player.physicalPower + " Physical power");
        }else{
            System.out.println("Lame! you failed! try harder!!! \uD83D\uDE29");
        }
    }

    public void burpees(){
        System.out.println(" \uD83D\uDC49 Mission: Non stop Burpees for 1 min!  👈 ");
        if(this.randomGenerator(2)==1){
            this.player.setPhysicalPower(this.player.physicalPower+30);
            System.out.println("Amazing!!! 🎉");
            System.out.println("You just earned "+ this.player.physicalPower + " Physical power");
        }else{
            System.out.println("Dude...you look miserable! Try again!");
        }
    }


    public void trainingChoices(){
        System.out.println("1. Do a math problem");
        System.out.println("2. Learn programming");
        System.out.println("3. Twerking!");
        System.out.println("4. Burpees! uh");

        int trainingChoices= in.nextInt();


        if(trainingChoices==1){
            this.calculating();
        }else if(trainingChoices==2){
            this.programming();
        }else if(trainingChoices==3){
            this.twerking();
        }else if(trainingChoices==4){
            this.burpees();
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

