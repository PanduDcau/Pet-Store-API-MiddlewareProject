package com.example.petstore.Resource;

import com.example.petstore.Entity.Pet;
import com.example.petstore.Entity.PetType;
import com.example.petstore.Repository.PetTypeRepository;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/pettypes")
@Produces("application/json")
public class PetTypeResource {
    //Insert,Update,Delete,Search -> load,findById,findByName

    //REST API => insert - POST, update - PUT, delete - DELETE, search - GET

    // Endpoint

    @Inject//dependency injection
    PetTypeRepository repo;

    @GET
    public Response loadAll(){

        List<PetType> petTypes = repo.listAll();
        return Response.ok(petTypes).build();
    }

    @POST
    @Transactional
    public Response insertPetType(@RequestBody PetType type){
        repo.persist(type);
        return Response.ok(type).build();
    }

    @GET
    @Path("{id}")
    public Response searchById(@PathParam("id") int id){
       PetType type= repo.findByPetTypeId(id);
       return Response.ok(type).build();
    }

    @PUT
    @Transactional
    public Response update(@RequestBody PetType type){
       PetType currentType= repo.findByPetTypeId(type.getIdPetType());
       currentType.setName(type.getName());
       currentType.setPetCollection(type.getPetCollection());
       repo.persist(currentType);
       return Response.ok(currentType).build();
    }

    @DELETE
    @Path("{id}")
    @Transactional
    public Response delete(@PathParam("id") int id){
       PetType type= repo.findByPetTypeId(id);
       type.setStatus(0);
       //repo.delete();

       return Response.ok(type).build();
    }
}
