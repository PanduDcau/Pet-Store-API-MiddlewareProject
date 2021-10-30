package com.example.petstore.Entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
public class PetType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idPetType;

    public PetType() {
    }

    public PetType(int idPetType, String name, int status) {
        this.idPetType = idPetType;
        this.name = name;
        this.status = status;
    }

    public int getIdPetType() {
        return idPetType;
    }

    public void setIdPetType(int idPetType) {
        this.idPetType = idPetType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    String name;
    int status;

    public Collection<Pet> getPetCollection() {
        return petCollection;
    }

    public void setPetCollection(Collection<Pet> petCollection) {
        this.petCollection = petCollection;
    }

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "idPetType")
    private transient Collection<Pet> petCollection;
}
