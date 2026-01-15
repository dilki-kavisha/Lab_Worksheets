package LW_04;

import java.util.Scanner;

public class Q_01 {
    public static void main(String[] args) {
        int a, b, c;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        a = sc.nextInt();
        System.out.println("Enter a number :");
        b = sc.nextInt();
        System.out.println("Enter a number :");
        c = sc.nextInt();

        sc.close();
//
//        if ( a > b) {
//            if ( a > c ) {
//                print(a);
//            } else {
//                print(c);
//            }
//        } else {
//            if ( b > c ) {
//                print(b);
//            } else {
//                print(c);
//            }
//        }

        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }

        print(min);
    }

    static void print(int x) {
        System.out.println("Maximum is : " + x);
    }
}