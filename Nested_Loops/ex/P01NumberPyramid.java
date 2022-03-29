package Nested_Loops.ex;

import java.util.Scanner;

public class P01NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int num = 1;
        boolean isValid = false;

        for (int rows = 1; rows <= n; rows++) {
            for (int col = 1; col <= rows; col++) {
                if (num > n) {
                    isValid = true;
                    break;
                }
                System.out.printf("%d ", num);
                num++;
            }
            if (isValid) {
                break;
            }
            System.out.println();
        }
    }
}
