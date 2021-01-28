package virtual_pet;

public class virtualPetCat {


        public static void main(String[] args) {

        }

        private String name;
        private int hunger;
        private int thirst;
        private String mood;

        public virtualPetCat (String name, int hunger, int thirst, String mood) {
            this.name = name;
            this.hunger = hunger;
            this.thirst = thirst;
            this.mood = mood;

        }
        public void greeting(){
            System.out.println("Hi. My name is" + name+ "I am so happy you have chosen to be my friend" +
                    "I am feeling" + hunger + " I am also feeling" + thirst + "I am feeling" + mood +
                    "How can you help me?");

        }
        public String getName(){
            return name;
        }
        public int getHunger(){
            return hunger;
        }
        public int getThirst() {
            return thirst;
        }
        public String getMood(){
            return mood;
        }
}


