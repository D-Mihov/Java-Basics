package While_Loop.Exercise;

import java.util.Scanner;

public class P06Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dim1 = Integer.parseInt(scanner.nextLine());
        int dim2 = Integer.parseInt(scanner.nextLine());
        int cake = dim1 * dim2;
        String pieces = scanner.nextLine();
        while (!pieces.equals("STOP")) {
            cake -= Integer.parseInt(pieces);
            if (cake <= 0) {
                break;
            }

            pieces = scanner.nextLine();
        }

        if (pieces.equals("STOP")) {
            System.out.printf("%d pieces are left.\n", cake);
        } else {
            System.out.printf("No more cake left! You need %d pieces more.\n", Math.abs(cake));
        }
    }
}
