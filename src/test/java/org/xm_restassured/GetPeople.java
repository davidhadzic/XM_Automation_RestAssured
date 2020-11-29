package org.xm_restassured;

import io.restassured.RestAssured;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GetPeople {
    @BeforeSuite
    void setUp(){


    }
    @Test
    void getPeople(){


            RestAssured.baseURI = "https://swapi.dev/api/people/35/";
            given().
                    body("")
                    .when().
                    get()
                    .then().
                    assertThat().statusCode(200)
                    .body("name", equalTo("Padmé Amidala"))
                    .body("height", equalTo("185"))
                    .body("mass", equalTo("45"))
                    .body("hair_color", equalTo("brown"));
        }


    @AfterSuite
    void TearDown (){


    }
}
