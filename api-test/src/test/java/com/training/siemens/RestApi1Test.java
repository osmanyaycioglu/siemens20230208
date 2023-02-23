package com.training.siemens;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RestApi1Test {

    @BeforeAll
    public static void setUp() {
        baseURI = "http://127.0.0.1:8080";
    }

    @Test
    public void first_test() {
        String s = get("/api/v1/first/hello").then()
                                             .extract()
                                             .asString();
        Assertions.assertEquals("hello world",
                                s);
    }

    @Test
    public void test_api_getPerson() {
        get("/api/v1/first/person/133").then()
                                       .statusCode(200)
                                       .body("firstName",
                                             equalTo("osman"))
                                       .body("height",
                                             equalTo(200))
                                       .body("weight",
                                             equalTo(95))
                                       .body("birthDate",
                                             equalTo("1970-09-11"))
        ;
    }

    private String provisionAddJson = "{\n"
                                      + "    \"firstName\": \"ali\",\n"
                                      + "    \"lastName\": \"veli\",\n"
                                      + "    \"height\": 200,\n"
                                      + "    \"weight\": 75,\n"
                                      + "    \"birthDate\": \"1981-10-11\",\n"
                                      + "    \"address\": {\n"
                                      + "        \"city\": \"istanbul\",\n"
                                      + "        \"street\": \"kadıköy\"\n"
                                      + "    },\n"
                                      + "    \"nicknames\": [\n"
                                      + "        \"aliş\",\n"
                                      + "        \"aliv\",\n"
                                      + "        \"alvi\"\n"
                                      + "    ],\n"
                                      + "    \"phones\": [\n"
                                      + "        {\n"
                                      + "            \"name\": \"ev\",\n"
                                      + "            \"number\": \"8439759348\"\n"
                                      + "        },\n"
                                      + "        {\n"
                                      + "            \"name\": \"ofis\",\n"
                                      + "            \"number\": \"3812772\"\n"
                                      + "        }\n"
                                      + "    ]\n"
                                      + "}";


    @Test
    public void test_api_person_provision_add_new_person() {
        given().contentType(ContentType.JSON)
               .body(provisionAddJson)
               .when()
               .post("/api/v1/person/provision/add")
               .then()
               .statusCode(200)
               .body("status",
                     equalTo(100))
               .body("personId",
                     any(Integer.class))
               .body("person.firstName",
                     equalTo("ali"))
               .body("person.lastName",
                     equalTo("veli"))
               .body("person.height",
                     equalTo(200))
               .body("person.weight",
                     equalTo(75))
               .body("person.address.city",
                     equalTo("istanbul"))
               .body("person.address.street",
                     equalTo("kadıkö"))
               .body("person.nicknames",
                     hasItems("aliv",
                              "alvi",
                              "aliş"))
        ;
    }

}
