

package virtual_pet;

public class RoboticPet extends VirtualPet {
    private int batteryLevel;
    private int oilLevel;
    private int moodLevel;


    public RoboticPet(String name, int batteryLevel, int oilLevel, int moodLevel) {
        super(name);
        this.batteryLevel = batteryLevel;
        this.oilLevel = oilLevel;
        this.moodLevel = moodLevel;
    }

    public void batteryCharge() {
        System.out.println("Thank you for charging my battery!");
        batteryLevel += 15;
        if(batteryLevel > 100){
            batteryLevel = 100;
        }
        if(batteryLevel < 0){
            batteryLevel = 0;
        }
    }

    public void changeOil() {
        System.out.println("Thank you for oiling me up!");
        oilLevel += 15;
        if(oilLevel > 100){
            oilLevel = 100;
        }
        if(oilLevel < 0){
            oilLevel = 0;
        }
    }

    @Override
    public void tick() {
        batteryLevel = batteryLevel - 15;
        oilLevel = oilLevel - 15;
    }
}