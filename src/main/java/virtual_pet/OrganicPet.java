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

    public void feed(){
        System.out.println("Thank you for the food!");
    }
    public void drink(){
        System.out.println("Thank you for the water!");
    }
    public void play(){
        System.out.println("Thanks for playing with me!");
    }

}
