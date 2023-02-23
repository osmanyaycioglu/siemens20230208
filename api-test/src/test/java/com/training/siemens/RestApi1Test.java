package com.training.siemens;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
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
                                      + "    \"firstName\": \"#name#\",\n"
                                      + "    \"lastName\": \"#surname#\",\n"
                                      + "    \"height\": #height#,\n"
                                      + "    \"weight\": 75,\n"
                                      + "    \"birthDate\": \"1981-10-11\",\n"
                                      + "    \"address\": {\n"
                                      + "        \"city\": \"#city#\",\n"
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
        String replace = provisionAddJson.replace("#name#",
                                                  "ali")
                                         .replace("#surname#",
                                                  "veli")
                                         .replace("#height#",
                                                  "185")
                                         .replace("#city#",
                                                  "istanbul");
        given().contentType(ContentType.JSON)
               .body(replace)
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
                     equalTo(185))
               .body("person.weight",
                     equalTo(75))
               .body("person.address.city",
                     equalTo("istanbul"))
               .body("person.address.street",
                     equalTo("kadıköy"))
               .body("person.nicknames",
                     hasItems("aliv",
                              "alvi",
                              "aliş"))
        ;
    }

    @Test
    public void test_api_person_provision_get_with_new_person() {
        String replace1 = provisionAddJson.replace("#name#",
                                                   "ali")
                                          .replace("#surname#",
                                                   "veli")
                                          .replace("#height#",
                                                   "185")
                                          .replace("#city#",
                                                   "istanbul");
        String replace2 = provisionAddJson.replace("#name#",
                                                   "osman")
                                          .replace("#surname#",
                                                   "yay")
                                          .replace("#height#",
                                                   "200")
                                          .replace("#city#",
                                                   "adana");
        Response personResponse1 = given().contentType(ContentType.JSON)
                                          .body(replace1)
                                          .when()
                                          .post("/api/v1/person/provision/add")
                                          .then()
                                          .statusCode(200)
                                          .body("personId",
                                                any(Integer.class))
                                          .extract()
                                          .response();
        Response personResponse2 = given().contentType(ContentType.JSON)
                                          .body(replace2)
                                          .when()
                                          .post("/api/v1/person/provision/add")
                                          .then()
                                          .statusCode(200)
                                          .body("personId",
                                                any(Integer.class))
                                          .extract()
                                          .response();

        Integer personId1 = personResponse1.path("personId");
        Integer personId2 = personResponse2.path("personId");
        Assertions.assertNotEquals(personId1,
                                   personId2);

        System.out.println("Person1 id : " + personId1);
        System.out.println("Person2 id : " + personId2);
        given().pathParam("xyz",
                          personId1)
               .when()
               .get("/api/v1/person/provision/get/{xyz}")
               .then()
               .body("firstName",
                     equalTo("ali"))
               .body("lastName",
                     equalTo("veli"))
               .body("height",
                     equalTo(185))
               .body("weight",
                     equalTo(75))
               .body("address.city",
                     equalTo("istanbul"))
               .body("address.street",
                     equalTo("kadıköy"))
               .body("nicknames",
                     hasItems("aliv",
                              "alvi",
                              "aliş"));

        given().pathParam("xyz",
                          personId2)
               .when()
               .get("/api/v1/person/provision/get/{xyz}")
               .then()
               .body("firstName",
                     equalTo("osman"))
               .body("lastName",
                     equalTo("yay"))
               .body("height",
                     equalTo(200))
               .body("weight",
                     equalTo(75))
               .body("address.city",
                     equalTo("adana"))
               .body("address.street",
                     equalTo("kadıköy"))
               .body("nicknames",
                     hasItems("aliv",
                              "alvi",
                              "aliş"));
        given().pathParam("xyz",
                          "39284732")
               .when()
               .get("/api/v1/person/provision/get/{xyz}")
               .then()
               .statusCode(500)
               .body("message",
                     equalTo("personId yok"));

    }

}
