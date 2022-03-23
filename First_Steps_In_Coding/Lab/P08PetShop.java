package First_Steps_In_Coding.Lab;

import java.util.Scanner;

public class P08PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogFood = Integer.parseInt(scanner.nextLine());
        int catFood = Integer.parseInt(scanner.nextLine());
        double sum = dogFood * 2.5 + catFood * 4;
        System.out.printf("%f lv.", sum);
    }
}
