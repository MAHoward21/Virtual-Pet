package virtual_pet;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;



public class VirtualPetShelter {

    // Creates a Map
    HashMap<String, VirtualPet> petsInShelter = new HashMap<String, VirtualPet>();

    // Creates a method to admit pets to petsInShelter

    public void admitPet(String name, VirtualPet pet) {
        petsInShelter.put(name, pet);
    }

    // Create method to find a pet

    public VirtualPet grabAllPets(String Name) {
        return petsInShelter.get(Name);

    }

    // Method to adopt out pets (remove pet)
    public void adoption(String Name) {
        petsInShelter.remove(Name);
    }

    // Feed pet method for all of shelter w/ a count/ advanced for loop
    public void feedPets(){
        for(Entry<String, VirtualPet> fedPet: petsInShelter.entrySet()) {
            fedPet.getValue().feed();
        }
    }

    // Water pet method similar to feed
    public void waterPets() {
        for (Entry<String, VirtualPet> wateredPets : petsInShelter.entrySet()) {
            wateredPets.getValue().drink();
        }
    }

    // Method to play with all pets
    public void playWithPet(String petName) {
            petsInShelter.get(petName).play();
        }


    // Tick Method
    public void tick() {
        for (Entry<String, VirtualPet> beenTickedPet : petsInShelter.entrySet()) {
            String key = beenTickedPet.getKey();
            petsInShelter.get(key).tick();
        }
    }


    // Method to grab the number of pets

    public int getNumberOfPets() {
            return petsInShelter.size();
        }

    // Method to check for dead pets
    public boolean arePetsDead(){
            boolean isPetDead = true;
            for (Entry<String, VirtualPet> lookedAt : petsInShelter.entrySet()){
                String key = lookedAt.getKey();
                if(petsInShelter.get(key).getIsThisPetAlive()) {
                    isPetDead = false;
                }
            }
            return arePetsDead();
        }

    // Method to display the status of pets
    public String showStatus() {
        String showStatusOfPets = "";
        for (Entry<String, VirtualPet> eachPet : petsInShelter.entrySet()) {
            showStatusOfPets += eachPet.getValue() + "/n";
        }
        return showStatusOfPets;
    }

    // Method to display the names & descriptions of pets
        public String showNameAndText(){
            String namesAndText = "";
            for(Entry<String, VirtualPet> eachPet : petsInShelter.entrySet()){
                namesAndText += "[" + eachPet.getValue().getName() + "] " + eachPet.getValue()
                        + "\n";
            }
            return namesAndText;
        }

    }