package com.company.Place;

import com.company.Character.Player;
import com.company.GameStart;
import com.company.Music;
import com.company.RandomGenerator;

public class Mountain extends Place{
    boolean hasSnow=false;


    public Mountain(boolean hasSnow, Player player, GameStart gameStart){
        super("", 0, 0, player, gameStart);
        this.hasSnow=hasSnow;

    }



    public void takeSnowDamage() throws InterruptedException {
        if(this.hasSnow){
            Music rain = new Music("src/com/company/Music/rain-and-thunder-113218.wav");

            this.difficulty+=1;
            System.out.println("Oh damn! it's too cold ❄️");
            rain.start();

            System.out.println("🪫 You are losing your energy 🪫");
            player.hp--;
            System.out.println(player.name + " Hp: "+ player.hp);
            System.out.println("------------------------------------");
            Thread.sleep(3000);
            rain.stopPlaying();
        }
    }

    public void friendsOrBeKilled(){
        if(RandomGenerator.randomGenerator(5)==1){
            this.running();
        }else if(RandomGenerator.randomGenerator(5)==2){
            this.slappingWithTail();
        } else {
            this.becomingFriends();
        }
    }

    public void running(){
        System.out.println(this.name + "is running towards "+ player.name + " super fast!!!");
        if(RandomGenerator.randomGenerator(5)==2){
            this.killedPlayer();
        }
    }

    public void slappingWithTail(){
        System.out.println(this.name + " has slapped the fuck out of "+ player.name + " with its tail");
        if(RandomGenerator.randomGenerator(5)==2){
            this.killedPlayer();
        }
    }

    public void becomingFriends(){
        System.out.println("They ended up becoming good friends");
        System.out.println(player.name + " is feeling loved ❤️");
    }
}
