package com.company.Enemy;

import com.company.Character.Character;
import com.company.Character.Player;
import com.company.Level;
import com.company.Skill.Skill;

public class Enemy extends Character {
    Player player;
  public boolean hasRunaway=false;
  public Skill skill;
    public Enemy(Level level, String name, int hp, Player player, Skill skill){
        super(name, hp, 0,0,0,0,level);
        this.player=player;
        this.skill=skill;

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
                if(this.hp<=0 || this.player.hp<=0 || this.hasRunaway){
                    game=false;
                    break;
                }
                this.attack();
                Thread.sleep(3000);

            }catch (Exception e){
//                System.out.println("You need wait 2 sec to attack again!");
            }
        }
    }
    public void attack(){

        System.out.println("");
        System.out.println("         " + this.name + " Attack!");
        System.out.println("==========================================");

//        if(this.player.defenseRate>0){
//            this.player.hp-= RandomGenerator.randomGenerator(1);
//        }
//        else{
//            this.player.hp-=RandomGenerator.randomGenerator(2);
//        }
//        if(this.name=="Boss"){
//           this.skill.useFlying(this, player);
//        }else if(this.name=="Clown"){
//            this.skill.useUpperCut(this, player);
//        }else if(this.name=="Ghost"){
//            this.skill.useStomp(this, player);
//        }else if(this.name=="Monster"){
//            this.skill.useKoPunch(this, player);
//        }

    }
}
