package ru.netology.postman;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTest {

    @Test
    void shouldPostData() {
        given()
                .baseUri("https://postman-echo.com")
                .body("Lorem ipsum dolor sit amet")

                .when()
                .post("/post")

                .then()
                .statusCode(200)
                .body("data", equalTo("Lorem ipsum dolor sit amet"));
    }
}
