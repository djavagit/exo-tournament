package character;

import item.Item;

public class Viking extends Character{
    public Viking() {
        hp = 120;
        damage = 6;
    }

    @Override
    public Viking equip(String item) {
        return null;
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
