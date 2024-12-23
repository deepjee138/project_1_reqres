package reqres.userinformation;

import org.testng.annotations.Test;
import reqres.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class UserDeleteTest extends TestBase {
    @Test

    public void deleteTheUsers(){
        given().log().all()
                .pathParam("id",8)
                .when()
                .delete("/users/{id}")
                .then()
                .statusCode(204);


    }
}
