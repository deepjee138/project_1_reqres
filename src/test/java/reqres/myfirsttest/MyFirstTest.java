package reqres.myfirsttest;


import io.restassured.response.Response;
import org.testng.annotations.Test;
import reqres.testbase.TestBase;

import static io.restassured.RestAssured.given;

/**
 * Created by Jay Vaghani
 */
public class MyFirstTest extends TestBase {

    @Test
    public void getListOfUserInfo() {
//        given()
//                .when()
//                .get("/list")
//                .then().log().all()
//                .statusCode(200);

        //*************************************************************************//
        Response response= given()
                .when()
                .get("/users");
        response.prettyPrint();
        response.then().statusCode(200);


    }
}