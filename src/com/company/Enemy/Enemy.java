package com.company.Enemy;

import com.company.Character.Character;
import com.company.Character.Player;
import com.company.Level;
import com.company.RandomGenerator;
import com.company.Skill.Skill;

public class Enemy extends Character {
    Player player;

    public Enemy(Level level, String name, int hp, Player player){
        super(name, hp, 0,0,0,0,level);
        this.player=player;
    }


    public void enemyInfo(Skill skill){
        System.out.println("------------------Enemy's Info----------------------");
        System.out.println("Name: "+ this.name);
        System.out.println("Skill: "+ skill.skillName);
        System.out.println("");
    }




    @Override
    public void run() {
        game=true;
        while(game){
            try{
                this.attack();
                Thread.sleep(2000);
                if(this.hp<=0 || this.player.hp<=0){
                    game=false;
                    break;
                }
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
    public void attack(){
        System.out.println("");
        System.out.println("         " + this.name + " Attack!");
        System.out.println("==========================================");

        if(this.player.defenseRate>0){
            this.player.hp-= RandomGenerator.randomGenerator(1);
        }
        else{
            this.player.hp-=RandomGenerator.randomGenerator(2);
        }
        System.out.println(this.name + " HP: "+ this.hp);
        System.out.println(this.player.name + " HP: " + this.player.hp);
    }
}
