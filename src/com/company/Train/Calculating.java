package com.company.Train;

import com.company.Character.Player;
import com.company.RandomGenerator;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.concurrent.atomic.AtomicBoolean;

public class Calculating{

    String question;
    Player player;
    String answer;
    String confirmationAnswer;
//    private AtomicBoolean running = new AtomicBoolean(false);
    public Calculating(Player player){
        this.question="\uD83D\uDC49 Mission: Write the sum of 58 + 32 within 10 sec! 👈 ";
        this.player=player;
    }

    public void think(){
        System.out.println("Hmm.....Let me think...🤔");
//        try{
//        Thread.sleep(1000);
//        }catch (Exception e){
//            Thread.currentThread().interrupt();
//            System.out.println(e);
//        }
    }

//    @Override
//    public void run(){
//        System.out.println(this.question);
//        this.getTheAnswer();
//        return;
//    }

    public void getTheAnswer(){
        System.out.println(this.question);
        this.think();
        if(RandomGenerator.randomGenerator(2)==1){
            this.answer="🙋‍ Answer: 90";
            System.out.println(this.answer);
            this.player.setIntelligence(this.player.intelligence+20);
            this.confirmationAnswer="Congrats! 🎉 you smartie! \u200D  you just earned "+ this.player.intelligence + " Intelligence";
            System.out.println(this.confirmationAnswer);

        }else{
            this.answer="Answer: " + RandomGenerator.randomGenerator(5);
            System.out.println(this.answer);
            this.confirmationAnswer="Wrong! FAILED! you loser! \uD83D\uDE29";
            System.out.println(confirmationAnswer);

        }
    }
}
