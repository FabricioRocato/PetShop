package com.petshop.dao;

import com.petshop.entityA.Pet;

import java.util.List;

public interface PetDao {

    List<Pet> getPets();

    public void savePet(Pet thePet);

    public Pet getPet(int theId);

    public void deletePet(int theId);

}
