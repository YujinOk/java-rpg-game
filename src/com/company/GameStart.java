package com.company;

import com.company.Character.Player;
import com.company.Enemy.Enemy;

import java.util.Scanner;

public class GameStart extends Thread{

    Player player;
    Scanner in= new Scanner(System.in);
    Level level= new Level("Ground", 0, 0, 0);
boolean inBattle=false;
  static boolean canAttack=false;
    public GameStart(Player player){
        this.player=player;

    }
    public void askUserName() throws InterruptedException {
        System.out.println("Hiya! what's your name?");
        String userName = in.nextLine();
        System.out.println("Welcome to the game " + userName+ " 🤗");
        System.out.println("");
        System.out.println("Please pick your character?");
        System.out.println("1. Putin");
        System.out.println("2. Kim Jung Un");

        int characterType=in.nextInt();
        String s ="███████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████\n";
        for (int i = 0; i < s.length(); i++) {
            Thread.sleep(10);
            System.out.print( s.charAt(i) );
        }
        Thread.sleep(100);
        System.out.println("\n");
        System.out.println("🥳 Game begins! 🥳");
        if(characterType==1){
            this.player.name="Putin";

        }else if(characterType==2){
            this.player.name="Kim Jung Un";

        }
    }

    public void attackChoices(Enemy enemy) throws InterruptedException {
        boolean game=true;
//        Thread.sleep(2000);
        enemy.start();

        Thread coolTime= new Thread(new Runnable() {
            @Override
            public void run() {

              while(inBattle){
                  try{
                      for(int i=0; i<5; i++){

                          Thread.sleep(1000);
                      }
                  }catch(Exception e){
                      System.out.println("HI");
                      return;
                  }
                  canAttack=true;

              }

            }
        });
        inBattle=true;
        coolTime.start();
        System.out.println(canAttack);

        while( game  || !player.isDead){
            System.out.println("");
            System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
            System.out.println("   1. Attack    2. Superpower   3. Defense   4. Run away    ");
            System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
            System.out.println("");
            int battleChoice= in.nextInt();
            if(enemy.hp<=0 &&this.player.hp>0){
                enemy.isDead=true;
                this.player.hp+=10;
                this.player.exp++;
                this.player.money+=10;
                System.out.println("");
                Music happy= new Music("src/com/company/Music/success-fanfare-trumpets-6185.wav");
                happy.start();
                System.out.println("\uD83C\uDF8A " + this.player.name+ " killed "+ enemy.name+ " \uD83C\uDF8A ");
                System.out.println("Exp: "+ this.player.exp);
                System.out.println("Money: $ "+ this.player.money);
                System.out.println("Hp: " + this.player.hp);
                this.player.energyFromRest-=5;
                this.player.energyFromFood-=5;
                Thread.sleep(3000);
                happy.stopPlaying();
                inBattle=false;
                coolTime.join();
                enemy.interrupt();
                break;
            }else if(enemy.hp>0 && this.player.hp<=0){
                System.out.println("💀 "+ enemy.name+ " killed "+ this.player.name + " 💀");
                this.player.isDead=true;
                inBattle=false;
                coolTime.join();
                break;
            }
            if(battleChoice==1){
//                System.out.println(canAttack);
                if(!canAttack){
                    System.out.println("⛔️ You need to wait 2 sec to attack again!");
                }else{
                    player.attack();
                    canAttack=false;
                }

            }else if(battleChoice==2){
//                print "using superpower"
                if(player.superPower==null){
                    System.out.println("You don't have any superpower yet");
                }else{
                    this.player.superPower.useSuperPower(player,enemy);
                }

            }else if(battleChoice==3){
                player.defense();

            }else {
                game=false;
//                coolTime.interrupt();
//                enemy.interrupt();
                enemy.hasRunaway=true;
                inBattle=false;
                coolTime.join();
                enemy.join();

                break;
            }
        }
        enemy.join();
        coolTime.join();

    }



}

