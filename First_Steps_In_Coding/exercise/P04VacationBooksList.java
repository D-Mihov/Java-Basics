package First_Steps_In_Coding.exercise;

import java.util.Scanner;

public class P04VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pages;
        int pages_per_hour;
        int days;
        int hours;
        pages = Integer.parseInt(scanner.nextLine());
        pages_per_hour = Integer.parseInt(scanner.nextLine());
        days = Integer.parseInt(scanner.nextLine());
        hours = (pages / pages_per_hour) / days;
        System.out.println(hours);
    }
}
