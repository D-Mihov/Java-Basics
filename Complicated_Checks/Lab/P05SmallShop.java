package Complicated_Checks.lab;

import java.util.Scanner;

public class P05SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0.0;
        switch (product) {
            case "coffee":
                switch (city) {
                    case "Sofia":
                        price = quantity * 0.5;
                        break;
                    case "Plovdiv":
                        price = quantity * 0.4;
                        break;
                    case "Varna":
                        price = quantity * 0.45;
                        break;
                    default:
                        System.out.println("Error");
                        break;
                }
                break;
            case "water":
                switch (city) {
                    case "Sofia":
                        price = quantity * 0.8;
                        break;
                    case "Plovdiv":
                    case "Varna":
                        price = quantity * 0.7;
                        break;
                    default:
                        System.out.println("Error");
                        break;
                }
                break;
            case "beer":
                switch (city) {
                    case "Sofia":
                        price = quantity * 1.2;
                        break;
                    case "Plovdiv":
                        price = quantity * 1.15;
                        break;
                    case "Varna":
                        price = quantity * 1.1;
                        break;
                    default:
                        System.out.println("Error");
                        break;
                }
                break;
            case "sweets":
                switch (city) {
                    case "Sofia":
                        price = quantity * 1.45;
                        break;
                    case "Plovdiv":
                        price = quantity * 1.3;
                        break;
                    case "Varna":
                        price = quantity * 1.35;
                        break;
                    default:
                        System.out.println("Error");
                        break;
                }
                break;
            case "peanuts":
                switch (city) {
                    case "Sofia":
                        price = quantity * 1.6;
                        break;
                    case "Plovdiv":
                        price = quantity * 1.5;
                        break;
                    case "Varna":
                        price = quantity * 1.55;
                        break;
                    default:
                        System.out.println("Error");
                        break;
                }
                break;
            default:
                System.out.println("Error");
                break;
        }
        System.out.println(price);
    }
}
