package StepDefination;


import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import io.restassured.http.Method;
import io.restassured.response.Response;


//Test
public class APItest {
	
	@Given("Get request call works")
	public void get_request_call_works() {
	    System.out.println("Step Defination working");
	    //throw new io.cucumber.java.PendingException();
	    RestAssured.baseURI="https://reqres.in/api/users";
	  //Request object
	  RequestSpecification httprequest=RestAssured.given();

	  //Response Object
	  Response response= httprequest.request(Method.GET);

	  //Print  Response in Console
	  String responseBody= response.getBody().asString();
	  System.out.println("Response Body is" +responseBody);


	
	    
	    
	    
	}
	

}
