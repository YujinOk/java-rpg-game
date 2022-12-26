package com.company;

import com.company.Character.Player;
import com.company.Enemy.*;
import com.company.Item.Store;
import com.company.Place.Ocean;
import com.company.Place.SmallMountain;
import com.company.Place.TallMountain;
import com.company.Random.RandomMission;
import com.company.Skill.KoPunch;
import com.company.Skill.Skill;
import com.company.Skill.Stomp;
import com.company.SuperPower.SuperPower;

import java.security.SecureRandom;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        boolean game= true;
        Scanner in= new Scanner(System.in);
        Level level= new Level("Ground", 0 , 0, 0);

        Player player = new Player(0, level);
        RandomMission randMission= new RandomMission(0, player);
        Rest rest = new Rest(player);
        Training training = new Training(player);
        GameStart gameStart= new GameStart(player);
        Store store = new Store(player, gameStart);

        SecureRandom rand = new SecureRandom();
        String []superPowerList={"Flying", "Invisible", "Stealing enemy's hp"};
        String superPowerName=superPowerList[rand.nextInt(superPowerList.length)];
        gameStart.askUserName();

        while(game && !player.isDead){
            System.out.println("----------------------------------------------------------------------------------");
            System.out.println("1. Moving");
            System.out.println("2. Training");
            System.out.println("3. Go to a store");
            System.out.println("4. Go to inventory");
            System.out.println("5. Pick a random mission");
            System.out.println("6. Take a rest");
            System.out.println("7. Change occupation");
            System.out.println("8. Catch the boss");
            System.out.println("9. Exit the game");

            System.out.println("----------------------------------------------------------------------------------");

            int menuChoices=in.nextInt();
            if(menuChoices==1){
                System.out.println("1. Mountain");
                System.out.println("2. The ocean");

                int movingChoices=in.nextInt();
                if(movingChoices==1){
                    System.out.println("1. Big mountain");
                    System.out.println("2. Small mountain");

                    int mountainChoices=in.nextInt();
                    if(mountainChoices==1){
//                    call big mountain class
                        TallMountain tallMountain= new TallMountain(10, player, gameStart);
                        tallMountain.takeSnowDamage();
                        tallMountain.climbing();
                        if(player.hp>0 && !player.isDead){
                            Skeleton skeleton = new Skeleton(level);
                            tallMountain.enemyAppearance(skeleton);
                        }

                    }else if(mountainChoices==2){
//                    call small mountain class
                        SmallMountain smallMountain= new SmallMountain(player, 0, gameStart);
                        smallMountain.skateBoarding();
                        if(player.hp>0 && !player.isDead){
                            Clown clown = new Clown(level);
                            smallMountain.enemyAppearance(clown);

                        }
                    }
                }else if(movingChoices==2){
//                call the ocean class
                    Ocean ocean = new Ocean(player, gameStart);
                    ocean.fishingEvent();
                    if(player.hp>0 && !player.isDead){
                        Ghost ghost = new Ghost(level);
                        ocean.enemyAppearance(ghost);
                    }
                }
            }else if(menuChoices==2){
                training.trainingChoices();
            }else if(menuChoices==3){
//            Store class
                store.storeChoice();

            }else if(menuChoices==4){
//            Inventory class
                player.inventoryChoice();
            }else if(menuChoices==5){
//            Random mission
                randMission.randomMissionChoices();

            }else if(menuChoices==6){

                rest.restChoices();

            }else if(menuChoices==7) {
                if(player.upgradeTheLevel()){

               Monster monster= new Monster(level);

                    player.seeMyInfo();
                    monster.enemyInfo(monster.skill);
                    gameStart.attackChoices(monster);
                }
            } else if(menuChoices==8){
//                  Catch the boss
                if(!player.hasWon){
                    System.out.println("⛔️ You are not eligible to catch the boss yet⛔️");
                    System.out.println("Please go back to change your occupation to fight the strongest enemies 🤕");
                }else{
                    Boss boss = new Boss(level);
                    boss.enemyInfo(boss.skill);
                    player.seeMyInfo();
                    gameStart.fightTheBoss(boss);

                }

            } else{
                System.out.println("Sorry to let you go, see you next time! \uD83D\uDC4B");
                game=false;
            }
        }

    }

}

