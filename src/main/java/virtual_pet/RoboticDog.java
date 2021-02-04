package virtual_pet;

import javax.naming.Name;

    public class RoboticDog extends RoboticPet{
    private int batteryLevel;
    private int oilLevel;
    private int moodLevel;

        public RoboticDog(String name, int batteryLevel, int oilLevel, int moodLevel) {
            super(name, batteryLevel, oilLevel, moodLevel);
        }


        // Methods here to overwrite the super class methods and make unique to subclass.

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
            batteryLevel = batteryLevel - 15;
            oilLevel = oilLevel - 15;
        }
    }


