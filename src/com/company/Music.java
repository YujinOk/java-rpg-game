package com.company;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public  class Music extends Thread{
    String filepath;
    boolean isPlaying;
     Clip clip;
    public Music(String filepath){
        this.filepath=filepath;
    }


    public void playMusic(String location){
        try{
            File musicPath= new File(location);

                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                this.clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();

        }catch(Exception e){
            System.out.println(e);
        }
    }

    public void stopPlaying(){
         clip.close();
         this.isPlaying=false;
//        Thread.currentThread().interrupt();
        return;
    }
    @Override
    public void run(){
        try{
          do {
              this.playMusic(filepath);
          }while(isPlaying);
        }catch(Exception e){
            System.out.println(e);

        }
    }


}
