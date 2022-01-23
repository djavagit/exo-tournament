package character;

public abstract class Character {
    protected int damage;
    protected int hp;

    public abstract Character equip(String item);

    public void engage(Character enemy){
        while (hitPoints() > 0 && enemy.hitPoints() > 0){
            hit(enemy);
            enemy.hit(this);
        }
    }

    public void hit(Character enemy){
        enemy.takeDmg(getDamage());
    }

    public void takeDmg(int damage){
        if (damage > hitPoints()){
            hp = 0;
        } else {
            hp -= damage;
        }
    }

    public abstract int getDamage();
    public abstract int hitPoints();
}
