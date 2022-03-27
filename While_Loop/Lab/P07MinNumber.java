package While_Loop.Lab;

import java.util.Scanner;

public class P07MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        int min = Integer.MAX_VALUE;
        while (!num.equals("Stop")) {
            if (Integer.parseInt(num) < min) {
                min = Integer.parseInt(num);
            }
            num = scanner.nextLine();
        }
        System.out.println(min);
    }
}
