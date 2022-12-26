package com.company.SuperPower;

public class SuperPower {
    String superpower;
    int hpValue;

    public SuperPower(String superpower, int hpValue){
    this.superpower=superpower;
    this.hpValue=hpValue;
    }

    public int randomGenerator(int max) {
        int result = 0;
        {
            int min = 1;
            int range = max - min + 1;
            // generate random numbers within 1 to 3
            for (int i = 0; i < 3; i++) {
                int rand = (int) (Math.random() * range) + min;
                result = rand;
            }

        }
        return result;
    }
}
