package Complicated_Checks.exercise;

import java.util.Scanner;

public class P07HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int nightsNum = Integer.parseInt(scanner.nextLine());
        double priceStudio = 0.0;
        double priceApartment = 0.0;
        switch (month) {
            case "May":
            case "October":
                priceStudio = nightsNum * 50;
                priceApartment = nightsNum * 65;
                if (nightsNum > 7 && nightsNum <= 14) {
                    priceStudio = priceStudio - priceStudio * 0.05;
                } else if (nightsNum > 14) {
                    priceStudio = priceStudio - priceStudio * 0.3;
                    priceApartment = priceApartment - priceApartment * 0.1;
                }
                break;
            case "June":
            case "September":
                priceStudio = nightsNum * 75.2;
                priceApartment = nightsNum * 68.7;
                if (nightsNum > 14) {
                    priceStudio = priceStudio - priceStudio * 0.2;
                    priceApartment = priceApartment - priceApartment * 0.1;
                }
                break;
            case "July":
            case "August":
                priceStudio = nightsNum * 76;
                priceApartment = nightsNum * 77;
                if (nightsNum > 14) {
                    priceApartment = priceApartment - priceApartment * 0.1;
                }
                break;
        }
        System.out.printf("Apartment: %.2f lv.\n", priceApartment);
        System.out.printf("Studio: %.2f lv.\n", priceStudio);
    }
}
