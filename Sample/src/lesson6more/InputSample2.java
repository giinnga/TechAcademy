package lesson6more;

import java.util.Scanner;

public class InputSample2 {

    public static void main(String[] args) {
        // 標準入力を使うための準備
        Scanner scanner = new Scanner(System.in);

        // 入力を求める文言を表示
        System.out.println("数値を入力してください：");

        // 標準入力から文字列を取得
        int num = Integer.parseInt(scanner.nextLine());

        // 文字列を表示
        System.out.println("2倍した数値は" + num * 2 + "です");

        // 標準入力の使用を終えるための処理
        scanner.close();
    }
}