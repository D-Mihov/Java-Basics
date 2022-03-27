package While_Loop.Exercise;

import java.util.Scanner;

public class P05Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        int coins = 0;
        money*=100;
        while (money > 0) {
            money=Math.round(money);
            if (money - 200 >= 0) {
                money -= 200;
                coins++;
            } else if (money - 100 >= 0) {
                money -= 100;
                coins++;
            } else if (money - 50 >= 0) {
                money -= 50;
                coins++;
            } else if (money - 20 >= 0) {
                money -= 20;
                coins++;
            } else if (money - 10 >= 0) {
                money -= 10;
                coins++;
            } else if (money - 5 >= 0) {
                money -= 5;
                coins++;
            } else if (money - 2 >= 0) {
                money -= 2;
                coins++;
            } else if (money - 1 >= 0) {
                money -= 1;
                coins++;
            }
        }
        System.out.println(coins);
    }
}
