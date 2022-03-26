package For_Loops.lab;

import java.util.Scanner;

public class P03Numbers1_NWithStep3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i += 3) {
            System.out.println(i);
        }
    }
}
