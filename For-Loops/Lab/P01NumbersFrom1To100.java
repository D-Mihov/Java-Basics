package For_Loops.lab;

import java.util.Scanner;

public class P01NumbersFrom1To100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }
}
