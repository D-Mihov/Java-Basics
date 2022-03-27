package While_Loop.Exercise;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double holidayMoney = Double.parseDouble(scanner.nextLine());
        double allMoney = Double.parseDouble(scanner.nextLine());
        String operation = scanner.nextLine();
        double sum = Double.parseDouble(scanner.nextLine());
        int spendDays = 0;
        int allDays = 0;
        while (true) {
            if (operation.equals("spend")) {
                allMoney -= sum;
                if (allMoney < 0) {
                    allMoney = 0;
                }
                spendDays++;
                allDays++;
            } else if (operation.equals("save")) {
                allMoney += sum;
                spendDays = 0;
                allDays++;
            }
            if (allMoney >= holidayMoney) {
                System.out.printf("You saved the money for %d days.", allDays);
                break;
            } else if (spendDays == 5) {
                System.out.println("You can't save the money.");
                System.out.println(allDays);
                break;
            }
            operation = scanner.nextLine();
            sum = Double.parseDouble(scanner.nextLine());
        }
    }
}
