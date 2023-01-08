package com.company.Train;

import com.company.Character.Player;

public class Burpee extends Training{

    public Burpee(Player player){
        super(player);
        this.type="physical";
        this.question="\uD83D\uDC49 Mission: Non stop Burpees for 1 min!  👈 ";
        this.answer="Oh damn! I got this!👊  \n\n Success! 😎";
        this.filePath="src/com/company/Music/runningonroad-56198.wav";
        this.confirmationAnswer="Congrats! 🎉 great job! \u200D  you just earned 20 physical power";
    }



//


//    public void getTheAnswer() throws InterruptedException {
////        this.think();
////        if(RandomGenerator.randomGenerator(2)==1){
//
//
//
//        Music exercise= new Music();
//        exercise.start();
//        Thread.sleep(2000);
//            for(int i=0; i<this.answer.length(); i++){
//                Thread.sleep(90);
//                System.out.print(this.answer.charAt(i));
//            }
//            System.out.print("\n");
//       exercise.stopPlaying();
//            this.player.setPhysicalPower(this.player.physicalPower+20);
//            this.confirmationAnswer="Amazing!!! You just earned "+ this.player.physicalPower + " physical power 🎊";
//            System.out.println(this.confirmationAnswer);
//
////        }else{
////            this.answer="Failed ;;" ;
////            for(int i=0; i<this.answer.length(); i++){
////                Thread.sleep(90);
////                System.out.print(this.answer.charAt(i));
////            }
////            System.out.print("\n");
////
////            this.confirmationAnswer="Not sexy enough..failed! \uD83D\uDE29";
////            System.out.println(confirmationAnswer);
////
////        }
//    }
}
