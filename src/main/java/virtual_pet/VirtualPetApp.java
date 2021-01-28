package virtual_pet;

import java.util.Scanner;

public class VirtualPetApp {
    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Welcome to the Fellowship Pet Shelter!");
        System.out.println("What would you like to name your pet?");
        String petName = inputScanner.nextLine();

        System.out.println("You have chosen to name your pet " + petName);

    }

}
