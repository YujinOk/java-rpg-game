package com.company.Train;

import com.company.Character.Player;
import com.company.RandomGenerator;

public class Programming extends Training{

    public Programming(Player player){
        super(player);
        this.question="\uD83D\uDC49 Mission: make one variable within 10 sec!  👈";
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
        if(RandomGenerator.randomGenerator(2)==1){
            this.answer="Answer: boolean amIdumb = true; ";

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

        }else{
            this.answer="Answer: boolean amIhandsome = true;";
            for(int i=0; i<this.answer.length(); i++){
                Thread.sleep(90);
                System.out.print(this.answer.charAt(i));
            }
            System.out.print("\n");

            this.confirmationAnswer="Wrong! FAILED! you loser! \uD83D\uDE29";
            System.out.println(confirmationAnswer);

        }
    }


}
