package com.company.Enemy;

import com.company.Character.Player;
import com.company.Level;
import com.company.Skill.Flying;

public class Boss extends Enemy{


    public Boss( Level level, Player player){
        super(level, "Boss", 10, player, new Flying());

    }
    public void attack(Player player){
        super.attack();
        this.skill.useFlying(this, player);
        System.out.println("");

    }
}
