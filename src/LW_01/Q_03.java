package LW_01;

import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter length in centimetres: ");
        double cm = input.nextDouble();
        double totalInches = cm / 2.54;
        int feet = (int)(totalInches/12);
        double inches = totalInches % 12;

        System.out.printf("%.2f cm = %d feet and %.2f inches%n",cm,feet,inches);
    }
}
