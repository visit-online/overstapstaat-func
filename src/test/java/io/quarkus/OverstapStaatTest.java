package io.quarkus;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

@QuarkusTest
public class OverstapStaatTest
{
    // NOTE: RestAssured is aware of the application.properties quarkus.http.root-path switch

    @Test
    public void testJaxrs() {
        RestAssured.when().get("/overstapstaat").then()
                .statusCode(200)
                .contentType("text/plain")
                .body(equalTo("OverstapStaat jaxrs"));
    }

    @Test
    public void testServlet() {
        RestAssured.when().get("/servlet/overstapstaat").then()
                .statusCode(200)
                .contentType("text/plain")
                .body(equalTo("OverstapStaat servlet"));
    }

    @Test
    public void testVertx() {
        RestAssured.when().get("/vertx/overstapstaat").then()
                .statusCode(200)
                .contentType("text/plain")
                .body(equalTo("OverstapStaat vertx"));
    }

    @Test
    public void testFunqy() {
        RestAssured.when().get("/funqyOverstapStaat").then()
                .statusCode(200)
                .contentType("application/json");
    }
}
