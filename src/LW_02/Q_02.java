package LW_02;

import java.util.Scanner;

public class Q_02 {
    public static int countDigits(int num) {
        if (num == 0) {
            return 1;
        }
        int count = 0;
        while (num != 0){
            num /= 10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.print("Enter an Integer: ");
            int input = sc.nextInt();
            if (input < 0){
                System.out.println("Input value is negative.");
                break;
            }

            else {
                int n = countDigits(input);
                System.out.println("Number of digits = " + n);
            }

        }
        sc.close();
    }
}




