package virtual_pet;

public abstract class OrganicPet extends VirtualPet {
    private int hungerStatus;
    private int thirstStatus;
    private int moodLevel;

    public OrganicPet(String name, int age, int hungerStatus, int thirstStatus, int moodLevel) {
        super(name);
        this.hungerStatus = hungerStatus;
        this.thirstStatus = thirstStatus;
        this.moodLevel = moodLevel;
    }

    // Method to give water to pet
    public void drink() {
        System.out.println("Thank you for the water.");

        thirst -= 15;
        if (thirst <= 0) {
            thirst = 0;
        }
        if(thirst >= 100){
            thirst = 100;
        }
    }
    public void feed(){
        System.out.println("Thank you for the food!");
        hunger -= 15;
        if (hunger <= 0) {
            hunger = 0;
        }
        if(hunger >= 100){
            hunger = 100;
        }

    }

}
