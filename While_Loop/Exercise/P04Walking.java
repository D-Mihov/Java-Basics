package While_Loop.Exercise;

import java.util.Scanner;

public class P04Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String steps;
        int sum = 0;
        while (sum <= 10000) {
            steps = scanner.nextLine();
            if (steps.equals("Going home")) {
                steps = scanner.nextLine();
                sum += Integer.parseInt(steps);
                break;
            }
            sum += Integer.parseInt(steps);
        }

        if (sum >= 10000) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", sum - 10000);
        } else {
            System.out.printf("%d more steps to reach goal.", 10000 - sum);
        }
    }
}
