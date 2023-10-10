package lesson6.lesson6no2;

public abstract class AbstractEmployee {

 // フィールドの定義
    private String employeeName; // 社員名

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    // 抽象メソッドgreetingの定義
    public abstract void greeting();
}

