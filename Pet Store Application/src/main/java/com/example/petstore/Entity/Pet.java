package com.example.petstore.Entity;

import javax.persistence.*;

@Entity
@Table(name="pet")
public class Pet {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer petId;

	private String petName;

	private Integer petAge;

	@JoinColumn(name = "idPetType",referencedColumnName = "idPetType")
	@ManyToOne(optional = false)
	private PetType idPetType;

	public PetType getIdPetType() {
		return idPetType;
	}

	public void setIdPetType(PetType idPetType) {
		this.idPetType = idPetType;
	}

	public Integer getPetId() {
		return petId;
	}

	public void setPetId(Integer petId) {
		this.petId = petId;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public Integer getPetAge() {
		return petAge;
	}

	public void setPetAge(Integer petAge) {
		this.petAge = petAge;
	}

}
