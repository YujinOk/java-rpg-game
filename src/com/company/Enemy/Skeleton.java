package com.company.Enemy;
import com.company.Character.Player;
import com.company.Level;
import com.company.Skill.RoundHouseKick;
import com.company.Skill.Skill;

public class Skeleton extends Enemy {
 RoundHouseKick skill;
    public Skeleton( Level level){
        super(level, "Skeleton", 10);
        this.skill=new RoundHouseKick();
    }

    public void attack(Player player){
        this.skill.useRoundHouseKick(this, player);
        System.out.println("");
        super.attack(player);
    }
}
