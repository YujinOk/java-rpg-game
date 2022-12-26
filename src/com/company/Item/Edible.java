package com.company.Item;

public class Edible extends Item{
    int energyRecovery;
    public Edible(int energyRecovery, String name, int price){
        super(name,price);
        this.energyRecovery=energyRecovery;
    }
}
