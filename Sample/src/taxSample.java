
public class taxSample {

    public static void main(String[] args) {
        int price = 1500;
        double taxprice = 1.1;
        int result = (int) tax(price, taxprice);
        System.out.println(price + "円の商品の税込価格は" +  result + "円（消費税は" + ((int)(price * (taxprice - 1))) + "円）です。") ;
    }

    public static double tax(int price, double taxprice) {
        double result = price * taxprice;
        return result;
    }

}
