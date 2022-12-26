package com.company.Enemy;
import com.company.Character.Player;
import com.company.Level;
import com.company.Skill.KoPunch;
import com.company.Skill.Skill;

public class Monster extends Enemy {
    public KoPunch skill;
    public Monster( Level level){
        super(level, "Monster",25);
        this.skill=new KoPunch();
    }

    public void attack(Player player){
        this.skill.useKoPunch(this, player);
        super.attack(player);
    }
}
