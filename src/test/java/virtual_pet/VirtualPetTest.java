package virtual_pet;
// This is for TDD.

import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.junit.jupiter.api.Test;

import java.util.Scanner;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Class to run tests with our application

public class VirtualPetTest {

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
        assertEquals(initialHunger - 5, hungerAfterTick);
    }
}



