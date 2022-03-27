package While_Loop.Lab;

import java.util.Scanner;

public class P03SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = Integer.parseInt(scanner.nextLine());
        int sum2 = 0;
        while (sum2 < sum) {
            int num = Integer.parseInt(scanner.nextLine());
            sum2 += num;
        }
        System.out.println(sum2);
    }
}
