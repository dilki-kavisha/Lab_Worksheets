package LW_04;

import java.util.Scanner;

public class Q_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows.");
        int n = sc.nextInt();

        for (int i = n; i > 0; i--) {
            for (int j = i; j >= 0; j--) {
                System.out.print("  ");
            }
            for (int k = 0; k <= n-i; k++) {
                System.out.print("* ");
            }
            for (int k = 0; k < n-i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}