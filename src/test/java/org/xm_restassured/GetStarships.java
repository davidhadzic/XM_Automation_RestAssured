package org.xm_restassured;

import io.restassured.RestAssured;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GetStarships {
    @BeforeSuite
    void setUp(){


    }
    @Test
    void getStarships(){


        RestAssured.baseURI = "https://swapi.dev/api/starships/2/";
        given()
                .body("")
                .when().
                get()
                .then().
                assertThat().statusCode(200)
                .body("name", equalTo("CR90 corvette"))
                .body("model", equalTo("CR90 corvette"))
                .body("manufacturer", equalTo("Corellian Engineering Corporation"))
                .body("cost_in_credits", equalTo("3500000"));

    }


    @AfterSuite
    void TearDown (){


    }
}
