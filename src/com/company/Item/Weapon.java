package com.company.Item;

public class Weapon extends Item{
    int attackPower;
    public Weapon(int attackPower,String name, int price){
        super(name, price);
        this.attackPower=attackPower;
    }
}
