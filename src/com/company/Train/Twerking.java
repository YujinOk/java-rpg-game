package com.company.Train;

import com.company.Character.Player;
import com.company.RandomGenerator;

public class Twerking extends Training{

    public Twerking(Player player){
       super(player);
       this.question=" \uD83D\uDC49  Mission: Twerking for 10 sec!  👈 ";
    }

    public void twerking(){

        if(RandomGenerator.randomGenerator(2)==1){
            this.player.setPhysicalPower(this.player.physicalPower+30);
            System.out.println("Hell yah! 🎉 you got the Kim kardashian ASS \uD83D\uDD25");
            System.out.println("You just earned "+ this.player.physicalPower + " Physical power");
        }else{
            System.out.println("Lame! you failed! try harder!!! \uD83D\uDE29");
        }
    }

    @Override
    public void run(){
        System.out.println(this.question);
        try {
            this.getTheAnswer();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return;
    }


    public void getTheAnswer() throws InterruptedException {
//        this.think();
//        if(RandomGenerator.randomGenerator(2)==1){
            this.answer="Success! 😎";


//            typing.start();
            for(int i=0; i<this.answer.length(); i++){
                Thread.sleep(90);
                System.out.print(this.answer.charAt(i));
            }
            System.out.print("\n");
//            typing.join();
            this.player.setPhysicalPower(this.player.physicalPower+20);
            this.confirmationAnswer="Amazing!!! You just earned "+ this.player.physicalPower + " physical power 🎊";
            System.out.println(this.confirmationAnswer);

//        }
//        else{
//            this.answer="Failed ;;" ;
//            for(int i=0; i<this.answer.length(); i++){
//                Thread.sleep(90);
//                System.out.print(this.answer.charAt(i));
//            }
//            System.out.print("\n");
//
//            this.confirmationAnswer="You are too tired to complete... \uD83D\uDE29";
//            System.out.println(confirmationAnswer);
//
//        }
    }


}
