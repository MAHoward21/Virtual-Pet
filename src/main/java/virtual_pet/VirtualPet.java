package virtual_pet;

public class VirtualPet {

    public static void main(String[] args) {

    }




    private String name;
    private int hunger = 0;
    private int thirst = 0;
    private int mood = 0;
    private int cleanliness = 100;

    public VirtualPet(String newName, String newDescription) {
        name = newName;
    }

    public void greeting() {
        System.out.println("Hi. My name is" + name + "I am so happy you have chosen to be my friend" +
                "I am feeling" + hunger + " I am also feeling" + thirst + "I am feeling" + mood +
                "How can you help me?");

    }

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

    public void feed() {
        hunger -= 5;
        if (hunger < 0) {
            hunger = 0;
        }
    }

    public void giveWater() {
        thirst -= 5;
        if (thirst < 0) {
            thirst = 0;
        }
    }

    public void giveTreat() {
        mood -= 5;
        if (mood < 0) {
            mood = 0;
        }
    }

    public void giveBath() {
        cleanliness -= 0;
        if (cleanliness > 0) {
            cleanliness = 0;
        }
    }

}

