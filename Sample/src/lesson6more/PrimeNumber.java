package lesson6more;

/* エラトステネスのふるい */
public class PrimeNumber {

    public static void main(String[] args) {
        for(int i = 2; i < 100; i++) {
            if(i != 2 && i % 2 ==0) {
                continue;
            }else if (i != 3 && i % 3 ==0) {
                continue;
            }else if (i != 5 && i % 5 ==0) {
                continue;
            }else if (i != 7 && i % 7 ==0) {
                continue;
            }else {
                System.out.println(i);
            }

            }

    }

}
