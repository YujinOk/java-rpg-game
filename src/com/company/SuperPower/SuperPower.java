package com.company.SuperPower;

import com.company.Character.Player;
import com.company.Enemy.Enemy;

public class SuperPower {
    public String name;
    int hpValue;

    public SuperPower(String name, int hpValue){
    this.name=name;
    this.hpValue=hpValue;
    }

  public void useSuperPower(Player player, Enemy enemy){
      System.out.println("");
      if(this.randomGenerator(2)==2){
          System.out.println(player.name + " successfully used superpower: "+ this.name);
          System.out.println(enemy.name+ " got "+ this.hpValue+ " damage");
          player.hp+=this.hpValue;
          enemy.hp-=this.hpValue;
      }else {
          System.out.println("");
          System.out.println(player.name + " failed to use superpower 🤕");
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
