package Nested_Loops.ex;

import java.util.Scanner;

public class P04TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double avg = 0.0;
        int count = 0;
        String presentation = scanner.nextLine();
        while (!presentation.equals("Finish")) {
            double grade = 0.0;
            double gradeSum = 0.0;
            for (int i = 0; i < n; i++) {
                grade = Double.parseDouble(scanner.nextLine());
                gradeSum += grade;
            }
            avg += gradeSum / n;
            count++;
            System.out.printf("%s - %.2f.\n", presentation, gradeSum / n);
            presentation = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.\n", avg / count);
    }
}
