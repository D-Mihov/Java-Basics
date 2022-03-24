package Complicated_Checks.exercise;

import java.util.Scanner;

public class P02SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int degrees = Integer.parseInt(scanner.nextLine());
        String time = scanner.nextLine();
        if (degrees >= 10 && degrees <= 18) {
            if (time.equals("Morning")) {
                System.out.printf("It's %d degrees, get your Sweatshirt and Sneakers.\n", degrees);
            } else if (time.equals("Afternoon")) {
                System.out.printf("It's %d degrees, get your Shirt and Moccasins.\n", degrees);
            } else if (time.contains("Evening")) {
                System.out.printf("It's %d degrees, get your Shirt and Moccasins.\n", degrees);
            }
        } else if (degrees > 18 && degrees <= 24) {
            if (time.equals("Morning")) {
                System.out.printf("It's %d degrees, get your Shirt and Moccasins.\n", degrees);
            } else if (time.equals("Afternoon")) {
                System.out.printf("It's %d degrees, get your T-Shirt and Sandals.\n", degrees);
            } else if (time.contains("Evening")) {
                System.out.printf("It's %d degrees, get your Shirt and Moccasins.\n", degrees);
            }
        } else if (degrees >= 25) {
            if (time.equals("Morning")) {
                System.out.printf("It's %d degrees, get your T-Shirt and Sandals.\n", degrees);
            } else if (time.equals("Afternoon")) {
                System.out.printf("It's %d degrees, get your Swim Suit and Barefoot.\n", degrees);
            } else if (time.contains("Evening")) {
                System.out.printf("It's %d degrees, get your Shirt and Moccasins.\n", degrees);
            }
        }
    }
}
