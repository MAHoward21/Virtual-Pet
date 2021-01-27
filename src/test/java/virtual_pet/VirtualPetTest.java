package virtual_pet;

import org.junit.jupiter.api.Test;

import java.util.Scanner;
import java.util.Arrays;


public class VirtualPetTest {


    @Test
    public void ShouldBeAbleToCreatePet() {

        VirtualPet pet = new VirtualPet("Bobby");
    }

    @Test
    public void ShouldHaveAName() {
        VirtualPet pet = new VirtualPet("George");
    }



}

