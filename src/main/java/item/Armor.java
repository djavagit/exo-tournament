package item;

public class Armor {
    private int damageInflictedReduction, damageTakenReduction;

    public Armor() {
        damageInflictedReduction = 1;
        damageTakenReduction = 3;
    }

    public int getDamageInflictedReduction() {
        return damageInflictedReduction;
    }

    public int getDamageTakenReduction() {
        return damageTakenReduction;
    }
}
