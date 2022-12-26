package com.company.Skill;

import com.company.Character.Player;
import com.company.Enemy.Enemy;
import com.company.SuperPower.SuperPower;

public class Flying extends Skill{

    public Flying(){
        super("Flying",7);
    }

    public void useFlying(Player player, Enemy enemy){
        System.out.println("");
        if(super.randomGenerator(2)==2){
            System.out.println("");
            System.out.println(player.name + " successfully hit "+ enemy.name+ " while flying");
            player.hp+=this.hpValue;
            enemy.hp-=this.hpValue;
            System.out.println(enemy.name+ " hp: "+ enemy.hp);
        }else {
            System.out.println("");
            System.out.println(player.name + " failed using superpower");
            player.hp-=this.hpValue;
        }

    }
}
