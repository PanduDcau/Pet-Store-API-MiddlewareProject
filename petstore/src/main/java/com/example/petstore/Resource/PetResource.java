package com.example.petstore.Resource;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.example.petstore.Entity.Pet;
import com.example.petstore.Entity.PetType;
import com.example.petstore.Repository.PetRepository;
import com.example.petstore.Repository.PetTypeRepository;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;

@Path("/pets")
@Produces("application/json")
public class PetResource {

	@Inject
	PetRepository repo;

	@APIResponses(value = {
			@APIResponse(responseCode = "200", description = "All Pets",
					content = @Content(mediaType = MediaType.APPLICATION_JSON, schema = @Schema(ref = "Pet"))) })
	@GET
	public Response getPets() {
		List<Pet> pets = new ArrayList<Pet>();
		Pet pet1 = new Pet();
//		pet1.setPetId(1);
//		pet1.setPetAge(3);
//		pet1.setPetName("Boola");
//		pet1.setPetType("Dog");
//
//		Pet pet2 = new Pet();
//		pet2.setPetId(2);
//		pet2.setPetAge(4);
//		pet2.setPetName("Sudda");
//		pet2.setPetType("Cat");
//
//		Pet pet3 = new Pet();
//		pet3.setPetId(3);
//		pet3.setPetAge(2);
//		pet3.setPetName("Peththappu");
//		pet3.setPetType("Bird");
//
//		pets.add(pet1);
//		pets.add(pet2);
//		pets.add(pet3);
		return Response.ok(pets).build();
	}

	@APIResponses(value = {
			@APIResponse(responseCode = "200", description = "Pet for id", content = @Content(mediaType = MediaType.APPLICATION_JSON, schema = @Schema(ref = "Pet"))),
			@APIResponse(responseCode = "404", description = "No Pet found for the id.") })
	@GET
	@Path("{petId}")
	public Response getPet(@PathParam("petId") int petId) {
		if (petId < 0) {
			return Response.status(Status.NOT_FOUND).build();
		}
		Pet pet = new Pet();
//		pet.setPetId(petId);
//		pet.setPetAge(3);
//		pet.setPetName("Buula");
//		pet.setPetType("Dog");

		return Response.ok(pet).build();
		
	}
	@Inject//dependency injection
	PetRepository petrep;

	@POST
	@Transactional
	public Response insertPet(@RequestBody Pet pet){
		repo.persist(pet);
		return Response.ok(pet).build();
	}

	@APIResponses(value = {
			@APIResponse(responseCode = "200", description = "Pet for id", content = @Content(mediaType = MediaType.APPLICATION_JSON, schema = @Schema(ref = "Pet"))),
			@APIResponse(responseCode = "404", description = "No Pet found for the id.") })
	@GET
	public Response loadAll(){

		List<Pet> pet = repo.listAll();
		return Response.ok(pet).build();
	}

	@GET
	@Path("/id/{petId}")
	public Response findByPetId(@PathParam("petId") int id){
		Pet type= repo.findByPetId(id);
		return Response.ok(type).build();
	}

	@GET
	@Path("/name/{petName}")
	public Response findByPetId(@PathParam("petName") String name){
		List<Pet> type= repo.findByPetName(name);
		return Response.ok(type).build();
	}

	@PUT
	@Transactional
	public Response update(@RequestBody Pet type){
//		System.out.println(type.getPetId());
		Pet currentType= repo.findByPetId(type.getPetId());
		currentType.setPetName(type.getPetName());
		currentType.setPetAge(type.getPetAge());

		repo.persist(currentType);

		return Response.ok(currentType).build();
	}

	@DELETE
	@Path("{id}")
	@Transactional
	public Response delete(@PathParam("id") int id){
		Pet type= repo.findByPetId(id);
		repo.delete(type);

		return Response.ok(type).build();
	}




}
