package If_Conditions.exercise;

import java.util.Scanner;

public class P03TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        if (minutes + 15 >= 60) {
            minutes = minutes + 15 - 60;
            if (hours == 23) {
                hours = 0;
            } else {
                hours += 1;
            }
        } else {
            minutes += 15;
        }
        if (minutes < 10) {
            System.out.printf("%d:0%d\n", hours, minutes);
        } else {
            System.out.printf("%d:%d\n", hours, minutes);
        }
    }
}
