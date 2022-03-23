package First_Steps_In_Coding.exercise;

import java.util.Scanner;

public class P07FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chickenMenuCount = Integer.parseInt(scanner.nextLine());
        int fishMenuCount = Integer.parseInt(scanner.nextLine());
        int veganMenuCount = Integer.parseInt(scanner.nextLine());
        double menuSum = chickenMenuCount * 10.35 + fishMenuCount * 12.4 + veganMenuCount * 8.15;
        double sumAll = menuSum + menuSum * 0.2 + 2.5;
        System.out.println(sumAll);
    }
}
