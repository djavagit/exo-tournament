package character;

import item.Armor;
import item.Buckler;
import item.GreatSword;

public class Highlander extends Character{
    public Highlander(String veteran) {
        super();
    }

    public Highlander() {
        super();
        hp = 150;
        weapon = new GreatSword();
    }

    @Override
    public Character equip(String item) {
        if (item.equals("buckler"))
            buckler = new Buckler();
        if (item.equals("armor"))
            armor = new Armor();
        return this;
    }

}
