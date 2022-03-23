package If_Conditions.exercise;

import java.util.Scanner;

public class P05GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double filmBudget = Double.parseDouble(scanner.nextLine());
        int statistsNumber = Integer.parseInt(scanner.nextLine());
        double statistsClothes = Double.parseDouble(scanner.nextLine());
        double decor = filmBudget * 0.1;
        double clothesMoney = statistsClothes * statistsNumber;
        if (statistsNumber > 150) {
            clothesMoney = clothesMoney - clothesMoney * 0.1;
        }
        double sumAll = decor + clothesMoney;
        double filmPrice = filmBudget - sumAll;
        if (filmPrice >= 0) {
            System.out.printf("Action!\nWingard starts filming with %.2f leva left.\n", filmPrice);
        } else {
            System.out.printf("Not enough money!\nWingard needs %.2f leva more.\n", Math.abs(filmPrice));
        }
    }
}
