package virtual_pet;
import java.util.Scanner;

public class VirtualPetShelterApp {
    public static void main(String[] args) {
        System.out.println("Welcome to the Fellowship of the String Virtual Pet Shelter");
        System.out.println("We hold many different types of pets here.");
        System.out.println("Here we care for organic AND robotic pets");
        System.out.println("What would you like to do with our wonderful pets?");
        System.out.println("Press 1 to feed all organic pets");
        System.out.println("Press 2 to give water to all organic pets pets");
        System.out.println("Press 3 to give oil to all robotic pets");
        System.out.println("Press 4 to charge all robotic pets batteries");
        System.out.println("press 5 to give all pets a wash");
        System.out.println("Press 6 to adopt out a pet");
        System.out.println("Press 7 to admit a new pet to the shelter.");
        System.out.println("Press 8 to play with all pets");
        System.out.println("Press 9 to quit the game");

        Scanner inputScanner = new Scanner(System.in);
        int toDoShelterChoice = inputScanner.nextInt();
        while(0 != toDoShelterChoice && toDoShelterChoice < 5){
            if(toDoShelterChoice == 1){
                // Feed all organic pets here

            }
            else if(toDoShelterChoice == 2){
                // Give water to all organic pets

            }
            else if(toDoShelterChoice == 3){
                // Give oil to all robotic pets

            }
            else if(toDoShelterChoice == 4){
                //Give all robotic pets batteries

            }
            else if(toDoShelterChoice == 5){
                // Give all pets a wash

            }
            else if(toDoShelterChoice == 6){
                // Adopt out a pet

            }
            else if(toDoShelterChoice == 7){
                // Admit a new pet to the shelter

            }
            else if(toDoShelterChoice == 8){
                // Play with all pets

            }
            else if(toDoShelterChoice == 9 ){
                // Quit the game
                System.out.println("Thanks for playing with our Virtual Pet Shelter!");
                break;
            }

        }
    }
}
