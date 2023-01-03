package com.company.Skill;

import com.company.Character.Player;
import com.company.Enemy.Enemy;

public class UpperCut extends Skill{

    public UpperCut(){
        super("Upper Cut", 1);
    }

    public void useUpperCut(Enemy enemy, Player player){
        if(super.randomGenerator(3)==1){
            System.out.println("");
            System.out.println("===========================================");
            System.out.println(enemy.name + " successfully used "+ this.skillName);
            System.out.println(player.name+ " got "+ this.hpValue+ " damage");
            player.hp-=this.hpValue;
            System.out.println("===========================================");
            if(player.hp>=0){
                player.setHp(0);
            }
            System.out.println(player.name+ " Hp: "+ player.hp);
            System.out.println(enemy.name+ " Hp: "+ enemy.hp);

        }
    }
}
