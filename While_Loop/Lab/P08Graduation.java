package While_Loop.Lab;

import java.util.Scanner;

public class P08Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double grade = Double.parseDouble(scanner.nextLine());
        double sum = 0.0;
        int num = 1;
        int poorGrade = 0;
        while (true) {
            sum += grade;
            if (grade < 4) {
                poorGrade++;
            }
            if (poorGrade > 1) {
                System.out.printf("%s has been excluded at %d grade\n", name, num - 1);
                break;
            } else if (num == 12) {
                System.out.printf("%s graduated. Average grade: %.2f", name, sum / 12);
                break;
            }
            grade = Double.parseDouble(scanner.nextLine());
            num++;
        }
    }
}
