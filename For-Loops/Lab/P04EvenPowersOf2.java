package For_Loops.lab;

import java.util.Scanner;

public class P04EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int num = 0;
        for (int i = 0; i <= n; i += 2) {
            double res = Math.pow(2, i);
            System.out.printf("%.0f\n", res);
 /*           num *= 2;
            if (i == 0) {
                num = 1;
                System.out.println(1);
            } else if (i % 2 == 0) {
                System.out.println(num);
            }
*/
        }
    }
}
