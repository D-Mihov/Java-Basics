package Nested_Loops.ex;

import java.util.Scanner;

public class P03SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        int primeSum = 0;
        int nonPrimeSum = 0;

        while (!num.equals("stop")) {
            int currNum = Integer.parseInt(num);
            int count = 0;
            if (currNum < 0) {
                System.out.println("Number is negative.");
                num = scanner.nextLine();
                continue;
            }
            for (int i = 1; i <= currNum; i++) {
                if (currNum % i == 0) {
                    count++;
                }
            }
            if (count <= 2) {
                primeSum += currNum;
            } else {
                nonPrimeSum += currNum;
            }
            num = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d\n", primeSum);
        System.out.printf("Sum of all non prime numbers is: %d\n", nonPrimeSum);
    }
}
