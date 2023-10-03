
public class Triangle {

    public static void main(String[] args) {
        int a = 8;
        int b = 5;
        int c = 5;

        if(a == b && b == c) {
            System.out.println("正三角形です");
        } else if(a == b || b == c || a == c) {
            System.out.println("二等辺三角形です");
        } else {
            System.out.println("不等辺三角形です");
        }

        int score = 100; // 成績

        int rank = score / 10; // ランクの算出

        switch(rank){
        case 0 :
        case 1 :
        case 2 :
        case 3 :
        case 4 :
        case 5 :
            System.out.println("赤点です...補講を行います");
            break;
        case 6 :
        case 7 :
            System.out.println("合格です！");
            break;
        case 8 :
        case 9 :
            System.out.println("よくできました！");
            break;
        case 10:
            System.out.println("満点です！ご褒美をあげます！");
            break;
        }

        int num = 1; // 初期値設定

        // 繰り返しの条件（numが1024より小さい間）
        while (num < 1024) {
            // 2の累乗を計算
            num = num * 2;

            // 結果を出力
            System.out.println(num);
        }

        for (int i = 0; i < 10; i++) {
            // i + 1の値を表示
            System.out.println("i = " + (i + 1));
        }

        for (int j = 0; j <= 20; j++) {
            if (j % 2 == 0) {
                System.out.println("j = " + j);
            }
        }

    }




}
