package com.company;

import com.company.Character.Player;
import com.company.Character.Princess;
import com.company.Enemy.*;
import com.company.Item.Store;
import com.company.Place.Ocean;
import com.company.Place.SmallMountain;
import com.company.Place.TallMountain;
import com.company.Random.RandomMission;
import com.company.SuperPower.Invisible;
import com.company.SuperPower.StealHp;
import com.company.Train.Training;


import java.util.Scanner;

import static com.company.DayAndNight.night;
import static com.company.DayAndNight.battle;
public class Main {

    public static void main(String[] args) throws InterruptedException {
        boolean game = true;
        Scanner in = new Scanner(System.in);
        Level level = new Level("Ground", 0, 0, 0);
        Player player = new Player(0, level);
        RandomMission randMission = new RandomMission(0, player);
        Rest rest = new Rest(player);
        Training training = new Training(player);
        GameStart gameStart = new GameStart(player);
        Store store = new Store(player, gameStart);


        gameStart.askUserName();
        DayAndNight dayAndNight= new DayAndNight();
        dayAndNight.start();
        while (game && !player.isDead) {
            System.out.println("----------------------------------------------------------------------------------");
            System.out.println("1. Hunting");
            System.out.println("2. Training");
            System.out.println("3. Go to a store");
            System.out.println("4. Go to inventory");
            System.out.println("5. Pick a random mission");
            System.out.println("6. Take a rest");
            System.out.println("7. Change occupation");
            System.out.println("8. Catch the boss");
            System.out.println("9. Exit the game");

            System.out.println("----------------------------------------------------------------------------------");

            int menuChoices = in.nextInt();
            if (menuChoices == 1) {
                battle=true;
                System.out.println("1. Mountain");
                System.out.println("2. The ocean");

                int movingChoices = in.nextInt();
                if (movingChoices == 1) {
                    System.out.println("1. Big mountain");
                    System.out.println("2. Small mountain");

                    int mountainChoices = in.nextInt();
                    if (mountainChoices == 1) {
//                    call big mountain class
                        TallMountain tallMountain = new TallMountain(10, player, gameStart);
                        tallMountain.takeSnowDamage();
                        tallMountain.climbing();
                        Skeleton skeleton = new Skeleton(level, player);
                        System.out.println("Right then... " + skeleton.name + " appeared all of a sudden");
                        player.enemy = skeleton;
                        System.out.println("");

                            gameStart.attackChoices(player.enemy);
                            gameStart.join();
                           battle=false;

                    }
                    else if (mountainChoices == 2) {
//                    call small mountain class
                        SmallMountain smallMountain = new SmallMountain(player, 0, gameStart);
                        smallMountain.skateBoarding();
                        Clown clown = new Clown(level, player);
                        System.out.println("Right then... " + clown.name + " appeared all of a sudden");
//                            tallMountain.enemyAppearance(skeleton);
//                                Clown clown = new Clown(level, player);
                        player.enemy = clown;
                        System.out.println("");
                        gameStart.attackChoices(player.enemy);
                        battle=false;
                    }

                } else if (movingChoices == 2) {
//                call the ocean class
                    Ocean ocean = new Ocean(player, gameStart);
                    ocean.fishingEvent();
                    if (player.hp > 0 && !player.isDead) {
                        Ghost ghost = new Ghost(level, player);
//                        ocean.enemyAppearance(ghost);
                        System.out.println("Right then... " + ghost.name + " appeared all of a sudden");
//                            tallMountain.enemyAppearance(skeleton);
//                                Clown clown = new Clown(level, player);
                        player.enemy = ghost;
                        System.out.println("");
                        gameStart.attackChoices(player.enemy);
                        battle=false;
                    }
                }

            }else if (menuChoices == 2) {
                if(night){
                    System.out.println("You can't train at night, please go rest to recover your energy 💤");
                }else{
                    training.trainingChoices();
                }

            } else if (menuChoices == 3) {
//            Store class
                store.storeChoice();

            } else if (menuChoices == 4) {
//            Inventory class
                player.inventoryChoice();
            } else if (menuChoices == 5) {
//            Random mission
                randMission.randomMissionChoices();

            } else if (menuChoices == 6) {
                if(night){
                    rest.restChoices();
                    night=false;
                }else{
                    System.out.println("Please go train yourself and rest later at night!");
                }


            } else if (menuChoices == 7) {
                if (player.upgradeTheLevel()) {

                    Monster monster = new Monster(level, player);
                    Invisible invisible = new Invisible();
                    player.superPower = invisible;
                    player.enemy=monster;
                    player.seeMyInfo(player.superPower);
                    monster.enemyInfo(monster.skill);
                    gameStart.attackChoices(player.enemy);
                    if(monster.isDead){
                        player.hasWon=true;
                        System.out.println("");
                        System.out.println("👊 Now, you can go to catch the boss! 👊");
                    }
                }
            } else if (menuChoices == 8) {
//                  Catch the boss
                if (!player.hasWon) {
                    System.out.println("⛔️ You are not eligible to catch the boss yet⛔️");
                    System.out.println("Please go back to change your occupation to fight the strongest enemies 🤕");
                } else {
                    Boss boss = new Boss(level, player);
                    player.enemy=boss;
                    boss.enemyInfo(boss.skill);
                    StealHp stealHp = new StealHp();
                    player.superPower = stealHp;
                    player.seeMyInfo(player.superPower);
                    gameStart.attackChoices(player.enemy);

                    if(player.enemy.isDead){
                        player.hasWon=true;
                        player.gotPrincess=true;
                        System.out.println("");
                        System.out.println("🎉 Congratulations!!! You can meet the princess!!!! 🎊");

                        Princess princess= new Princess("Cinderella", true, true);
                        princess.princessInfo();
                        player.princessEncounter();
                        System.out.println("When "+ princess.name+ " was about to kiss "+ player.name);
                        System.out.println(player.name+ " ran away 🤣 🤣 🤣 🤣 🤣");
                        System.out.println("############################ THE END #################################################");
                        game=false;
                    }
                }

            } else {
                System.out.println("Sorry to let you go, see you next time! \uD83D\uDC4B");
                game = false;
            }
        }
    }
}