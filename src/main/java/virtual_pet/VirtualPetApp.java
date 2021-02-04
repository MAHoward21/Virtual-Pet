package virtual_pet;

import java.util.Collection;
import java.util.Scanner;

// This is basically the front end of our project.

public class VirtualPetApp {
    private static String petName;

    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Welcome to the Fellowship of The String Pet Shelter!");

        // Add option to choose pet around here
        // We need to store pet option in a variable (petChoice?)

     System.out.println("We have many different types of pets here who need a home. What type of pet would you like to adopt?");
        System.out.println("Press 1 to adopt an organic pet.");
        System.out.println("Press 2 to adopt a robotic pet");
        System.out.println("Press 3 to adopt an undead pet");
        System.out.println("Press 4 to choose not to adopt a pet and exit the game");
        System.out.println("Hmm, What will you choose?");
        int petChoice = inputScanner.nextInt();
        inputScanner.nextLine();


        // This part of the code handles how we deal with the user input regarding pet choice.
        // e.g. if user hits 1, they've chosen organic pet.
        VirtualPet pet = new VirtualPet(petName);
        while (0 != petChoice && petChoice < 5){
            if (petChoice == 1) {
                System.out.println("What would you like to name your organic pet?");
                String petName = inputScanner.nextLine();
                pet = new VirtualPet(petName);
                System.out.println("Congratulations on adopting your new organic pet " + petName + "!");
                System.out.println("A pet is a lot of responsibility be sure to pay attention to it's status!");
                break;
            }
            else if (petChoice == 2) {
                System.out.println("What would you like to name your robotic pet?");
                String petName = inputScanner.nextLine();
                pet = new VirtualPet(petName);
                System.out.println("Congratulations on adopting your new robotic pet " + petName + "!");
                System.out.println("A pet is a lot of responsibility be sure to pay attention to it's status!");
                break;

            }
            else if (petChoice == 3) {
                System.out.println("What would you like to name your undead pet?");
                String petName = inputScanner.nextLine();
                pet = new VirtualPet(petName);
                System.out.println("Congratulations on adopting your new undead pet " + petName + "!");
                System.out.println("A pet is a lot of responsibility be sure to pay attention to it's status!");
                break;
            }
            else if (petChoice == 4) {
                System.out.println("Thanks for playing virtual pet! Come again soon!");
                break;
            }
        }
        // I believe here we want to create a virtualPet & use that to play the greeting.

        System.out.println("Would you like to check your pets stats?");
        System.out.println("Press 1 for yes & 2 to say no & close the game");
        int decisionToCheckStats = inputScanner.nextInt();
        inputScanner.nextLine();
        while(0 !=decisionToCheckStats && decisionToCheckStats < 3){
            if(decisionToCheckStats == 1){
                System.out.println("Your pets hunger is " + pet.getHunger());
                System.out.println("Your pets thirst is " + pet.getThirst());
                System.out.println("Your pets hunger is " + pet.getCleanliness());
                System.out.println("Your pets hunger is " + pet.getMood());
                break;
            }
            else {
                System.out.println("Thanks for coming to our shelter, hope to see you again!");
            }
        }

        }

    }
