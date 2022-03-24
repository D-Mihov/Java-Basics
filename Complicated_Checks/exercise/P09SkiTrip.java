package Complicated_Checks.exercise;

import java.util.Scanner;

public class P09SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days;
        String room;
        String opinion;
        double price = 0;
        days = Integer.parseInt(scanner.nextLine());
        room = scanner.nextLine();
        opinion = scanner.nextLine();
        int nights=days-1;

        if (room.equals("room for one person")) {
            price = nights * 18;
            if (opinion.equals("positive")) {
                price = price + price * 25 / 100;
            } else if (opinion.equals("negative")) {
                price = price - price * 10 / 100;
            } else {
                System.out.println("ERROR. Wrong opinion.");
                System.exit(1);
            }
        } else if (room.equals("apartment")) {
            price = nights * 25;
            if (days < 10) {
                price = price - price * 30 / 100;
                if (opinion.equals("positive")) {
                    price = price + price * 25 / 100;
                } else if (opinion.equals("negative")) {
                    price = price - price * 10/100;
                } else {
                    System.out.println("ERROR. Wrong opinion.");
                    System.exit(1);
                }
            } else if (days <= 15) {
                price = price - price * 35 / 100;
                if (opinion.equals("positive")) {
                    price = price + price * 25 / 100;
                } else if (opinion.equals("negative")) {
                    price = price - price * 10/100;
                } else {
                    System.out.println("ERROR. Wrong opinion.");
                    System.exit(1);
                }
            } else {
                price = price - price * 50 / 100;
                if (opinion.equals("positive")) {
                    price = price + price * 25 / 100;
                } else if (opinion.equals("negative")) {
                    price = price - price * 10/100;
                } else {
                    System.out.println("ERROR. Wrong opinion.");
                    System.exit(1);
                }
            }
        } else if (room.equals("president apartment")) {
            price = nights * 35;
            if (days < 10) {
                price = price - price * 10 / 100;
                if (opinion.equals("positive")) {
                    price = price + price * 25 / 100;
                } else if (opinion.equals("negative")) {
                    price = price - price * 10/100;
                } else {
                    System.out.println("ERROR. Wrong opinion.");
                    System.exit(1);
                }
            } else if (days <= 15) {
                price = price - price * 15 / 100;
                if (opinion.equals("positive")) {
                    price = price + price * 25 / 100;
                } else if (opinion.equals("negative")) {
                    price = price - price * 10/100;
                } else {
                    System.out.println("ERROR. Wrong opinion.");
                    System.exit(1);
                }
            } else {
                price = price - price * 20 / 100;
                if (opinion.equals("positive")) {
                    price = price + price * 25 / 100;
                } else if (opinion.equals("negative")) {
                    price = price - price * 10/100;
                } else {
                    System.out.println("ERROR. Wrong opinion.");
                    System.exit(1);
                }
            }
        } else {
            System.out.println("ERROR. Wrong room type.");
            System.exit(1);
        }
        System.out.printf("%.2f", price);
    }
}
