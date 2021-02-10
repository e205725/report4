package jp.ac.uryukyu.ie.e205725;

public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    public LivingThing(String name,int maximumHP,int attack){
        this.name = name;
        this.attack = attack;
        hitPoint = maximumHP;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, hitPoint, attack);

    }
    /**
     * フィールドに指定された敵の名前を、取り出すメソッド
     * @return this.name フィールドに指定された敵の名前
     */
    public String getName (){
        return this.name;
    }
    /**
     * フィールドに指定された敵の名前に、任意の敵の名前を代入するメソッド
     * @param name　任意の敵の名前（名前）
     */
    public void setName(String name){
        this.name = name;
    }
    /**
     * フィールドに指定された敵のHPを、取り出すメソッド
     * @return this.hitpoint  フィールドに指定された敵のHP
     */
    public int getHitPoint (){
        return this.hitPoint;
    }
    /**
     * フィールドに指定された敵のHPに、任意の敵のHPを代入するメソッド
     * @param hitpoint　任意の敵のHP
     */
    public void setHitPoint (int hitPoint){
        this.hitPoint = hitPoint;
    }
    /**
     * フィールドに指定された敵の攻撃力を、取り出すメソッド
     * @return this.attack  フィールドに指定された敵の攻撃力
     */
    public int getAttack (){
        return this.attack;
    }
     /**
     * フィールドに指定された敵の攻撃力に、任意の敵の攻撃力を代入するメソッド
     * @param attack　任意の敵の攻撃力
     */
    public void setAttack(int attack){
        this.attack = attack;
    }
       /**
     * フィールドに指定された敵の生死状態を、取り出すメソッド
     * @return this.dead  フィールドに指定された敵の生死状態
     */
    public boolean isDead (){
        return this.dead;
    }
    /**
     * フィールドに指定された敵の生死状態に、任意の敵の生死状態を代入するメソッド
     * @param attack　任意の敵の生死状態
     */
    public void setDead(boolean dead){
        this.dead = dead;
    }
    
    public void attack(LivingThing opponet){
        if (hitPoint > 0){
            int damage = (int)(Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponet.getName(), damage);
            opponet.wounded(damage);
        }
    }

    
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }
     
}
