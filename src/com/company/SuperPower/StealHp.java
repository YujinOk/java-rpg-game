package com.company.SuperPower;

import com.company.Character.Player;
import com.company.Enemy.Enemy;

public class StealHp extends SuperPower{

    public StealHp(){
        super("StealHp",10);
    }

    public void useStealHp(Player player, Enemy enemy){
        if(super.randomGenerator(2)==1 ){
            System.out.println("");
            System.out.println("You are successful in stealing "+ enemy.name + " 10 hp ⚡️");
            enemy.hp-=this.hpValue;
            player.hp+=this.hpValue;
            System.out.println(enemy.name+ " hp: "+ enemy.hp);
        }else{
            System.out.println("");
            System.out.println("Ops, awkward! You failed to steal "+ enemy.name+ " hp 😪");
            player.hp-=this.hpValue;
            System.out.println(enemy.name+ " hp: "+ enemy.hp);
        }
    }
}
