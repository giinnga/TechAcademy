package l05;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileInput {

    public static void main(String[] args) {
        try {
            // ファイルを読み込みモードで開く
            InputStream is = new FileInputStream("test.txt");

            // ファイルから読み込む操作をするオブジェクトを生成する
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));

            // 1行分だけ取得
            String str = reader.readLine();

            // strが空っぽでなければ中身を表示して
            // さらに次の行の内容を取得
            while(str != null) {
                System.out.println(str);
                str = reader.readLine();
            }

            // ファイルを閉じる(readerとisの使用をやめる）
            reader.close();
            is.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
