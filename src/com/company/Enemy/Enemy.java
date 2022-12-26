package com.company.Enemy;

import com.company.Character.Character;
import com.company.Character.Player;
import com.company.Level;
import com.company.Skill.Skill;

public class Enemy extends Character {

    public Enemy(Level level, String name, int hp){
        super(name, hp, 0,0,0,0,level);
    }


    public void enemyInfo(Skill skill){
        System.out.println("------------------Enemy's Info----------------------");
        System.out.println("Name: "+ this.name);
        System.out.println("Skill: "+ skill.skillName);
        System.out.println("");
    }

    public void attack(Player player){
        System.out.println("");
        System.out.println("         " + this.name + " Attack!");
        System.out.println("==========================================");

        if(player.defenseRate>0){
            player.hp-=this.randomGenerator(1);
        }
        else{
            player.hp-=this.randomGenerator(2);
        }
        System.out.println(this.name + " HP: "+ this.hp);
        System.out.println(player.name + " HP: " + player.hp);
    }
}
