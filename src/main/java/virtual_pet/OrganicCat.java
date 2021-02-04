package virtual_pet;

    public class OrganicCat extends OrganicPet{
    private int hungerStatus;
    private int thirstStatus;
    private int moodLevel;

        public OrganicCat(String name, int age, int hungerStatus, int thirstStatus, int moodLevel) {
            super(name, age, hungerStatus, thirstStatus, moodLevel);
        }

        @Override
        public int getHunger() {
            return super.getHunger();
        }

        @Override
        public int getThirst() {
            return super.getThirst();
        }

        @Override
        public int getMood() {
            return super.getMood();
        }

        @Override
        public int getCleanliness() {
            return super.getCleanliness();
        }

        @Override
        public void bathe() {
            super.bathe();
        }

        @Override
        public void tick() {
            super.tick();
        }

        @Override
        public boolean getIsThisPetAlive() {
            return super.getIsThisPetAlive();
        }
    }

////Methods to override other methods tailored to OrganicCat will go below this