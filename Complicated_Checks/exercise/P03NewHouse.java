package Complicated_Checks.exercise;

import java.util.Scanner;

public class P03NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowers = scanner.nextLine();
        int flowersNum = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double price = 0.0;
        switch (flowers) {
            case "Roses":
                price = flowersNum * 5;
                if (flowersNum > 80) {
                    price = price - price * 0.1;
                }
                break;
            case "Dahlias":
                price = flowersNum * 3.8;
                if (flowersNum > 90) {
                    price = price - price * 0.15;
                }
                break;
            case "Tulips":
                price = flowersNum * 2.8;
                if (flowersNum > 80) {
                    price = price - price * 0.15;
                }
                break;
            case "Narcissus":
                price = flowersNum * 3;
                if (flowersNum < 120) {
                    price = price + price * 0.15;
                }
                break;
            case "Gladiolus":
                price = flowersNum * 2.5;
                if (flowersNum < 80) {
                    price = price + price * 0.2;
                }
                break;
        }
        if (budget >= price) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowersNum, flowers, budget - price);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", Math.abs(budget - price));
        }
    }
}
