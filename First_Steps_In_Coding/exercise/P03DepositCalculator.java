package First_Steps_In_Coding.exercise;

import java.util.Scanner;

public class P03DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double deposit;
        int term;
        double int_rate;
        double sum;
        deposit = Double.parseDouble(scanner.nextLine());
        term = Integer.parseInt(scanner.nextLine());
        int_rate = Double.parseDouble(scanner.nextLine());
        sum = deposit + term * ((deposit * int_rate / 100) / 12);
        System.out.println(sum);
    }
}
