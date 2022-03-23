package First_Steps_In_Coding.exercise;

import java.util.Scanner;

public class P06Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nylon;
        int paint;
        int thinner;
        int w_hours;
        double sum_m;
        double sum_w;
        double sum_all;
        nylon = Integer.parseInt(scanner.nextLine());
        paint = Integer.parseInt(scanner.nextLine());
        thinner = Integer.parseInt(scanner.nextLine());
        w_hours = Integer.parseInt(scanner.nextLine());
        sum_m = (nylon + 2) * 1.5 + paint * 1.1 * 14.5 + thinner * 5 + 0.4;
        sum_w = sum_m * 30 / 100 * w_hours;
        sum_all = sum_m + sum_w;
        System.out.println(sum_all);
    }
}
