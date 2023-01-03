package com.company.Character;

import com.company.Enemy.Enemy;
import com.company.Level;
import com.company.RandomGenerator;
import com.company.Skill.Skill;

public class Character extends Thread {
    public String name;
    public int hp;
    public int exp;
    public boolean isDead= false;
    int damageTaken=0;
    protected int attackPower;
    public int defenseRate;
    public int money;
    public Level level;
    public boolean game=true;
    Skill skill;
    public Character(String name, int hp, int exp, int attackPower, int defenseRate, int money, Level level){
        this.name=name;
        this.hp=hp;
        this.exp=exp;
        this.attackPower=attackPower;

        this.defenseRate=defenseRate;
        this.money=money;
        this.level=level;
        this.isDead=false;

    }

    public void setHp(int hp){
        this.hp=hp;
    }

    public void setMoney(int money){
        this.money=money;
    }
    public void setExp(int exp){
        this.exp=exp;
    }
    public void setIsDead(boolean isDead){
        this.isDead=isDead;
    }


//    public void attack(Character opponent) {
//
//        System.out.println("         " + this.name + " Attack!");
//        System.out.println("==========================================");
//
////        this.attackWithAttackPower(opponent);
//
//        if(this.isHpZero()){
//            opponent.exp++;
//            opponent.money+=10;
//            System.out.println(opponent.name+ " killed "+ this.name);
//            System.out.println(opponent.name+" Exp: 1 EXP");
//            System.out.println(opponent.name+ " Money: $ "+ opponent.money);
//            this.setIsDead(true);
//            this.setMoney(10);
//            this.setExp(1);
//
//        }else if(opponent.isHpZero()){
//            this.exp++;
//            this.money+=10;
//            System.out.println("hi");
//            System.out.println(this.name+ " killed "+ opponent.name);
//            System.out.println(this.name+ " Exp: "+ this.exp);
//            System.out.println(this.name+ " Money: $ "+ this.money);
//
////            this.upgradeTheLevel();
////            if(this.level.name=="Gold"&& opponent.isDead){
////                Princess princess = new Princess("Fiona (Shrek)", "Ugly", true, "Unknown");
////                princess.thankYouForSaving();
////            }
//            opponent.setIsDead(true);
////            Ocean ocean = new Ocean();
////            ocean.setGame(false);
//        }else{
//            opponent.hp-=RandomGenerator.randomGenerator(3);
//            System.out.println(this.name + " HP: "+ this.hp);
//            System.out.println(opponent.name + " HP: " + opponent.hp);
//            System.out.println("--------------------------------------------");
//        }
//    }


    public boolean isHpZero(){
        if(this.hp<=0){
            this.setHp(0);
            this.isDead=true;
            this.setIsDead(true);
        }
        return this.isDead;
    }

    public int defense() {
        System.out.println("========================================");
//        System.out.println(this.name + " Defense!");
        int randomHp = RandomGenerator.randomGenerator(4);
//        if(this.defenseRate>0){
//            this.hp+=randomHp;
//            System.out.println(this.name + " recovered!");
//        }
        if(randomHp == 3 || randomHp == 4){
            this.hp += randomHp;
            System.out.println(this.name + " recovered!");
//            System.out.println("Hp: "+ this.hp);
        } else {
            System.out.println("You haven't recovered yet, Fight harder 👊");
        }

        System.out.println("========================================");
        System.out.println(this.name + " HP is : " + this.hp);
        System.out.println("========================================");
        return this.hp;

    }


    public void run(Enemy enemy){

    };

    public void run(Player player){

    };
}
