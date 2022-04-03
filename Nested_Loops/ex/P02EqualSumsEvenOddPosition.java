package Nested_Loops.ex;

import java.util.Scanner;

public class P02EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        for (int i = start; i <= end; i++) {
            String currNum = "" + i;
            int oddSum = 0;
            int evenSum = 0;
            for (int j = 0; j < currNum.length(); j++) {
                if ((j + 1) % 2 == 0) {
                    evenSum += Character.getNumericValue(currNum.charAt(j));
                } else {
                    oddSum += Character.getNumericValue(currNum.charAt(j));
                }
            }
            if (evenSum == oddSum) {
                System.out.printf("%s ", currNum);
            }
        }
    }
}
