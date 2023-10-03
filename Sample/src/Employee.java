
public class Employee {
    //フィールド
    public String employeeName;   //社員名
    public String divisionName;   //部署名
    public int vitality;


    //自己紹介メソッド
    public void introduce() {
        vitality = vitality - 10;
        System.out.println("私の名前は" + employeeName + "です。");
        System.out.println("所属部署は" + divisionName + "です。");
    }

    //挨拶をするメソッド
    public void greeting() {
        vitality = vitality - 10;
        System.out.println("おはようございます");
    }

    //報告するメソッド
    public void report() {
        vitality = vitality - 10;
        System.out.println("今日は10件アポイント取りました");
    }

    //残り体力を知らせるメソッド
    public void showVitality() {
        vitality = vitality - 10;
        System.out.println("残り体力は" + vitality);
    }

    //出勤するメソッド
    public void goToWork() {

    }

    //退勤するメソッド
    public void leaveWork() {

    }

}
