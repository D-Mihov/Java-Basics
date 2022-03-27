package While_Loop.Exercise;

import java.util.Scanner;

public class P02ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int unsatisfactoryGrades = Integer.parseInt(scanner.nextLine());
        String problemName = scanner.nextLine();
        int grade = Integer.parseInt(scanner.nextLine());
        String lastProblem = "";
        int problems = 1;
        int num = 0;
        double sum = 0.0;
        while (true) {
            if (grade <= 4) {
                num++;
            }
            if (num == unsatisfactoryGrades) {
                System.out.printf("You need a break, %d poor grades.\n", unsatisfactoryGrades);
                break;
            }
            lastProblem = problemName;
            sum += grade;
            problemName = scanner.nextLine();
            if (problemName.equals("Enough")) {
                System.out.printf("Average score: %.2f\n", sum / problems);
                System.out.printf("Number of problems: %d\n", problems);
                System.out.printf("Last problem: %s\n", lastProblem);
                break;
            }
            problems++;
            grade = Integer.parseInt(scanner.nextLine());

        }
    }
}
