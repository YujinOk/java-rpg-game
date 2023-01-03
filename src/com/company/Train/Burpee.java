package com.company.Train;

import com.company.Character.Player;
import com.company.RandomGenerator;

public class Burpee extends Training{

    public Burpee(Player player){
        super(player);
        this.question="\uD83D\uDC49 Mission: Non stop Burpees for 1 min!  👈 ";
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

//    public void burpees(){
//        System.out.println();
//        if(RandomGenerator.randomGenerator(2)==1){
//            this.player.setPhysicalPower(this.player.physicalPower+30);
//            System.out.println("Amazing!!! ");
//            System.out.println("You just earned "+ this.player.physicalPower + " Physical power");
//        }else{
//            System.out.println("Dude...you look miserable! Try again!");
//        }
//    }

    public void getTheAnswer() throws InterruptedException {
//        this.think();
        if(RandomGenerator.randomGenerator(2)==1){
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

        }else{
            this.answer="Failed ;;" ;
            for(int i=0; i<this.answer.length(); i++){
                Thread.sleep(90);
                System.out.print(this.answer.charAt(i));
            }
            System.out.print("\n");

            this.confirmationAnswer="Not sexy enough..failed! \uD83D\uDE29";
            System.out.println(confirmationAnswer);

        }
    }
}
