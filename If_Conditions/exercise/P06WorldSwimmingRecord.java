package If_Conditions.exercise;

import java.util.Scanner;

public class P06WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double record = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        double secondsPerMeter = Double.parseDouble(scanner.nextLine());
        double seconds = secondsPerMeter * length;
        double delay = Math.floor(length / 15) * 12.5;
        double recordSeconds = seconds + delay;
        double recordDiff = Math.abs(recordSeconds - record);
        if (recordSeconds < record) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.\n", recordSeconds);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.\n", recordDiff);
        }
    }
}
