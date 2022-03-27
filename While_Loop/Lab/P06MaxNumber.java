package While_Loop.Lab;

import java.util.Scanner;

public class P06MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        int max = Integer.MIN_VALUE;
        while (!num.equals("Stop")) {
            if (Integer.parseInt(num) > max) {
                max = Integer.parseInt(num);
            }
            num = scanner.nextLine();
        }
        System.out.println(max);
    }
}
