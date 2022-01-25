package character;

import item.Armor;
import item.Axe;
import item.Buckler;
import item.GreatSword;

public class Highlander extends Character{
    static int baseHp = 150;
    private boolean isVeteran;

    public Highlander(String veteran) {
        super();
        hp = baseHp;
        weapon = new GreatSword();
        isVeteran = veteran.equals("Veteran");
    }

    public Highlander() {
        super();
        hp = baseHp;
        weapon = new GreatSword();
        isVeteran = false;
    }

    @Override
    public Character equip(String item) {
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
        if (isVeteran() && isUnder30percent())
            return super.getDamage() * 2;
        return super.getDamage();
    }

    public Boolean isUnder30percent(){
        return hp < (baseHp * 0.3);
    }

    public boolean isVeteran() {
        return isVeteran;
    }
}
