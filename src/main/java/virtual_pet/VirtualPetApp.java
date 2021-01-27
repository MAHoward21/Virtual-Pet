package virtual_pet;

import java.util.Scanner;

public class VirtualPetApp {
    public VirtualPetApp(String petName) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("What would you like to name your pet?");
        petName = inputScanner.nextLine();
        System.out.println("You have chosen to name your pet " + petName);
    }

}
