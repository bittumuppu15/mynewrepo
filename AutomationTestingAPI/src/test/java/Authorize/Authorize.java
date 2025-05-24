package Authorize;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Authorize {
public Response getRequest() {
	Response response=RestAssured.given().when().get();
	return response;
}
}
