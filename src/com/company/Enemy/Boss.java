package com.company.Enemy;

import com.company.Character.Player;
import com.company.Level;
import com.company.Skill.Flying;

public class Boss extends Enemy{

    public Flying skill;
    public Boss( Level level, Player player){
        super(level, "Boss", 20, player);
        this.skill= new Flying();
    }
    public void attack(Player player){
        super.attack();
        this.skill.useFlying(this, player);
        System.out.println("");

    }
}
