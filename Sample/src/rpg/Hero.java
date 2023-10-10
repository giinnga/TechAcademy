package rpg;

public class Hero extends Character {

    private int wepon;


    public int getwepon() {
        return wepon;
    }

    public void setWeapon(int wepon) {
        this.wepon = wepon;

    }

    public Hero() {

    }

    public Hero(String name, int hp, int offense, int defense, int wepon) {
        super(name, hp, offense, defense);
        this.wepon = wepon;
    }

}
