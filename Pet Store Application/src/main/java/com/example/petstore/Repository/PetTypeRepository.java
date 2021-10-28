package com.example.petstore.Repository;

import com.example.petstore.Entity.PetType;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PetTypeRepository implements PanacheRepository<PetType> {

    public PetType findByPetTypeId(int id){
       return find("idPetType",id).firstResult();
    }
}
