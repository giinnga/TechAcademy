package l05;

public class MathClassSample {

    public static void main(String[] args) {
        double flr = Math.floor(12.81);// 切り捨て
        double rnd = Math.round(12.81);// 四捨五入
        double cl = Math.ceil(12.81);// 切り上げ
        double pow = Math.pow(9, 2);// 累乗、べき乗
        double sqrt = Math.sqrt(144);// 平方根
        double rad = 10 * 10 * Math.PI;// 円周率及び面積

        System.out.println(flr);
        System.out.println(rnd);
        System.out.println(cl);
        System.out.println(pow);
        System.out.println(sqrt);
        System.out.println(rad);
    }

}
