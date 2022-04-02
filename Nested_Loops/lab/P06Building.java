package Nested_Loops.lab;

import java.util.Scanner;

public class P06Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int floors = Integer.parseInt(scanner.nextLine());
        int roomNum = Integer.parseInt(scanner.nextLine());

        for (int i = floors; i > 0; i--) {
            for (int j = 0; j < roomNum; j++) {
                if (i == floors) {
                    System.out.printf("L%d%d ", i, j);
                } else if (i % 2 == 0) {
                    System.out.printf("O%d%d ", i, j);
                } else {
                    System.out.printf("A%d%d ", i, j);
                }
            }
            System.out.print("\n");
        }
    }
}
