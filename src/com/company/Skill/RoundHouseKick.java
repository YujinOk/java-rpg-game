package com.company.Skill;

import com.company.Character.Player;
import com.company.Enemy.Enemy;

public class RoundHouseKick extends Skill{
    public RoundHouseKick(){
        super("Roundhouse Kick",2);
    }

    public void useRoundHouseKick(Enemy enemy, Player player){
        if(super.randomGenerator(3)==1){
            System.out.println(enemy.name + " is using SKILL: "+ this.skillName);
            System.out.println(player.name+ " got "+ this.hpValue+ " damage");
            player.hp-=this.hpValue;
        }
    }
}
