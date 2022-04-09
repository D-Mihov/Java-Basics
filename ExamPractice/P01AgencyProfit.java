package ExamPractice;

import java.util.Scanner;

public class P01AgencyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String avioName = scanner.nextLine();
        int adultsTicket = Integer.parseInt(scanner.nextLine());
        int kidsTicket = Integer.parseInt(scanner.nextLine());
        double adultsTicketPrice = Double.parseDouble(scanner.nextLine());
        double servicePrice = Double.parseDouble(scanner.nextLine());
        double kidsTicketPrice = (adultsTicketPrice - adultsTicketPrice * 0.7) + servicePrice;
        double newAdultsTicketPrice = adultsTicketPrice + servicePrice;
        double priceAll = (newAdultsTicketPrice * adultsTicket) + (kidsTicket * kidsTicketPrice);
        double profit = priceAll * 0.2;
        System.out.printf("The profit of your agency from %s tickets is %.2f lv.\n", avioName, profit);
    }
}
