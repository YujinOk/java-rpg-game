package com.company.Place;

import com.company.Character.Player;
import com.company.GameStart;

public class Ocean extends Place{


    public Ocean(Player player, GameStart gameStart ){

        super("", 1, 1, player, gameStart);
    }

    public void fishingEvent(){
        System.out.println("┌─────────────────────────────────────────────────────────────────────┐");
        System.out.println("                             Fishing Event! ");
        System.out.println("Welcome to the Fantasy Ocean! It's your lucky day!");
        System.out.println("If you are successful in fishing, you will get a bonus HP!");
        System.out.println("But if you happen to catch some deadly fish, you could lose your HP");
        System.out.println("Are you ready??? \uD83E\uDD29");
        System.out.println("");

//        Fish fish = new Fish(player);
//        fish.eatOrEaten();
    }
}