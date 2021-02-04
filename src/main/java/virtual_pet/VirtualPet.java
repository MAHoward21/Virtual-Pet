package virtual_pet;
// This is basically the back-end for our project.
public class VirtualPet {


    public VirtualPet(String name, int hunger, int thirst, int mood, int cleanliness, String color, boolean isAlive, boolean isPetAlive) {
        this.name = name;
        this.hunger = hunger;
        this.thirst = thirst;
        this.mood = mood;
        this.cleanliness = cleanliness;
        this.color = color;
        this.isAlive = isAlive;
        this.isPetAlive = isPetAlive;
    }

    public VirtualPet() {

    }

    public static void main(String[] args) {

    }


    // Constructors
    private String name;
    private int hunger = 0;
    private int thirst = 0;
    private int mood = 100;
    private int cleanliness = 100;
    private String color;
    private boolean isAlive;

    public VirtualPet(String newName) {

    }

    // Method to print greeting to console
    // Not using because it can't grab the petName we create through the input scanner.

    public void greeting() {
        System.out.println("Hi. My name is " + name + " I am so happy you have chosen to be my friend " +
                " I am feeling " + hunger + " I am also feeling " + thirst + " I am feeling " + mood +
                " How can you help me?");
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

    public boolean isPetAlive = true;

    // Method to feed pet
    public void feed() {
        hunger -= 5;
        if (hunger <= 0) {
            hunger = 0;
        }
        if(hunger >= 100){
            hunger = 100;
        }
    }
    // Method to give water to pet
    public void drink() {
        thirst -= 5;
        if (thirst <= 0) {
            thirst = 0;
        }
        if(thirst >= 100){
            thirst = 100;
        }
    }
    // Method to give a pet a treat & increase happiness
    public void play() {
        System.out.println("You play with " + name + "they are overjoyed at the attention");
        mood += 20;
        if (mood <= 0) {
            mood = 0;
        }
        if(mood >= 100){
            mood = 100;
        }
    }
    // Method to give the pet a bath & improve cleanliness
    public void bathe() {
        cleanliness += 20;
        if (cleanliness < 0) {
            cleanliness = 0;
        }
        if(cleanliness >= 100){
            cleanliness = 100;
        }
    }
    public void tick(){
        mood -= 15;
        thirst += 15;
        hunger += 15;
        cleanliness -= 15;
    }

    public boolean getIsThisPetAlive(){
        return isPetAlive;
    }
}


