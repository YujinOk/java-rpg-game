package com.company.Enemy;

import com.company.Character.Player;
import com.company.Level;
import com.company.Skill.RoundHouseKick;

public class Skeleton extends Enemy {
 RoundHouseKick skill;
    public Skeleton( Level level, Player player){
        super(level, "Skeleton", 10, player, new RoundHouseKick());

    }

    public void attack(Player player){
        this.skill.useRoundHouseKick(this, player);
        System.out.println("");
        super.attack();
    }
}
