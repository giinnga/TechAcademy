
public class ObjectSample {

    public static void main(String[] args) {
        Employee emp01 = new Employee();
        //emp01.employeeName = "大島";     //<インスタンスが格納された変数名>.<フィールド名> という記述で値をセットできる。
        //emp01.divisionName = "営業部";   //<インスタンスが格納された変数名>.<フィールド名> という記述で値をセットできる。
        //emp01.vitality = 150;
        emp01.introduce();             //<インスタンスが格納された変数名>.<メソッド名>(<引数(必要なら)>) と記述することで、特定のクラスが持っているメソッドを実行できる。
        emp01.showVitality();

        Employee emp02 = new Employee("原川", "営業部", 250);
        //emp02.employeeName = "原川";
        //emp02.divisionName = "営業部";
        //emp02.vitality = 250;
        emp02.introduce();
        emp02.greeting();
        //emp02.report();
        //emp02.showVitality();
    }

}
