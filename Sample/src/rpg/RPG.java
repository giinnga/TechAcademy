package rpg;

import rpg.Enemy;
import rpg.Hero;

public class RPG {

    public static void main(String[] args) {
        // 勇者と敵のキャラクターを生成
        Hero hero = new Hero("勇者", 10, 5, 3, 1);
        Enemy slime = new Enemy("スライム", 5, 2, 2, "スライム");

        //hero.attack(slime);    //勇者がスライムに攻撃する
        //slime.attack(hero);     //スライムが勇者に攻撃する

        hero.magic_attack(slime);

    }

}
