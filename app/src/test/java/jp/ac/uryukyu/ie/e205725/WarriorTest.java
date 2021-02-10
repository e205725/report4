package jp.ac.uryukyu.ie.e205725;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WarriorTest{
    @Test
    void attackWithWeponSkill(){
        int WarriorAttack = 100;
        int attackWithWeponSkillDamage =(int)(WarriorAttack*1.5);
        Warrior Warrior2 = new Warrior("勇者2",10,WarriorAttack);
        Enemy slime = new Enemy("スライム2",1000,100);
        for (int i=0;i<3;i++){
            int beforeAttackEnemyHp = slime.getHitPoint();
            Warrior2.attackWithWeponSkill(slime);
            int afterAttackEnemyHp = slime.getHitPoint();
            assertEquals(attackWithWeponSkillDamage, beforeAttackEnemyHp - afterAttackEnemyHp);  
        }
    }
}