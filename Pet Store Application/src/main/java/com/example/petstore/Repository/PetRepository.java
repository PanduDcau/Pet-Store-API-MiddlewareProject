package com.example.petstore.Repository;

import com.example.petstore.Entity.Pet;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PetRepository implements PanacheRepository <Pet> {
    public Pet findByPetId(int id){
        return find("petId",id).firstResult();
    }

}
