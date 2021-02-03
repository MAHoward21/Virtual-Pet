

package virtual_pet;

public class RoboticPet extends VirtualPet{
    private int batteryLevel;
    private int oilLevel;
    private int moodLevel;


    public RoboticPet(String name, int batteryLevel, int oilLevel, int boredomLevel){
        super(name);
        this.batteryLevel = batteryLevel;
        this.oilLevel = oilLevel;
        this.moodLevel = moodLevel;
    }

    public void batteryCharge(){
        System.out.println("Thank you for charging my battery!");
    }

    public void changeOil(){
        System.out.println("Thank you for oiling me up!");
    }
}
