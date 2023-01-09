package com.company;

import com.company.Character.Player;
import java.security.SecureRandom;
public class Animal {
    public String name;
    Player player;
    boolean isFish;
    SecureRandom rand= new SecureRandom();
    public Animal(String [] animalNames,Player player, boolean isFish){
        String animalName=animalNames[rand.nextInt(animalNames.length)];
        this.name=animalName;
        this.player=player;
        this.isFish=isFish;
    }
    public void fishing(Player player) throws InterruptedException {
        Music fishSound = new Music("src/com/company/Music/footsteps-in-water-nature-sounds-8185.wav");
        fishSound.start();
      String text="Fishing is in progress...🎣";

      for(int i=0; i<text.length(); i++){
          System.out.print(text.charAt(i));
      }
        if(RandomGenerator.randomGenerator(2) == 1){
            System.out.println("Yay! I got "+ this.name);
            player.energyFromFood+=2;
            System.out.println(player.name+ " Energy: "+ player.energyFromFood);
        }else{
            System.out.println("Damn! fishing isn't going too well...😥");
        }
        Thread.sleep(3000);
        fishSound.stopPlaying();
    }

}