package Nested_Loops.lab;

import java.util.Scanner;

public class P01Clock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int h = 0; h < 24; h++) {
            for (int m = 0; m < 60; m++) {
                System.out.printf("%02d:%02d\n", h, m);
            }
        }
    }
}
