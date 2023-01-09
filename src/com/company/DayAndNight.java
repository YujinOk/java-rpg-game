package com.company;

public class DayAndNight extends Thread {
    static boolean night = false;
    static boolean battle=false;


    @Override
    public void run() {

        try {
            while(true){
                int counter=0;
                int totalLoops=40;
                for (int l = counter; l< totalLoops; l++) {
                    if (l== totalLoops-1) {
                        this.night = !this.night;
                      if(!battle){
                       if(this.night){
                           System.out.println("🌙 It's night. Please get some rest! 🌙");
                       }else{
                           System.out.println("☀️ Good day mate! get some training! ☀️");
                       }
                      }
                    }
                    Thread.sleep(1000);
                }
            }


        } catch (Exception e) {
            return;
        }
    }

}