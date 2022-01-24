package character;

import item.Axe;
import item.Buckler;
import item.Item;

public class Viking extends Character{
    public Viking() {
        super();
        hp = 120;
        damage = 6;
        items.add(new Axe());
    }

    @Override
    public Viking equip(String item) {
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
