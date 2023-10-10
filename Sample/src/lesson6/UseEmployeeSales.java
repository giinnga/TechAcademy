package lesson6;

public class UseEmployeeSales {

    public static void main(String[] args) {
       EmployeeSales sales = new EmployeeSales(10, "南野", 200);

       sales.setAppointment("ほげほげ商事株式会社");

       sales.introduce();

       sales.greeting();

       sales.report();

       sales.showVitality();


    }

}
