package rpg;

public class Hero extends Character {

    private int weapon;


    public int getWeapon() {
        return weapon;
    }

    public void setWeapon(int weapon) {
        this.weapon = weapon;

    }

    public Hero() {

    }

    public Hero(String name, int hp, int offense, int defense, int weapon) {
        super(name, hp, offense, defense);
        this.weapon = weapon;
    }

    @Override
    public void attack(Character opponent) {
        // (自分の攻撃力 + 自分の武器の強さ) - 相手の防御力 をダメージ量とする
        int damage = super.getOffense() + this.getWeapon() - opponent.getDefense();

        // ダメージ量の計算結果がプラスかどうか
        if(damage > 0) {
            // ダメージ量がプラスならダメージを与える
            opponent.setHp(opponent.getHp() - damage);
            System.out.println(super.getName() + "は" + opponent.getName() + "に" + damage + "のダメージを与えた！");
        } else {
            // ダメージ量が0以下ならミスにする
            System.out.println("ミス！" + super.getName() + "は" + opponent.getName() + "にダメージを与えられない！");
        }

    }

}
