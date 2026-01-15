package LW_04;

import java.util.Scanner;

public class Q_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence");
        String sentence = sc.nextLine();

        System.out.println("Enter the word to replace :");
        String word = sc.nextLine();

        System.out.println("Enter the replacement word :");
        String replace = sc.nextLine();

        String new_sentence = sentence.replaceAll(word, replace);
        System.out.println(new_sentence);
    }
}