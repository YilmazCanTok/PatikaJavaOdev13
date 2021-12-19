
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("********************************************************************************");
        System.out.println("0 ile 100 arasındaki bütün asal sayıları yazdıran program");
        System.out.println("--------------------------------------------------------------------------------");
        int number = 100;

        for (int i = 2; i <= number; i++) {
            boolean asalmi = true;
            for (int j = 2; j < i; j++) {
                int kalan = i % j;
                if (kalan == 0) {
                    asalmi = false;
                    break;
                }
            }
            if (asalmi == true) {
                System.out.println(i);
            }
        }
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("********************************************************************************");
    }
}
