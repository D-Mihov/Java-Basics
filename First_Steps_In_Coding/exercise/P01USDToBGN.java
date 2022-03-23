package First_Steps_In_Coding.exercise;

import java.util.Scanner;

public class P01USDToBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double usd;
        double bgn;
        System.out.println("Enter the amount of dollars you want to transfer into BGN: ");
        usd = Double.parseDouble(scanner.nextLine());
        bgn = usd * 1.79549;
        System.out.println("BGN: " + bgn);
    }
}
