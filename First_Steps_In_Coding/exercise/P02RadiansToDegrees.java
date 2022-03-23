package First_Steps_In_Coding.exercise;

import java.util.Scanner;

public class P02RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radians;
        double degrees;
        radians = Double.parseDouble(scanner.nextLine());
        degrees = radians * 180 / Math.PI;
        System.out.println(degrees);
    }
}
