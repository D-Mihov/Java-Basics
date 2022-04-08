package Nested_Loops.ex;

import java.util.Scanner;

public class P06CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String film = scanner.nextLine();
        int standardTicket = 0;
        int studentTicket = 0;
        int kidsTicket = 0;
        double tickets = 0.0;

        while (!film.equals("Finish")) {
            int freeSeats = Integer.parseInt(scanner.nextLine());
            String ticket = scanner.nextLine();
            double count = 0.0;
            while (!ticket.equals("End")) {
                switch (ticket) {
                    case "standard":
                        standardTicket++;
                        break;
                    case "student":
                        studentTicket++;
                        break;
                    case "kid":
                        kidsTicket++;
                        break;
                }
                count++;
                tickets++;
                if (count == freeSeats) {
                    break;
                }
                ticket = scanner.nextLine();
            }
            System.out.printf("%s - %.2f%% full.\n", film, count / freeSeats * 100);
            film = scanner.nextLine();
        }

        System.out.printf("Total tickets: %.0f\n", tickets);
        System.out.printf("%.2f%% student tickets.\n", studentTicket / tickets * 100);
        System.out.printf("%.2f%% standard tickets.\n", standardTicket / tickets * 100);
        System.out.printf("%.2f%% kids tickets.\n", kidsTicket / tickets * 100);
    }
}
