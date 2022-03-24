package Complicated_Checks.exercise;

import java.util.Scanner;

public class P04FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int anglers = Integer.parseInt(scanner.nextLine());
        double price = 0.0;
        switch (season) {
            case "Spring":
                price = 3000;
                if (anglers <= 6) {
                    price = price - price * 0.1;
                } else if (anglers <= 11) {
                    price = price - price * 0.15;
                } else {
                    price = price - price * 0.25;
                }
                break;
            case "Summer":
            case "Autumn":
                price = 4200;
                if (anglers <= 6) {
                    price = price - price * 0.1;
                } else if (anglers <= 11) {
                    price = price - price * 0.15;
                } else {
                    price = price - price * 0.25;
                }
                break;
            case "Winter":
                price = 2600;
                if (anglers <= 6) {
                    price = price - price * 0.1;
                } else if (anglers <= 11) {
                    price = price - price * 0.15;
                } else {
                    price = price - price * 0.25;
                }
                break;
        }
        if (anglers % 2 == 0 && !season.equals("Autumn")) {
            price = price - price * 0.05;
        }
        if (budget >= price) {
            System.out.printf("Yes! You have %.2f leva left.\n", budget - price);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.\n", Math.abs(budget - price));
        }
    }
}
