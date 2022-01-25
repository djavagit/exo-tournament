package character;

import item.Armor;
import item.Axe;
import item.Buckler;
import item.Sword;

public class Swordsman extends Character {
    private int poison;

    public Swordsman() {
        super();
        hp = 100;
        weapon = new Sword();
        poison = 0;
    }

    public Swordsman(String vicious) {
        super();
        hp = 100;
        weapon = new Sword();
        poison = 2;
    }

    @Override
    public Swordsman equip(String item) {
        if (item.equals("buckler"))
            buckler = new Buckler();
        if (item.equals("armor"))
            armor = new Armor();
        if (item.equals("axe")){
            weapon = new Axe();
        }
        return this;
    }

    @Override
    public int getDamage() {
        if (poison > 0) {
            poison--;
            return super.getDamage() + 20;
        }
        else return super.getDamage();
    }
}
