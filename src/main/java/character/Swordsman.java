package character;

import item.Item;

public class Swordsman extends Character {
    public Swordsman() {
        hp = 100;
        damage = 5;
    }

    public Swordsman(String vicious) {
        super();
    }

    @Override
    public Swordsman equip(String item) {
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
