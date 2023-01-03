package com.company.Enemy;

import com.company.Character.Player;
import com.company.Level;
import com.company.Skill.KoPunch;

public class Monster extends Enemy {
    public KoPunch skill;
    public Monster( Level level, Player player){
        super(level, "Monster",10, player);
        this.skill=new KoPunch();
    }

    public void attack(Player player){
        this.skill.useKoPunch(this, player);
        System.out.println("");
        super.attack();
    }
}
