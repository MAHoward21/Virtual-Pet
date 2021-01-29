package virtual_pet;

import java.util.Scanner;

// This is basically the front end of our project.
public class VirtualPetApp {
    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Welcome to the Fellowship Pet Shelter!");

        // Add option to choose pet around here

        System.out.println("What would you like to name your pet?");
        String petName = inputScanner.nextLine();
        VirtualPet pet = new VirtualPet(petName);
        System.out.println("You have chosen to name your pet " + pet.getName() + ". Your pet's hunger is " + pet.getHunger());

    }

}
