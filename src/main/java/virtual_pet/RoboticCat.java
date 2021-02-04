package virtual_pet;

public class RoboticCat extends RoboticPet {
    private int batteryLevel;
    private int oilLevel;
    private int moodLevel;

    public RoboticCat(String name, int batteryLevel, int oilLevel, int moodLevel){
        super(name, batteryLevel, oilLevel, moodLevel);

        this.batteryLevel = batteryLevel;
        this.oilLevel = oilLevel;
        this.moodLevel = moodLevel;

    }
    @Override
    public void tick() {
        batteryLevel = batteryLevel - 15;
        oilLevel = oilLevel - 15;
    }


    // Same situation as w/ dog we're going to need our overridden methods down here
    // So whatever makes our roboticCat different from it's parent class really.

}
