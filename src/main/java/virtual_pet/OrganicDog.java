package virtual_pet;

    public class OrganicDog extends OrganicPet {
    private int hungerStatus;
    private int thirstStatus;
    private int moodLevel;

    public OrganicDog(String name, int age, int hungerStatus, int thirstStatus, int moodLevel, int hungerStatus1, int thirstStatus1, int moodLevel1) {
        super(name, age, hungerStatus, thirstStatus, moodLevel);
        this.hungerStatus = hungerStatus1;
        this.thirstStatus = thirstStatus1;
        this.moodLevel = moodLevel1;
    }


        public OrganicDog(String name, int age, int hungerStatus, int thirstStatus, int moodLevel) {
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
    // Methods that differentiate organic dog from others

}
