package com.company.Skill;

import com.company.Character.Player;
import com.company.Enemy.Enemy;
import com.company.RandomGenerator;

public class Skill {
    public String skillName;
    int hpValue;

    public Skill(String skillName, int hpValue){
    this.skillName=skillName;
    this.hpValue=hpValue;
    }
    public void useKoPunch(Enemy enemy, Player player){
        if(RandomGenerator.randomGenerator(3)==1){
            System.out.println("");
            System.out.println("===========================================");
            System.out.println(enemy.name + " is using SKILL: "+ this.skillName);
            System.out.println(player.name+ " got knocked the fu** out!!! 🥊");
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
    public void useRoundHouseKick(Enemy enemy, Player player){
        if(RandomGenerator.randomGenerator(3)==1){
            System.out.println("");
            System.out.println("===========================================");
            System.out.println(enemy.name + " is using SKILL: "+ this.skillName);
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

    public void useStomp(Enemy enemy, Player player){
        if(RandomGenerator.randomGenerator(3)==1){
            System.out.println("");
            System.out.println("===========================================");
            System.out.println(enemy.name + " successfully used Skill: "+ this.skillName);
            System.out.println(player.name+ " got "+ this.hpValue+ " damage");
            player.hp-=this.hpValue;
            System.out.println("===========================================");
            if(player.hp>=0){
                player.setHp(0);
            }
            System.out.println(player.name+ " Hp: "+ player.hp);
            System.out.println(enemy.name+ " Hp: "+ enemy.hp);
//            System.out.println(enemy.name+ " Hp: "+ enemy.hp);

        }
    }
    public void useFlying(Enemy enemy, Player player){
        System.out.println("");
        if(RandomGenerator.randomGenerator(2)==2){

            System.out.println("");
            System.out.println("===========================================");
            System.out.println(enemy.name + " successfully hit "+ player.name+ " while flying ✈️");
            enemy.hp+=this.hpValue;
            player.hp-=this.hpValue;
            System.out.println(player.name+ " got "+ this.hpValue+ " damage");
            System.out.println("===========================================");
            if(player.hp>=0){
                player.setHp(0);
            }
            System.out.println(player.name+ " Hp: "+ player.hp);
            System.out.println(enemy.name+ " Hp: "+ enemy.hp);
        }

    }


    public void useUpperCut(Enemy enemy, Player player){
        if(RandomGenerator.randomGenerator(5)==1){
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
