
public class SevenNumber {

    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++) {
            if(i % 7 == 0 || i % 10 == 7 || i / 10 == 7) {
                System.out.println("clap!");
            } else {
                System.out.println(i);
            }
        }

        // 繰り返し処理に利用するため、配列を準備
        int [] scores = {47, 55, 88, 100, 74};
        int sum = 0;
        double average = 0.0;

        // for文にて記述した場合
        for( int i = 0; i < scores.length; i++ ){
            sum = sum + scores[i];
        }

       // 拡張for文にて記述した場合
        for (int data : scores) {
            sum = sum + data;
        }

        // 平均点の算出（キャストあり）
        average = (double) sum / scores.length;

        // 合計点と平均点の出力
        System.out.println("合計点は、" + sum + "点、平均点は、" + average + "点です。");

        int[] targetArray = { 37, 85, 64, 57, 98, 100, 47, 23, 71, 69 };

        // 検索値を指定
        int search = 100;

        // カウンタ変数を宣言
        int i ;

        // 配列の全要素を対象に探す
        for (i = 0; i < targetArray.length; i++ ) {
            if( search ==  targetArray[i] ){
                break;
            }
        }

        // 検索結果の判定
        if( i >= targetArray.length ){
            System.out.println("対象のデータが見つかりませんでした！");
        } else {
            System.out.println("添え字" + i + "に対象のデータが見つかりました！");
        }

        int[] targetArray2 = { 37, 85, 64, 57, 98, 100, 47, 23, 71, 69 };

        // 変数の宣言
        int count = 0;

        // 配列の全要素を対象に探す
        for (int value : targetArray2) {
            if (value < 60) {
                continue;
            }

            // 変数のカウントアップ
            count++;
        }

        // 60以上の人数を表示
        System.out.println("60点以上の人は、" + count + "人です。");
    }



    }

