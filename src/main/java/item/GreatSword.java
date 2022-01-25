package item;

public class GreatSword extends Weapon {
    private int cooldown;

    public GreatSword() {
        damage = 12;
        cooldown = 0;
    }

    @Override
    public int getDamage() {
        int res = damage;
        if (cooldown == 2)
            res = 0;
        cooldown = (cooldown + 1) % 3;
        return res;
    }
}
