package com.company.Enemy;
import com.company.Character.Player;
import com.company.Level;
import com.company.Skill.Stomp;

public class Ghost extends Enemy {
 public Stomp skill;
    public Ghost( Level level, Player player){
        super(level, "Ghost", 10, player, new Stomp());

    }

    public void attack(Player player){
        this.skill.useStomp(this, player);
        System.out.println("");
        super.attack();
    }
}
