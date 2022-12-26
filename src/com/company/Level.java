package com.company;

public class Level {
    public String name;
    int requiredIntelligence;
    int requiredPhysicalPower;
    int requiredExp;

    public Level(String name, int requiredIntelligence, int requiredPhysicalPower, int requiredExp){
        this.name=name;
        this.requiredIntelligence=requiredIntelligence;
        this.requiredPhysicalPower=requiredPhysicalPower;
        this.requiredExp=requiredExp;
    }

//    public String setName(String name){
//        return this.name=name;
//    }
//
//    public int setIntelligence(int intelligence){
//        return this.intelligence=intelligence;
//    }
//
//    public int setPhysicalPower(int physicalPower){
//        return this.physicalPower=physicalPower;
//    }
//
//    public int setCurExp(int exp){
//        return this.exp=exp;
//    }


}