package com.company.Random;

import com.company.Character.Player;

import java.util.Scanner;

public class RandomMission extends RandomTreasure{
    int money;
    Scanner in= new Scanner(System.in);
    public RandomMission(int money, Player player){
        super("Pig poo",5, 5,player );
        this.money=money;
        this.player=player;
    }

    public void randomMissionSuccess(int money){
        this.player.money+=money;
        this.player.hp+=this.hpValue;
        this.player.energyFromFood+=this.energyValue;
        System.out.println("Yay! congrats!!! You just earned massive reward");
        System.out.println("┌─────────────────────────────────────────────────────────────────────┐");
        System.out.println("                Money: "+ this.player.money);
        System.out.println("                Hp: "+ this.player.hp);
        System.out.println("                Energy: "+ this.player.energyFromFood);

    }

    public void randomMissionFailure(){
        System.out.println("Sorry, You failed it!! \uD83D\uDE22");

    }
    public void burpeeSuccess(int money){

        this.player.money+=money;
        this.player.hp+=this.hpValue;
        this.player.physicalPower+=this.energyValue;
        System.out.println("Yay! congrats!!! You just earned massive reward");
        System.out.println("┌─────────────────────────────────────────────────────────────────────┐");
        System.out.println("                Money: "+ this.player.money);
        System.out.println("                Hp: "+ this.player.hp);
        System.out.println("                Physical power: " +this.player.physicalPower);
    }

    public void randomMissionChoices(){
        System.out.println("1. Eating pig poo");
        System.out.println("2. Kiss chicken butt");
        System.out.println("3. Drink kimchi beer");
        System.out.println("4. Do 100 burpees within 5 mins");

        int missionChoice= in.nextInt();
        if(missionChoice==1){
            if(randomGenerator(5)==3){
                this.randomMissionSuccess(50);
            }else{
                this.randomMissionFailure();
            }
        }else if(missionChoice==2){
            if(this.randomGenerator(5)==2){
                this.name="Chicken butt";
                this.randomMissionSuccess(50);
            }else{
                this.randomMissionFailure();
            }
        }else if(missionChoice==3){
            if(this.randomGenerator(5)==1){
                this.name="Kimchi beer";
                this.randomMissionSuccess(30);
            }else{
                this.randomMissionFailure();
            }
        }else if(missionChoice==4){
            if(this.randomGenerator(5)==4){
                this.name="Burpee master";
                this.burpeeSuccess(100);
            }else{
                this.randomMissionFailure();
            }
        }
    }
}

