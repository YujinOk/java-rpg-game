package com.company.Enemy;

import com.company.Level;
import com.company.Skill.Skill;
import com.company.SuperPower.SuperPower;

public class Boss extends Enemy{

    Flying skill;
    public Boss( Level level){
        super(level, "Boss", 30);
        this.skill= new Flying()
    }
}
