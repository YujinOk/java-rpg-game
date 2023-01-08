package com.company.Train;

import com.company.Character.Player;

public class Programming extends Training{

    public Programming(Player player){
        super(player);
        this.type="intelligence";

        this.question="\uD83D\uDC49 Mission: make one variable within 10 sec!  👈";
        this.answer="Answer: boolean amIdumb = true; ";
        this.filePath="src/com/company/Music/type-writing-6834.wav";
        this.confirmationAnswer="Congrats! 🎉 you smartie! \u200D  you just earned 20 intelligence";
    }

//    @Override
//    public void run(){
//        System.out.println(this.question);
//        try {
//            this.getTheAnswer();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        return;
//    }


//    public void getTheAnswer() throws InterruptedException {
////        this.think();
////        if(RandomGenerator.randomGenerator(2)==1){
//
//
//        Music typingSound = new Music("src/com/company/Music/type-writing-6834.wav");
//        typingSound.start();
//        for(int i=0; i<this.answer.length(); i++){
//            Thread.sleep(90);
//            System.out.print(this.answer.charAt(i));
//        }
//        typingSound.stopPlaying();
//
//        System.out.print("\n");
////            typing.join();
//        this.player.setIntelligence(this.player.intelligence+20);
//        this.confirmationAnswer="Congrats! 🎉 you smartie! \u200D  you just earned "+ this.player.intelligence + " Intelligence";
//        System.out.println(this.confirmationAnswer);
//
////        }
////        else{
////            this.answer="Answer: " + RandomGenerator.randomGenerator(5);
////            for(int i=0; i<this.answer.length(); i++){
////                Thread.sleep(90);
////                System.out.print(this.answer.charAt(i));
////            }
////            System.out.print("\n");
////
////            this.confirmationAnswer="Wrong! FAILED! you loser! \uD83D\uDE29";
////            System.out.println(confirmationAnswer);
////
////        }
//    }


}
