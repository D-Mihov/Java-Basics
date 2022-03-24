package Complicated_Checks.exercise;

import java.util.Scanner;

public class P05Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double price = Double.parseDouble(scanner.nextLine());
        String summerOrWinter = scanner.nextLine();
        double budget = price;
        switch (summerOrWinter) {
            case "summer":
                if (budget <= 100) {
                    budget = budget - budget * 0.3;
                    System.out.println("Somewhere in Bulgaria");
                    System.out.printf("Camp - %.2f", price - budget);
                } else if (budget <= 1000) {
                    budget = budget - budget * 0.4;
                    System.out.println("Somewhere in Balkans");
                    System.out.printf("Camp - %.2f", price - budget);
                } else {
                    budget = budget - budget * 0.9;
                    System.out.println("Somewhere in Europe");
                    System.out.printf("Hotel - %.2f", price - budget);
                }
                break;
            case "winter":
                if (budget <= 100) {
                    budget = budget - budget * 0.7;
                    System.out.println("Somewhere in Bulgaria");
                    System.out.printf("Hotel - %.2f", price - budget);
                } else if (budget <= 1000) {
                    budget = budget - budget * 0.8;
                    System.out.println("Somewhere in Balkans");
                    System.out.printf("Hotel - %.2f", price - budget);
                } else {
                    budget = budget - budget * 0.9;
                    System.out.println("Somewhere in Europe");
                    System.out.printf("Hotel - %.2f", price - budget);
                }
                break;
        }
    }
}
