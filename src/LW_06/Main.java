package LW_06;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pet> pets = new ArrayList<>();
        ArrayList<Dog> dogs = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        // =========================================================================

        while (true){
            System.out.println("Enter the pet's type and name: (c kitty)");
            String type = input.next();
            if(type.equals("STOP")){
                break;
            }

            String name = input.next();

            switch (type) {
                case "c":
                    Cat cat = new Cat(name);
                    System.out.println("Enter the pet's coat color : ");
                    String coatColor = input.next();
                    cat.setCoatColor(coatColor);
                    pets.add(cat);
                    break;
                case "d":
                    Dog dog = new Dog(name);
                    System.out.println("Enter the pet's weight : ");
                    double weight = input.nextDouble();
                    dog.setWeight(weight);
                    pets.add(dog);
                    dogs.add(dog);
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }

        // =========================================================================

        for  (Pet pet : pets) {
            String type = pet instanceof Dog ? "Dog" : "Cat";
            System.out.println(type + ": " + pet.getName());
        }

        // =========================================================================

        System.out.println("\nThe cats in the array are :");
        for  (Pet pet : pets) {
            if (pet instanceof Cat){
                System.out.println(pet.getName() + " with coat color " + ((Cat) pet).getCoatColor());
            }
        }

        // =========================================================================

        System.out.println("\nThe dogs in the array are :");
        for  (Pet pet : pets) {
            if (pet instanceof Dog){
                System.out.println(pet.getName() + " with a weight of  " +  ((Dog) pet).getWeight());
            }
        }

        // =========================================================================

        double totalWeight = 0;

    }
}