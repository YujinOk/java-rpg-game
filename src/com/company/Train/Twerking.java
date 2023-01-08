package com.company.Train;

import com.company.Character.Player;

public class Twerking extends Training{

    public Twerking(Player player){
       super(player);
       this.type="physical";
       this.question=" \uD83D\uDC49  Mission: Twerking for 10 sec!  👈 ";
        this.answer="Oh damn! I got this!👊  \n\n Success! 😎";
       this.filePath="src/com/company/Music/old-school-hip-hop-drumloop-2-87bpm-128285.wav";
        this.confirmationAnswer="Congrats! 🎉 great job! \u200D  you just earned 20 physical power";
    }

//    public void twerking(){
//
//        if(RandomGenerator.randomGenerator(2)==1){
//            this.player.setPhysicalPower(this.player.physicalPower+30);
//            System.out.println("Hell yah! 🎉 you got the Kim kardashian ASS \uD83D\uDD25");
//            System.out.println("You just earned "+ this.player.physicalPower + " Physical power");
//        }else{
//            System.out.println("Lame! you failed! try harder!!! \uD83D\uDE29");
//        }
//    }


//    public void getTheAnswer() throws InterruptedException {
////        this.think();
////        if(RandomGenerator.randomGenerator(2)==1){
//
//
//
//    Music dance= new Music();
//    dance.start();
//    Thread.sleep(2000);
//            for(int i=0; i<this.answer.length(); i++){
//                Thread.sleep(90);
//                System.out.print(this.answer.charAt(i));
//            }
//            System.out.print("\n");
//    dance.stopPlaying();
//            this.player.setPhysicalPower(this.player.physicalPower+20);
//            this.confirmationAnswer="Amazing!!! You just earned "+ this.player.physicalPower + " physical power 🎊";
//            System.out.println(this.confirmationAnswer);
//
////        }
////        else{
////            this.answer="Failed ;;" ;
////            for(int i=0; i<this.answer.length(); i++){
////                Thread.sleep(90);
////                System.out.print(this.answer.charAt(i));
////            }
////            System.out.print("\n");
////
////            this.confirmationAnswer="You are too tired to complete... \uD83D\uDE29";
////            System.out.println(confirmationAnswer);
////
////        }
//    }


}
