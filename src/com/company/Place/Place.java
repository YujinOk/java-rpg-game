package com.company.Place;

import com.company.Animal;
import com.company.Character.Player;
import com.company.Enemy.Enemy;
import com.company.GameStart;

public class Place {
    String name;
    int difficulty;
    int danger;
    Player player;

    GameStart gameStart;
    boolean game=false;
    Animal animal;

    public Place(String name, int difficulty, int danger,  Player player, GameStart gameStart){
        this.name=name;
        this.difficulty=difficulty;
        this.danger=danger;
        this.player=player;
        this.gameStart=gameStart;

    }

    public void enemyAppearance(Enemy opponent){
        System.out.println("----------------------------------------------------------------------");

        if(this.difficulty>0){
            opponent.hp+=this.difficulty;
        }
        System.out.println("Right then... "+opponent.name + " appeared all of a sudden");
        System.out.println("----------------------------------------------------------------------");

        this.gameStart.attackChoices(opponent);
    }

    public void killedPlayer(){
        player.isDead=true;
        player.hp=0;
        player.energyFromRest=0;
        player.energyFromFood=0;
        System.out.println( player.name + " got killed by " + this.name+ " \uD83D\uDC80");
        game=false;
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
