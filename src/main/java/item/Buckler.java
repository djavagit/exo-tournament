package item;

public class Buckler {
    private int hp;
    private Boolean block;

    public Buckler() {
        hp = 3;
        block = true;
    }

    public void takeHit(Boolean hasAxe){
        if(block && hasAxe){
            hp--;
        }
        block = !block;
    }

    public int getHp() {
        return hp;
    }

    public Boolean getBlock() {
        return block;
    }
}
