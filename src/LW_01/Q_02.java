package LW_01;

import java.util.Scanner;

public class Q_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = input.next();
        System.out.println("Enter your middle name: ");
        String middleName = input.next();
        System.out.println("Enter your last name: ");
        String lastName = input.next();

        char middleInitial = middleName.charAt(0);
        System.out.println(lastName+','+' '+firstName+' '+middleInitial+'.');
    }
}
