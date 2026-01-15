package LW_04;

import java.util.Scanner;

public class Q_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            int n, i = 0;
            System.out.printf("\nEnter a number : ");
            n = sc.nextInt();
            if (n < 0) break;
            do {
                i++;
                n /= 10;
            }while (n != 0);
            System.out.println("\nNumber of digits : " + i);
        }
    }
}