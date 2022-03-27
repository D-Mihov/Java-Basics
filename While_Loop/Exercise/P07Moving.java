package While_Loop.Exercise;

import java.util.Scanner;

public class P07Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int place = width * length * height;
        String packages = scanner.nextLine();
        int sum = 0;
        while (!packages.equals("Done")) {
            sum += Integer.parseInt(packages);
            if (place - sum < 0) {
                break;
            }
            packages = scanner.nextLine();
        }

        if (place - sum < 0) {
            System.out.printf("No more free space! You need %d Cubic meters more.\n", Math.abs(place - sum));
        } else {
            System.out.printf("%d Cubic meters left.\n", place - sum);
        }
    }
}
