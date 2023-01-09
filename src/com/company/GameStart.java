package com.company;

import com.company.Character.Player;
import com.company.Character.Princess;
import com.company.Enemy.Boss;
import com.company.Enemy.Enemy;

import java.util.Scanner;

public class GameStart extends Thread{

    Player player;
    Scanner in= new Scanner(System.in);
    Level level= new Level("Ground", 0, 0, 0);
  static boolean canAttack=false;
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

    public void attackChoices(Enemy enemy) throws InterruptedException {
        boolean game=true;
        enemy.start();

        Thread coolTime= new Thread(new Runnable() {
            @Override
            public void run() {
                int timetoWait=1;
                try{
                    for(int i=0; i<2; i++){
                        timetoWait++;
                        Thread.sleep(1000);
                    }

                }catch(Exception e){
                    return;
                }
                if(timetoWait>=2){
                    canAttack=true;
                }else{
                    canAttack=false;
                }
            }
        });
        coolTime.start();
        Music punch = new Music("src/com/company/Music/fist-punch-or-kick-7171.wav");
        while( game  && !player.isDead){
            System.out.println("");
            System.out.println("1. Attack 2. Use superpower 3. Heal 4. Run away");
            System.out.println("");
            int battleChoice= in.nextInt();
            if(enemy.hp<=0 &&this.player.hp>0){
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
                enemy.interrupt();
                break;
            }else if(enemy.hp>0 && this.player.hp<=0){
                System.out.println("💀 "+ enemy.name+ " killed "+ this.player.name + " 💀");
                this.player.isDead=true;
                break;
            }
            if(battleChoice==1){
                if(!canAttack){
                    System.out.println("⛔️ You need to wait 2 sec to attack again!");
                }else{
                    player.attack();
                }

            }else if(battleChoice==2){
//                print "using superpower"
                if(player.superPower==null){
                    System.out.println("You don't have any superpower yet");
                }else{
                    this.player.superPower.useSuperPower(player,enemy);
                }
                coolTime.interrupt();
            }else if(battleChoice==3){
                player.defense();
                coolTime.interrupt();
            }else{
                coolTime.interrupt();
                break;
            }
        }

    }

    public void attackChoicesWithStrongerEnemy(Enemy enemy) throws InterruptedException {
        boolean game=true;
        enemy.start();
        while(game && !this.player.isDead){
            if(this.player.hp> 0 && enemy.hp>0){
                System.out.println("");
                System.out.println("1. Attack");
                System.out.println("2. Skills");
                System.out.println("3. Protect");
                System.out.println("4. Run away");

                int attackChoice=in.nextInt();
                if(attackChoice==1){
                    this.player.attack();

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
                System.out.println("");

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
                enemy.interrupt();
                break;
            }else{
                System.out.println("💀 "+ enemy.name+ " killed "+ this.player.name + " 💀");
                enemy.interrupt();
                this.player.isDead=true;
                game=false;
            }

        }
    }

    public void fightTheBoss(Boss boss){
        boolean game=true;
        while(game && !this.player.isDead){
            if(this.player.hp>0 && boss.hp>0){
                System.out.println("");
                System.out.println("1. Attack");
                System.out.println("2. Magic");
                System.out.println("3. Protect");
                System.out.println("4. Run away");
                int attackChoice=in.nextInt();
                if(attackChoice==1){
//                    this.player.attack(enemy);

                    if (boss.hp > 0) {
                        boss.attack();
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
                System.out.println("");
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


}

