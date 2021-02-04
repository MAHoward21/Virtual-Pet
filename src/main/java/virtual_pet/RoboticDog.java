package virtual_pet;

import javax.naming.Name;

    public class RoboticDog extends RoboticPet{
    private int batteryLevel;
    private int oilLevel;
    private int moodLevel;

        public RoboticDog(String name, int batteryLevel, int oilLevel, int moodLevel) {
            super(name, batteryLevel, oilLevel, moodLevel);
        }

        @Override
        public void batteryCharge() {
            super.batteryCharge();
        }

        @Override
        public void changeOil() {
            super.changeOil();
        }

        @Override
        public int getMood() {
            return super.getMood();
        }

        @Override
        public void tick() {
            batteryLevel = batteryLevel - 10;
            oilLevel = oilLevel - 10;
        }
    }

    // Possible overrides here?
    // Have to decide how we're going to handle.


