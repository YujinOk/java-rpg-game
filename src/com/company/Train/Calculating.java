package com.company.Train;

import com.company.Character.Player;
import com.company.RandomGenerator;
import jdk.swing.interop.SwingInterOpUtils;

public class Calculating extends Thread{

    String question;
    Player player;
    String answer;
    String confirmationAnswer;
    public Calculating(){
        this.question="\uD83D\uDC49 Mission: Write the sum of 58 + 32 within 10 sec! 👈 ";
    }

    public void think(){
        System.out.println("Hmm.....Let me think...🤔");
        try{
        Thread.sleep(1000);
        }catch (Exception e){
            System.out.println(e);
        }

    }

    @Override
    public void run(){
    this.getTheAnswer();
    }
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
