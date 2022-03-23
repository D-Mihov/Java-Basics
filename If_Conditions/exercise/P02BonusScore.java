package If_Conditions.exercise;

import java.util.Scanner;

public class P02BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        double bonusPoints = 0;
        if (number <= 100) {
            bonusPoints += 5;
        } else if (number > 100 && number <= 1000) {
            bonusPoints = bonusPoints + number * 0.2;
        } else if (number > 1000) {
            bonusPoints = bonusPoints + number * 0.1;
        }
        if (number % 2 == 0) {
            bonusPoints += 1;
        } else if (number % 5 == 0) {
            bonusPoints += 2;
        }
        double allPoints = bonusPoints + number;
        System.out.printf("%.1f\n", bonusPoints);
        System.out.printf("%.1f\n", allPoints);
    }
}
