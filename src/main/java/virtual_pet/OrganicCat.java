package virtual_pet;

    public class OrganicCat extends OrganicPet {
        private int hungerStatus;
        private int thirstStatus;
        private int moodLevel;

        public OrganicCat(String name, int age, int hungerStatus, int thirstStatus, int moodLevel) {
            super(name, age, hungerStatus, thirstStatus, moodLevel);
        }

        @Override
        public int getMood() {
            return super.getMood();
        }

        @Override
        public void tick() {
            super.tick();
        }


    }


