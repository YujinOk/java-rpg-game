package com.company.Train;

import com.company.Character.Player;

public class Calculating extends Training{
    String question;
    Player player;
    String answer;
    String confirmationAnswer;
//    Music typing = new Music(new File("../Music/Keyboard-Typing.mp3"),true);
//    private AtomicBoolean running = new AtomicBoolean(false);
    public Calculating(Player player){
        super(player);
        this.question="\uD83D\uDC49 Mission: Write the sum of 58 + 32 within 10 sec! 👈 ";
        this.player=player;
    }

    public void think(){
        System.out.println("Hmm.....Let me think...🤔");
        try{
        Thread.sleep(90);
        }catch (Exception e){
            Thread.currentThread().interrupt();
            System.out.println(e);
        }

    }

    @Override
    public void run(){
        System.out.println(this.question);
        this.think();
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
            this.answer="Answer: 90";

//            typing.start();
            for(int i=0; i<this.answer.length(); i++){
                Thread.sleep(90);
                System.out.print(this.answer.charAt(i));
            }
            System.out.print("\n");
//            typing.join();
            this.player.setIntelligence(this.player.intelligence+20);
            this.confirmationAnswer="Congrats! 🎉 you smartie! \u200D  you just earned "+ this.player.intelligence + " Intelligence";
            System.out.println(this.confirmationAnswer);

//        }
//        else{
//            this.answer="Answer: " + RandomGenerator.randomGenerator(5);
//            for(int i=0; i<this.answer.length(); i++){
//                Thread.sleep(90);
//                System.out.print(this.answer.charAt(i));
//            }
//            System.out.print("\n");
//
//            this.confirmationAnswer="Wrong! FAILED! you loser! \uD83D\uDE29";
//            System.out.println(confirmationAnswer);
//
//        }
    }

}
