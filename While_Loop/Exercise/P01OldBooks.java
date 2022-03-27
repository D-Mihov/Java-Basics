package While_Loop.Exercise;

import java.util.Scanner;

public class P01OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String book = scanner.nextLine();
        int count = 0;
        boolean isFound = false;
        while (!book.equals("No More Books")) {
            if (book.equals(input)) {
                isFound = true;
                break;
            }
            book = scanner.nextLine();
            count++;
        }
        if (isFound) {
            System.out.printf("You checked %d books and found it.\n", count);
        } else {
            System.out.printf("The book you search is not here!\n");
            System.out.printf("You checked %d books.\n", count);
        }
    }
}
