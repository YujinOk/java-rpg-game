package com.company;

public class FightTime extends Thread {
    public int time=0;
    private boolean stop= true;


    @Override
    public void run(){
        while(stop){
            try{
                time++;

                sleep(1000);
                if(this.time==5 ) {
                    System.out.println("");
                    System.out.println("10 sec has been passed.\n");
                    System.out.println("You failed in killing the enemy.(press any key to go back)\n");
                    stop=false;
                    break;
                }
            }catch(Exception e){
                return;
            }
        }
    }
}
