package virtual_pet;
// This is for TDD.

import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.junit.jupiter.api.Test;

import java.util.Scanner;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Class to run tests with our application

public class VirtualPetTest {

    private Object pet;

    @Test
    public void shouldHaveNameInConstructor() {

    }

    @Test
    public void shouldBeAbleToCreatePet() {
        VirtualPet pet = new VirtualPet();

    }

    @Test
    public void petShouldHaveName() {
        VirtualPet underTest = new VirtualPet();

    }

    @Test
    public void petShouldHaveDefaultHunger() {
        VirtualPet underTest = new VirtualPet("");
        int expected = underTest.getHunger();
        assertEquals(expected, 0);
    }

    @Test
    public void petShouldHaveDefaultMood() {
        VirtualPet underTest = new VirtualPet("");
        int expected = underTest.getMood();
        assertEquals(expected, 100);
    }

    @Test
    public void petShouldHaveDefaultCleanliness() {
        VirtualPet underTest = new VirtualPet("");
        int expected = underTest.getCleanliness();
        assertEquals(expected, 100);
    }

    @Test
    public void shouldTick() {
        VirtualPet pet = new VirtualPet("");
        int initialHunger = pet.getHunger();
        pet.tick();
        int hungerAfterTick = pet.getHunger();
        assertEquals(initialHunger = 15, hungerAfterTick);
    }

    @Test
    public void shouldFeed() {
        VirtualPet pet = new VirtualPet("");
        int feedPet = pet.getHunger(); //
        pet.feed();
        int fedPet = pet.getHunger();
        assertEquals(feedPet = 0, fedPet);
    }

    @Test
    public void shouldDrink() {
        VirtualPet pet = new VirtualPet("");
        int petThirst = pet.getThirst();
        pet.drink();
        int wateredPet = pet.getThirst();
        assertEquals(petThirst = 0, wateredPet);
    }

    @Test
    public void shouldPlay() {
        VirtualPet pet = new VirtualPet("");
        int playPet = pet.getMood();
        pet.play();
        int tiredPet = pet.getMood();
        assertEquals(playPet = 100, tiredPet);
    }

    @Test
    public void keepsThirstFromNegative() {
        VirtualPet pet = new VirtualPet("");
        for(int x = 0; x <5; x++) {
            pet.drink();
        }
        assertEquals(0, pet.getThirst());
    }
    @Test
    public void keepsBoredomFromNegative() {
        VirtualPet pet = new VirtualPet("");
        for(int x=0; x <5; x++) {
            pet.play();
        }
        assertEquals(100, pet.getMood());
    }
    @Test
    public void keepsHungerFromNegative() {
        VirtualPet pet = new VirtualPet("");
        for (int x = 0; x < 5; x++) {
            pet.feed();
        }
        assertEquals(0, pet.getHunger());

    }
}