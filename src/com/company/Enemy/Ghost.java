package com.company.Enemy;
import com.company.Character.Player;
import com.company.Level;
import com.company.Skill.Stomp;

public class Ghost extends Enemy {
 Stomp skill;
    public Ghost( Level level){
        super(level, "Ghost", 10);
        this.skill= new Stomp();
    }

    public void attack(Player player){
        this.skill.useStomp(this, player);
        System.out.println("");
        super.attack(player);
    }
}
