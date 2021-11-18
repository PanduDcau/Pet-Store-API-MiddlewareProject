package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.hasEntry;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.allOf;

@QuarkusTest
public class PetTest {

    @Test
    public void PetsEndpoint() {
        given()
                .when().get("/pets")
                .then()
                .statusCode(200);
//        .body(hasItem(
// 		            allOf(
//    		                hasEntry("idPetType", "2"),
//    		                hasEntry("petName", "Simba"),
//    		                hasEntry("petAge", "4")
//
//    		            )
//    		      )
//    		 );
    }

}
