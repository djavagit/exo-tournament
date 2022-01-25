package character;

import item.Armor;
import item.Axe;
import item.Buckler;

public class Viking extends Character{
    public Viking() {
        super();
        hp = 120;
        weapon = new Axe();
    }

    @Override
    public Viking equip(String item) {
        if (item.equals("buckler"))
            buckler = new Buckler();
        if (item.equals("armor"))
            armor = new Armor();
        if (item.equals("axe")){
            weapon = new Axe();
        }
        return this;
    }
}
