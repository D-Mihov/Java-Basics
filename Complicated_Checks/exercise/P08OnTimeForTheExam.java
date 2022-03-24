package Complicated_Checks.exercise;

import java.util.Scanner;

public class P08OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hourExam = Integer.parseInt(scanner.nextLine());
        int minuteExam = Integer.parseInt(scanner.nextLine());
        int hour = Integer.parseInt(scanner.nextLine());
        int minute = Integer.parseInt(scanner.nextLine());
        int examMinutes = hourExam * 60 + minuteExam;
        int arrivalMinutes = hour * 60 + minute;
        int newHour = 0;
        int newMinutes = 0;
        int diff = Math.abs(examMinutes - arrivalMinutes);
        if (examMinutes < arrivalMinutes) {
            System.out.println("Late");
            if (diff >= 60) {
                newHour = diff / 60;
                newMinutes = diff % 60;
                System.out.printf("%d:%02d hours after the start\n", newHour, newMinutes);
            } else {
                System.out.printf("%d minutes after the start\n", diff);
            }
        } else if (diff <= 30) {
            System.out.println("On time");
            if (diff != 0) {
                System.out.printf("%d minutes before the start\n", diff);
            }
        } else {
            System.out.println("Early");
            if (diff >= 60) {
                newHour = diff / 60;
                newMinutes = diff % 60;
                System.out.printf("%d:%02d hours before the start\n", newHour, newMinutes);
            } else {
                System.out.printf("%d minutes before the start\n", diff);
            }
        }

    }
}
