package character;

import item.Axe;
import item.Buckler;
import item.Item;

import java.util.ArrayList;

public abstract class Character {
    protected int damage;
    protected int hp;
    protected ArrayList<Item> items;

    public Character() {
        this.items = new ArrayList<Item>();
    }

    public abstract Character equip(String item);

    public void engage(Character enemy){
        while (hitPoints() > 0 && enemy.hitPoints() > 0){
            hit(enemy);
            enemy.hit(this);
        }
    }

    public void hit(Character enemy){
        Boolean willAttack = true;
        Buckler buckler = enemy.getBuckler();

        if (buckler != null){
            if (buckler.getHp() <= 0)
                enemy.destroyBuckler();
            else {
                willAttack = !buckler.getBlock();
                buckler.takeHit(hasAxe());
            }
        }

        if(willAttack)
            enemy.takeDmg(getDamage());
    }

    private void destroyBuckler() {
        for(Item i : items){
            if (i instanceof Buckler) {
                items.remove(i);
                return;
            }
        }
    }

    public void takeDmg(int damage){
        if (damage > hitPoints()){
            hp = 0;
        } else {
            hp -= damage;
        }
    }

    public Buckler getBuckler(){
        for(Item i : items){
            if (i instanceof Buckler)
                return (Buckler) i;
        }
        return null;
    }
    public Boolean hasAxe(){
        for(Item i : items){
            if (i instanceof Axe)
                return true;
        }
        return false;
    }

    public abstract int getDamage();
    public abstract int hitPoints();
}
