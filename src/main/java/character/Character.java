package character;

import item.Armor;
import item.Axe;
import item.Buckler;
import item.Weapon;


public abstract class Character {
    protected Buckler buckler;
    protected Armor armor;
    protected Weapon weapon;
    protected int hp;


    public abstract Character equip(String item);

    public void engage(Character enemy){
        int i = 1;
        System.out.println(weapon instanceof Axe);
        while (hitPoints() > 0 && enemy.hitPoints() > 0){
            System.out.println("tour " + i);
            hit(enemy);
            System.out.println("s -> h Swordsman " + hitPoints() + ", Highlander " + enemy.hitPoints());
            enemy.hit(this);
            System.out.println("s <- h Swordsman " + hitPoints() + ", Highlander " + enemy.hitPoints());
            i++;
        }
    }

    public void hit(Character enemy){
        Boolean willAttack = true;
        Buckler buckler = enemy.getBuckler();
        int damageInflicted = getDamage();

        //treating buckler
        if (buckler != null){
            if (buckler.getHp() <= 0)
                enemy.destroyBuckler();
            else if(damageInflicted>0) {
                willAttack = !buckler.getBlock();
                buckler.takeHit(hasAxe());
            }
        }

        //treating armors
        if(hasArmor())
            damageInflicted -= armor.getDamageInflictedReduction();
        if (enemy.hasArmor()) {
            damageInflicted -= enemy.getArmor().getDamageTakenReduction();
        }

        if(willAttack)
            enemy.takeDmg(damageInflicted);
    }

    private void destroyBuckler() {
        buckler = null;
    }

    public void takeDmg(int damage){
        if (damage<0)
            damage = 0;
        if (damage > hitPoints()){
            hp = 0;
        } else {
            hp -= damage;
        }
    }

    public Buckler getBuckler(){
        return buckler;
    }
    public Boolean hasAxe(){
        return weapon instanceof Axe;
    }
    public Boolean hasArmor(){
        return armor != null;
    }
    public Armor getArmor() {
        return armor;
    }

    public int getDamage(){
        return weapon.getDamage();
    }
    public int hitPoints(){
        return hp;
    }
}
