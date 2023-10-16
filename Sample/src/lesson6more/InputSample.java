package lesson6more;

import java.util.Scanner;

public class InputSample {

    public static void main(String[] args) {
        // 標準入力を使うための準備
        Scanner scanner = new Scanner(System.in);

        // 入力を求める文言を表示
        System.out.println("名前を入力してください：");

        // 標準入力から文字列を取得
        String name = scanner.nextLine();

        // 文字列を表示
        System.out.println("こんにちは、" + name + "さん！");

        // 標準入力の使用を終えるための処理
        scanner.close();
    }
}
