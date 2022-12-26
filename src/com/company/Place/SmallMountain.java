package com.company.Place;

import com.company.Character.Player;
import com.company.GameStart;

public class SmallMountain extends Place{
    int height;
    public SmallMountain(Player player, int height, GameStart gameStart){
        super("", 0, 0, player, gameStart);
        this.height=height;
    }

    public void skateBoarding(){
        System.out.println("This is a perfect place to try skateboarding! Let me try \uD83D\uDEF9");
        if(this.randomGenerator(3)==1){
            System.out.println("BUT...you fell...and hurt yourself  from skateboarding \uD83D\uDE22");

            this.player.hp--;
            System.out.println(this.player.name+ " Hp: "+ this.player.hp);
        }else{
            System.out.println("");
            System.out.println("Yay! skateboarding is so much fun! I am loving it ☺️");
            this.player.hp++;
            System.out.println(this.player.name+ " Hp: "+ this.player.hp);


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
