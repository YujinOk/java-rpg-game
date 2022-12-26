package com.company;

import com.company.Character.Player;
import com.company.Character.Princess;
import com.company.Enemy.Boss;
import com.company.Enemy.Enemy;

import java.util.Scanner;

public class GameStart {
    boolean game=true;
    Player player;
    Scanner in= new Scanner(System.in);
    Level level= new Level("Ground", 0, 0, 0);

    public GameStart(Player player){
        this.player=player;

    }



    public void askUserName(){
        System.out.println("Hiya! what's your name?");
        String userName = in.nextLine();
        System.out.println("Welcome to the game " + userName+ " 🤗");
        System.out.println("");
        System.out.println("Please pick your character?");
        System.out.println("1. Putin");
        System.out.println("2. Kim Jung Un");

        int characterType=in.nextInt();

        if(characterType==1){
            this.player.name="Putin";

        }else if(characterType==2){
            this.player.name="Kim Jung Un";

        }
    }

    public void attackChoices(Enemy enemy){
        while( game ){
            if(this.player.hp> 0 && enemy.hp>0){
                System.out.println("");
                System.out.println("1. Attack");
                System.out.println("2. Defense");
                System.out.println("3. Run away");

                int attackChoice=in.nextInt();
                if(attackChoice==1){
                    this.player.attack(enemy);

                    if (enemy.hp > 0) {
                        enemy.attack(this.player);

                    }

                }else if(attackChoice==2){
                    this.player.defense();
                }else{
//            Run away
                    return;
                }
            }else if(enemy.hp<=0 &&this.player.hp>0){
                enemy.isDead=true;

                this.player.hp+=10;
                this.player.exp++;
                this.player.money+=10;
                System.out.println("");
                System.out.println("\uD83C\uDF8A " + this.player.name+ " killed "+ enemy.name+ " \uD83C\uDF8A ");

                System.out.println("Exp: "+ this.player.exp);
                System.out.println("Money: $ "+ this.player.money);
                System.out.println("Hp: " + this.player.hp);
                System.out.println("Please don't forget to do training and rest to recharge your energy ‼️");
                this.player.energyFromRest-=5;
                this.player.energyFromFood-=5;
                break;
            }else{
                System.out.println("💀 "+ enemy.name+ " killed "+ this.player.name + " 💀");
                this.player.isDead=true;
                game=false;
            }

        }
    }

    public void attackChoicesWithStrongerEnemy(Enemy enemy){
        while(game && !this.player.isDead){
            if(this.player.hp> 0 && enemy.hp>0){
                System.out.println("");
                System.out.println("1. Attack");
                System.out.println("2. Skills");
                System.out.println("3. Protect");
                System.out.println("4. Run away");

                int attackChoice=in.nextInt();
                if(attackChoice==1){
                    this.player.attack(enemy);

                    if (enemy.hp > 0) {
                        enemy.attack(player);
                    }
                }else if(attackChoice==2){
                    this.player.superPower.useSuperPower(player,enemy);
                }else if(attackChoice==3){
                    this.player.defense();
                }else{
                    break;
                }
            }else if(enemy.hp<=0 &&this.player.hp>0){
                enemy.isDead=true;
                enemy.setHp(0);
                System.out.println("==========================================");
                System.out.println(player.name+ " HP: "+ player.hp);
                System.out.println(enemy.name+ " HP: "+ enemy.hp);
                this.player.hp+=10;
                this.player.exp++;
                this.player.money+=10;
                this.player.hasWon=true;
                System.out.println("");
                System.out.println("\uD83C\uDF8A " + this.player.name+ " killed "+ enemy.name+ " \uD83C\uDF8A ");
                System.out.println("👊 Now, you can go to catch the boss! 👊");
                System.out.println("Exp: "+ this.player.exp);
                System.out.println("Money: $ "+ this.player.money);
                System.out.println("Hp: " + this.player.hp);
                System.out.println("Please don't forget to do training and rest to recharge your energy ‼️");

                break;
            }else{
                System.out.println("💀 "+ enemy.name+ " killed "+ this.player.name + " 💀");
                this.player.isDead=true;
                game=false;
            }

        }
    }

    public void fightTheBoss(Boss boss){
        while(game && !this.player.isDead){
            if(this.player.hp>0 && boss.hp>0){
                System.out.println("");
                System.out.println("1. Attack");
                System.out.println("2. Magic");
                System.out.println("3. Protect");
                System.out.println("4. Run away");
                int attackChoice=in.nextInt();
                if(attackChoice==1){
                    this.player.attack(boss);

                    if (boss.hp > 0) {
                        boss.attack(player);
                    }
                }else if(attackChoice==2){
                    this.player.superPower.useSuperPower(player,boss);
                }else if(attackChoice==3){
                    this.player.defense();
                }else{
                    break;
                }
            }else if(boss.hp<=0 &&this.player.hp>0){
                boss.isDead=true;
                boss.setHp(0);
                System.out.println("==========================================");
                System.out.println(player.name+ " HP: "+ player.hp);
                System.out.println(boss.name+ " HP: "+ boss.hp);
                this.player.hp+=10;
                this.player.exp++;
                this.player.money+=10;
                this.player.hasWon=true;
                this.player.gotPrincess=true;
                System.out.println("");
                System.out.println("\uD83C\uDF8A " + this.player.name+ " killed "+ boss.name+ " \uD83C\uDF8A ");
                System.out.println("🎉 Congratulations!!! You can meet the princess!!!! 🎊");

                Princess princess= new Princess("Cinderella", true, true);
                princess.princessInfo();
                this.player.princessEncounter();
                System.out.println("When "+ princess.name+ " was about to kiss "+ this.player.name);
                System.out.println(this.player.name+ " ran away 🤣 🤣 🤣 🤣 🤣");
                System.out.println("############################ THE END #################################################");
                game=false;
                this.player.isDead=true;
            }else{
                System.out.println("💀 "+ boss.name+ " killed "+ this.player.name + " 💀");
                this.player.isDead=true;
                game=false;

            }
        }
    }
    public int randomGenerator(int max) {
        int result = 0;
        {
            int min = 1;
            int range = max - min + 1;
            // generate random numbers within 1 to 3
            for (int i = 0; i < 3; i++) {
                int rand = (int) (Math.random() * range) + min;
                result = rand;
            }

        }
        return result;
    }

}

