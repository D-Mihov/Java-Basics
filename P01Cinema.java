package Complicated_Checks.exercise;

import java.util.Scanner;

public class P01Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String projection = scanner.nextLine();
        int numRows = Integer.parseInt(scanner.nextLine());
        int numColumns = Integer.parseInt(scanner.nextLine());
        int seats = numColumns * numRows;
        double price = 0.0;
        switch (projection) {
            case "Premiere":
                price = seats * 12;
                break;
            case "Normal":
                price = seats * 7.5;
                break;
            case "Discount":
                price = seats * 5;
                break;
        }
        if (price != 0) {
            System.out.printf("%.2f", price);
        }
    }
}
