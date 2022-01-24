package character;

import item.Buckler;
import item.Item;

public class Swordsman extends Character {
    public Swordsman() {
        super();
        hp = 100;
        damage = 5;
    }

    public Swordsman(String vicious) {
        super();
    }

    @Override
    public Swordsman equip(String item) {
        if (item.equals("buckler"))
            items.add(new Buckler());
        return this;
    }

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public int hitPoints() {
        return hp;
    }
}
