public class ArithmeticOperations {

    public static void main(String[] args) {
        // 変数の宣言・初期化
        int num1 = 100; // int型変数num1を宣言し、100を代入
        int num2 = 10; // int型変数num2を宣言し、10を代入

        // 5つの計算結果を格納するための配列を宣言・初期化
        int[] results = new int[5];

        // 各計算結果を配列に格納
        results[0] = num1 + num2;
        results[1] = num1 - num2;
        results[2] = num1 * num2;
        results[3] = num1 / num2;
        results[4] = num1 % num2;

     // 各計算結果を出力
        System.out.println("num1 + num2 = " + results[0]);
        System.out.println("num1 - num2 = " + results[1]);
        System.out.println("num1 * num2 = " + results[2]);
        System.out.println("num1 / num2 = " + results[3]);
        System.out.println("num1 % num2 = " + results[4]);

    }

}