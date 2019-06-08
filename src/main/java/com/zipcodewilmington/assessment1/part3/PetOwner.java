package com.zipcodewilmington.assessment1.part3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    private Pet[] pets;
    private String name;

    public PetOwner(String name, Pet... pets) {
        this.name = name;
        this.pets = pets;
        if (pets != null) {
            for (Pet pet : this.pets) {
                pet.setOwner(this);
            }
        }
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        //addPet(name);
        pet.setOwner(this);
        List<Pet> pets = new ArrayList<>();
        if (this.pets != null) {
            pets = Arrays.asList(this.pets);
        }
        pets.add(pet);
        this.pets = pets.toArray(new Pet[]{});


    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        List<Pet> pets = new ArrayList<>(Arrays.asList(this.pets));
        pets.remove(pet);
        this.pets = pets.toArray(new Pet[]{});
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        if(pet != null && pet.getOwner() != null && pet.getOwner().equals(this)) {
            return true;
        }
        return false;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        Pet min = pets[0];
        for(int i = 1; i < pets.length; i++) {
            if(pets[i].getAge() < min.getAge()) {
                min = pets[i];
            }
        }
        return min.getAge();
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        Pet max = pets[0];
        for(Pet pet : pets) {
            if(pet.getAge() > max.getAge()) {
                max = pet;
            }
        }
        return max.getAge();
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        int sum = 0;
        for(Pet pet: pets) {
            sum += pet.getAge();
        }
        float age = sum / pets.length;
        return age;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {

        return pets.length;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */

    public Pet[] getPets() {
        return pets;
    }
}
