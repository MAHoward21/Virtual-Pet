package virtual_pet;

public class VirtualPet {

    public static void main(String[] args) {

    }

    private String name;
    private int hunger;
    private int thirst;
    private String mood;

    public VirtualPet (String newName, String newDescription) {
      name = newName;
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
