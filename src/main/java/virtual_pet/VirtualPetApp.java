package virtual_pet;

import java.util.Scanner;

// This is basically the front end of our project.

public class VirtualPetApp {
    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Welcome to the Fellowship of The String Pet Shelter!");

        // Add option to choose pet around here
        // We need to store pet option in a variable (petChoice?)

        System.out.println("We have many different types of pets here who need a home. What type of pet would you like to adopt?");
        System.out.println("Press 1 for a organic pet, 2 for a robotic pet, 3 for an undead pet & 4 to quit the game");
        int petChoice = inputScanner.nextInt();
        inputScanner.nextLine();


        // This part of the code handles how we deal with the user input regarding pet choice.
        // e.g. if user hits 1, they've chosen organic pet.

        while (0 != petChoice && petChoice < 5){
            if (petChoice == 1) {
                System.out.println("What would you like to name your organic pet?");
                String petName = inputScanner.nextLine();
                VirtualPet pet = new VirtualPet(petName);
                System.out.println("Congratulations on adopting your new pet " + petName + "!");
                System.out.println("A pet is a lot of responsibility be sure to pay attention to it's status!");
                break;
            }
            else if (petChoice == 2) {
                System.out.println("What would you like to name your robotic pet?");
                String petName = inputScanner.nextLine();
                VirtualPet pet = new VirtualPet(petName);
                System.out.println("Congratulations on adopting your new pet " + petName + "!");
                System.out.println("A pet is a lot of responsibility be sure to pay attention to it's status!");
                break;

            }
            else if (petChoice == 3) {
                System.out.println("What would you like to name your undead pet?");
                String petName = inputScanner.nextLine();
                VirtualPet pet = new VirtualPet(petName);
                System.out.println("Congratulations on adopting your new pet " + petName + "!");
                System.out.println("A pet is a lot of responsibility be sure to pay attention to it's status!");
                break;
            }
            else if (petChoice == 4) {
                System.out.println("Thanks for playing virtual pet! Come again soon!");
                break;
            }
            // I believe here we want to create a virtualPet & use that to play the greeting.



        }

    }
}
