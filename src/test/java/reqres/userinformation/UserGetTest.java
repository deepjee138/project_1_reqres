package reqres.userinformation;

import io.restassured.response.Response;
import org.testng.annotations.Test;
import reqres.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class UserGetTest extends TestBase {

    @Test
    public void getListOfUsersInfo(){
      Response response= given()
               .when()
               .get("/users");
      response.prettyPrint();
      response.then().statusCode(200);


    }
    @Test
    public void getSingleUserInformation(){

        Response response = given()
                .pathParam("id", 8)
                .when()
                .get("/users/{id}");
        response.prettyPrint();
        response.then().statusCode(200);

    }

    }


