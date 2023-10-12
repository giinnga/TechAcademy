package lesson6Ex;

public class BaseBallGame {

    public static void main(String[] args) {

        BaseBallTeam team1 = new BaseBallTeam("読売ジャイアンツ", 77, 64, 2);
        BaseBallTeam team2 = new BaseBallTeam("横浜DeNAベイスターズ", 71, 69, 3);
        BaseBallTeam team3 = new BaseBallTeam("阪神タイガース", 69, 68, 6);
        BaseBallTeam team4 = new BaseBallTeam("広島東洋カープ", 70, 70, 3);
        BaseBallTeam team5 = new BaseBallTeam("中日ドラゴンズ", 68, 73, 2);
        BaseBallTeam team6 = new BaseBallTeam("東京ヤクルトスワローズ", 59, 82, 2);

        team1.report();
        team2.report();
        team3.report();
        team4.report();
        team5.report();
        team6.report();

    }

}
