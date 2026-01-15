package LW_04;

import java.util.Scanner;

public class Q_11 {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 100);
        int guess;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a guess :");
            guess = sc.nextInt();
            if (guess > random) System.out.println("Lower");
            else if (guess < random) System.out.println("Higher");
            else {
                System.out.println("You are correct");
                break;
            }
        }
    }
}