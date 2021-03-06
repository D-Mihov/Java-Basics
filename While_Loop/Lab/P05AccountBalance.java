package While_Loop.Lab;

import java.util.Scanner;

public class P05AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 0.0;
        String num = scanner.nextLine();
        while (!num.equals("NoMoreMoney")) {
            if (Double.parseDouble(num) < 0) {
                System.out.println("Invalid operation!");
                break;
            }
            System.out.printf("Increase: %.2f\n", Double.parseDouble(num));
            balance += Double.parseDouble(num);
            num = scanner.nextLine();
        }
        System.out.printf("Total: %.2f\n", balance);
    }
}
