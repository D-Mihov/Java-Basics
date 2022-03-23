package If_Conditions.exercise;

import java.util.Scanner;

public class P07Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int graphicCards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int RAMMemory = Integer.parseInt(scanner.nextLine());
        double graphicCardsPrice = graphicCards * 250;
        double processorsPrice = graphicCardsPrice * 0.35 * processors;
        double RAMMemoryPrice = graphicCardsPrice * 0.1 * RAMMemory;
        double priceAll = graphicCardsPrice + processorsPrice + RAMMemoryPrice;
        if (graphicCards > processors) {
            priceAll = priceAll - priceAll * 0.15;
        }
        if (budget >= priceAll) {
            System.out.printf("You have %.2f leva left!", budget - priceAll);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", Math.abs(budget - priceAll));
        }
    }
}
