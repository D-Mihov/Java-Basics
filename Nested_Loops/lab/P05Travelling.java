package Nested_Loops.lab;

import java.util.Scanner;

public class P05Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String destination= scanner.nextLine();
        double sum=0.0;
        while (!destination.equals("End")){
            double budget=Double.parseDouble(scanner.nextLine());
            while (sum<budget){
                sum+= Double.parseDouble(scanner.nextLine());
            }
            sum=0.0;
            System.out.printf("Going to %s!\n",destination);
            destination= scanner.nextLine();
        }
    }
}
