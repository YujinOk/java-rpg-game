package com.company.Item;

public class Wearable extends Item{
    int defenseRate;
    public Wearable(int defenseRate, String name, int price){
        super(name, price);
        this.defenseRate=defenseRate;
    }
}
