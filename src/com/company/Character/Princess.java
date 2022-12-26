package com.company.Character;

public class Princess {

    public String name;
    boolean isFat;
    boolean isSmelly;

    public Princess(String name, boolean isFat, boolean isSmelly){
        this.name=name;
        this.isFat=isFat;
        this.isSmelly=isSmelly;
    }

    public void princessInfo(){
        System.out.println("");
        System.out.println("Name: "+ this.name);
        System.out.println("Physical features: approximately 100kg");
        System.out.println("Characteristics: quite smelly...🤮");
        System.out.println("");
    }
}