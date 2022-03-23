package If_Conditions.exercise;

import java.util.Scanner;

public class P08LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String TV_series = scanner.nextLine();
        double episode_length = Double.parseDouble(scanner.nextLine());
        double rest_length = Double.parseDouble(scanner.nextLine());
        double lunch_time = rest_length / 8;
        double rest_time = rest_length / 4;
        double left_time = rest_length - rest_time - lunch_time;
        if (left_time >= episode_length) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", TV_series, Math.ceil(left_time - episode_length));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", TV_series, Math.ceil(Math.abs(left_time - episode_length)));
        }
    }
}
