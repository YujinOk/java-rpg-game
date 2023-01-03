package com.company.Enemy;

import com.company.Character.Player;
import com.company.Level;
import com.company.Skill.UpperCut;

public class Clown extends Enemy {
 UpperCut skill;
    public Clown( Level level, Player player){
        super(level, "Clown", 10, player);
        this.skill=new UpperCut();
    }

    public void attack(){
        this.skill.useUpperCut(this, player);
        System.out.println("");
        super.attack();
    }
}
