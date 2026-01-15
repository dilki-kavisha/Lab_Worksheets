package LW_04;

import java.util.Scanner;

public class Q_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sentence.");
        String str = sc.nextLine();
        str = str.replaceAll("[\\p{Punct}\\s]+", "").toLowerCase();
        String rev = new StringBuilder(str).reverse().toString();
        if (str.equals(rev)) {
            System.out.println("Sentence is a palindrome.");
        } else {
            System.out.println("Sentence is not a palindrome.");
        }

        sc.close();
    }
}