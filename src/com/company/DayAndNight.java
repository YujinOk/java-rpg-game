package com.company;

public class DayAndNight extends Thread {
    static boolean night = false;
    static boolean battle=false;


    @Override
    public void run() {

        try {
            while(true){
                int counter=0;
                for (int l = counter; l< 20; l++) {
                    if (l== 19) {
                        this.night = true;
                      if(!battle){
                          System.out.println("🌙 It's night. Please get some rest! 🌙");
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