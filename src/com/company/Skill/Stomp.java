package com.company.Skill;

import com.company.Character.Player;
import com.company.Enemy.Enemy;

public class Stomp extends Skill{
    public Stomp(){
        super("Stomp", 3);
    }

    public void useStomp(Enemy enemy, Player player){
        if(super.randomGenerator(3)==1){
            System.out.println(enemy.name + " successfully used Skill: "+ this.skillName);
            System.out.println(player.name+ " got "+ this.hpValue+ " damage");
            player.hp-=this.hpValue;

        }
    }
}
