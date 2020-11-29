package org.xm_restassured;

import io.restassured.RestAssured;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GetPlanets {
    @BeforeSuite
    void setUp(){


    }
    @Test
    void getPlanets(){


        RestAssured.baseURI = "https://swapi.dev/api/planets/35/";
        given()
                .body("")
                .when().
                get()
                .then().
                assertThat().statusCode(200)
                .body("name", equalTo("Malastare"))
                .body("rotation_period", equalTo("26"))
                .body("orbital_period", equalTo("201"))
                .body("diameter", equalTo("18880"));

    }


    @AfterSuite
    void TearDown (){


    }
}
