package Nested_Loops.ex;

import java.util.Scanner;

public class P05SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1111; i <= 9999; i++) {
            int count = 0;
            int currNum = i;
            int num = 0;
            for (int j = 0; j < 4; j++) {
                num = currNum % 10;
                if (num != 0) {
                    if (n % num == 0) {
                        count++;
                    }
                }
                currNum /= 10;
            }
            if (count == 4) {
                System.out.printf("%d ",i);
            }
        }
    }
}
