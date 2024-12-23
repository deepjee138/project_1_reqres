package reqres.userinformation;

import io.restassured.response.Response;
import org.testng.annotations.Test;
import reqres.model.UserPojo;
import reqres.testbase.TestBase;
import reqres.utils.TestUtils;

import static io.restassured.RestAssured.given;

public class UserPostTest extends TestBase {
    @Test
    public void createUser() {

        String email= TestUtils.getRandomValue()+ "jenny2109@gmail,com";

        UserPojo userPojo=new UserPojo();
        userPojo.setEmail(email);
        userPojo.setFirstName("jenny");
        userPojo.setLastName("patel");
        userPojo.setAvatar("https://reqres.in/img/faces/11-im\n" +
                "age.jpg");

        Response response= given().log().all()
                .header("Content-Type", "application/json")
                .when()
                .body(userPojo)
                .post();
        response.prettyPrint();
        response.then().statusCode(201);


    }
    @Test
    public void verifyUserLoginSuccessFull(){
        Response response= given().log().all()
                .header("Content-Type", "application/json")
                .when()
                .body("{ \"email\": \"Jenny2109@gmail.com\", \"password\": \"cityslicka\" }")
                .post("/api/login");
        response.prettyPrint();
        response.then().statusCode(201);


    }
}
