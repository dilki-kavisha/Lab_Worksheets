package LW_01;

import java.util.Scanner;

public class Q_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter outer radius(ro): ");
        double ro = input.nextDouble();
        System.out.println("Enter inner radius (ri): ");
        double ri = input.nextDouble();

        Q_05_circle outerCircle = new Q_05_circle(ro);
        Q_05_circle innerCircle = new Q_05_circle(ri);

        double outerArea = outerCircle.computeArea();
        double innerArea = innerCircle.computeArea();

        double shadedArea = outerArea-innerArea;

        System.out.printf("Area of outer circle: %.2f\n",outerArea);
        System.out.printf("Area of inner circle: %.2f\n",innerArea);
        System.out.printf("Area of circular region: %.2f\n",shadedArea);
    }
}
