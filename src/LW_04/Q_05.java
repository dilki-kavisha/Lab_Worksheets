package LW_04;

import java.util.Scanner;

public class Q_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int in, food = 0;
            menu();
            in = sc.nextInt();
            switch (in) {
                case 1:
                    entree();
                    break;
                case 2:
                    sDish();
                    break;
                case 3:
                    drink();
                    break;
                case 4:
                    System.exit(0);
            }
            in = sc.nextInt();

        }
    }

    static void menu() {
        System.out.println("=====Menu======");
        System.out.println("1. Entree.");
        System.out.println("2. Side Dish.");
        System.out.println("3. Drink.");
        System.out.println("4. Exit.");
        System.out.println("===============");
        System.out.println("Enter the topic : ");
    }
    static void entree() {
        System.out.println("=====Entree======");
        System.out.println("1. Tofu Burger    $3.49");
        System.out.println("2. Cajun Chicken  $4.59");
        System.out.println("3. Buffalo Wings  $3.99");
        System.out.println("4. Rainbow Fillet $2.99");
        System.out.println("5. Go Back");
        System.out.println("=================");
        System.out.println("Enter the selection : ");
    }
    static void sDish() {
        System.out.println("=====Side Dish======");
        System.out.println("1. Rice Cracker   $0.79");
        System.out.println("2. No-Salt Fries  $0.69");
        System.out.println("3. Zucchini       $1.09");
        System.out.println("4.  Brown Rice    $0.59");
        System.out.println("5. Go Back");
        System.out.println("=================");
        System.out.println("Enter the selection : ");
    }
    static void drink() {
        System.out.println("=====Drink======");
        System.out.println("1. Cafe Mocha   $1.99");
        System.out.println("2. Cafe Latte   $1.90");
        System.out.println("3. Espresso     $2.49");
        System.out.println("4. Oolong Tea   $0.99");
        System.out.println("5. Go Back");
        System.out.println("=================");
        System.out.println("Enter the selection : ");
    }
}