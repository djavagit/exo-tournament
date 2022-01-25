package character;

import item.Armor;
import item.Buckler;
import item.Sword;

public class Swordsman extends Character {
    public Swordsman() {
        super();
        hp = 100;
        weapon = new Sword();
    }

    public Swordsman(String vicious) {
        super();
    }

    @Override
    public Swordsman equip(String item) {
        if (item.equals("buckler"))
            buckler = new Buckler();
        if (item.equals("armor"))
            armor = new Armor();
        return this;
    }
}
