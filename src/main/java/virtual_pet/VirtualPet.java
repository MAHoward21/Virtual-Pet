package virtual_pet;
// This is basically the back-end for our project.
public class VirtualPet {

    public static void main(String[] args) {

    }



    // Defines variables
    private String name;
    private int hunger = 0;
    private int thirst = 0;
    private int mood = 100;
    private int cleanliness = 100;

    public VirtualPet(String newName) {
        name = newName;
    }

    // Method to print greeting to console
    public void greeting() {
        System.out.println("Hi. My name is " + name + "I am so happy you have chosen to be my friend " +
                "I am feeling " + hunger + " I am also feeling " + thirst + "I am feeling " + mood +
                "How can you help me?");


    }

    // Methods to return values for stats

    public String getName() {
        return name;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getMood() {
        return mood;
    }

    public int getCleanliness() {
        return cleanliness;
    }

    // Method to feed pet
    public void eat() {
        hunger -= 5;
        if (hunger < 0) {
            hunger = 0;
        }
    }
    // Method to give water to pet
    public void drink() {
        thirst -= 5;
        if (thirst < 0) {
            thirst = 0;
        }
    }
    // Method to give a pet a treat & increase happiness
    public void play() {
        mood -= 5;
        if (mood < 0) {
            mood = 0;
        }
    }
    // Method to give the pet a bath & improve cleanliness
    public void Bathe() {
        cleanliness -= 0;
        if (cleanliness < 0) {
            cleanliness = 0;
        }
    }
}


