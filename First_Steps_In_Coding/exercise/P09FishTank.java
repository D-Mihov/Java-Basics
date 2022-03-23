package First_Steps_In_Coding.exercise;

import java.util.Scanner;

public class P09FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double length = Integer.parseInt(scanner.nextLine());
        double width = Integer.parseInt(scanner.nextLine());
        double height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());
        double volume = length * width * height / 1000;
        double neededVolume = volume * (1 - percent / 100);
        System.out.println(neededVolume);

    }
}
