package First_Steps_In_Coding.exercise;

import java.util.Scanner;

public class P05SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p_pencils;
        int p_markers;
        int preparations;
        int discount;
        double sum;
        double disc_price;
        p_pencils = Integer.parseInt(scanner.nextLine());
        p_markers = Integer.parseInt(scanner.nextLine());
        preparations = Integer.parseInt(scanner.nextLine());
        discount = Integer.parseInt(scanner.nextLine());
        sum = p_pencils * 5.8 + p_markers * 7.2 + preparations * 1.2;
        disc_price = sum - (sum * discount / 100);
        System.out.println(disc_price);
    }
}
