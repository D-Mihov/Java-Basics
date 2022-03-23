package First_Steps_In_Coding.exercise;

import java.util.Scanner;

public class P08BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int annualFee = Integer.parseInt(scanner.nextLine());
        double basketballShoes = annualFee - annualFee * 0.4;
        double basketballOutfit = basketballShoes - basketballShoes * 0.2;
        double basketballBall = basketballOutfit / 4;
        double basketballAccessories = basketballBall / 5;
        double sum = annualFee + basketballBall + basketballOutfit + basketballShoes + basketballAccessories;
        System.out.println(sum);
    }
}
