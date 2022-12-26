package com.company.Enemy;

import com.company.Character.Player;
import com.company.Level;
import com.company.Skill.Flying;
import com.company.Skill.Skill;
import com.company.SuperPower.SuperPower;

public class Boss extends Enemy{

    public Flying skill;
    public Boss( Level level){
        super(level, "Boss", 20);
        this.skill= new Flying();
    }
    public void attack(Player player){
        super.attack(player);
        this.skill.useFlying(this, player);
        System.out.println("");

    }
}
