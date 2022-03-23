package If_Conditions.exercise;

import java.util.Scanner;

public class P04ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double holidayPrice = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int tedybears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());
        int allToys = puzzles + dolls + tedybears + minions + trucks;
        double allToysPrice = puzzles * 2.60 + dolls * 3 + tedybears * 4.10 + minions * 8.20 + trucks * 2;
        if (allToys >= 50) {
            allToysPrice = allToysPrice - allToysPrice * 0.25;
        }
        allToysPrice = allToysPrice - allToysPrice * 0.1;
        if (allToysPrice >= holidayPrice) {
            double moneyLeft = allToysPrice - holidayPrice;
            System.out.printf("Yes! %.2f lv left.\n", moneyLeft);
        } else {
            double notEnoughMoney = Math.abs(allToysPrice - holidayPrice);
            System.out.printf("Not enough money! %.2f lv needed.\n", notEnoughMoney);
        }
    }
}
