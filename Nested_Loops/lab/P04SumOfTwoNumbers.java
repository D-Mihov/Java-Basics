package Nested_Loops.lab;

import java.util.Scanner;

public class P04SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int num = Integer.parseInt(scanner.nextLine());
        int count = 0;
        boolean isValid = false;
        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                count++;
                if (i + j == num) {
                    isValid = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)\n", count, i, j, num);
                    break;
                }
            }
            if (isValid) {
                break;
            }
        }
        if (!isValid) {
            System.out.printf("%d combinations - neither equals %d\n", count, num);
        }
    }
}
