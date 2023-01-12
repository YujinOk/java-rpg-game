package com.company.Random;

import com.company.Character.Player;
import com.company.Music;

public class RandomTreasure {
    public String name;
    public int hpValue;
    public int energyValue;
    Player player;



    public RandomTreasure(String name, int hpValue, int energyValue, Player player){
        this.name=name;
        this.hpValue=hpValue;
        this.energyValue=energyValue;
        this.player=player;
    }

    public void increaseHp(){
        System.out.println("\uD83D\uDECE️ Treasure ");
        System.out.println("You got "+ this.name);
        System.out.println("Congrats!!!");
        player.hp+=this.hpValue;
        System.out.println("You earned extra "+ this.hpValue+ " hp!");
        System.out.println(player.name + " HP:"+ player.hp);
    }

    public void decreaseHp(){
        System.out.println("\uD83D\uDECE️ Treasure ");
        System.out.println("You got "+ this.name);
        System.out.println("Sucker \uD83E\uDD23 !!!");
        player.hp-=this.hpValue;
        System.out.println("You lost "+ this.hpValue+ " hp!");
        System.out.println(player.name + " HP:"+ player.hp);
    }

    public void increaseEnergyByFood() throws InterruptedException {
        System.out.println("\uD83D\uDECE️ Treasure \uD83D\uDECE️");
        String yumText="You got "+ this.name + "Eat some! 😋";

        Music bonusSound= new Music("src/com/company/Music/success-1-6297.wav");
        bonusSound.start();
        for(int i=0; i<yumText.length(); i++){
            System.out.print(yumText.charAt(i));
        }
        Thread.sleep(2000);
        bonusSound.stopPlaying();

        player.energyFromFood+=this.energyValue;
        System.out.println("");
        System.out.println("You earned extra "+ energyValue+ " energy!");
        System.out.println(player.name + " Energy: "+ player.energyFromFood);
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

