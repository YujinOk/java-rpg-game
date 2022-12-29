package com.company.Skill;

import com.company.Character.Player;
import com.company.Enemy.Enemy;
import com.company.SuperPower.SuperPower;

public class Flying extends Skill{

    public Flying(){
        super("Flying",7);
    }

    public void useFlying(Enemy enemy,Player player){
        System.out.println("");
        if(super.randomGenerator(2)==2){

            System.out.println("");
            System.out.println("===========================================");
            System.out.println(enemy.name + " successfully hit "+ player.name+ " while flying ✈️");
            enemy.hp+=this.hpValue;
            player.hp-=this.hpValue;
            System.out.println(player.name+ " got "+ this.hpValue+ " damage");
            System.out.println("===========================================");
            if(player.hp>=0){
                player.setHp(0);
            }
            System.out.println(player.name+ " Hp: "+ player.hp);
            System.out.println(enemy.name+ " Hp: "+ enemy.hp);
        }

    }
}
