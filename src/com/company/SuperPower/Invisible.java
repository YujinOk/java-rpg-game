package com.company.SuperPower;

import com.company.Character.Player;
import com.company.Enemy.Enemy;

public class Invisible extends SuperPower{
    public Invisible(){
        super("Invisible", 7);
    }
    public void useInvisible(Player player, Enemy enemy){
        System.out.println("");
        if(super.randomGenerator(2)==2){
            System.out.println("");
            System.out.println(player.name + " made himself invisible");
            System.out.println(enemy.name+ " can't find "+ player.name);
            System.out.println(player.name + " beat the shit out of "+ enemy.name + " 🔥");
            player.hp+=this.hpValue;
            enemy.hp-=this.hpValue;
            System.out.println(enemy.name+ " hp: "+ enemy.hp);
        }else {
            System.out.println("");
            System.out.println(player.name + " couldn't fully make himself invisible timely");
            System.out.println("Due to poor timing, "+player.name+ " got hit by "+ enemy.name+ " 🤕");
            player.hp-=this.hpValue;
        }

    }

}
