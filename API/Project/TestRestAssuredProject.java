package test;

import java.util.HashMap;

import java.util.Map;
import static org.hamcrest.Matchers.equalTo;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestRestAssuredProject {

	
	RequestSpecification reqSpecification;
	String sSSH="";
	int id;
	
	
	
 @BeforeClass
 public void setup() {
	 reqSpecification= new RequestSpecBuilder()
	 .setContentType(ContentType.JSON)
	 .setBaseUri("https://api.github.com").log(LogDetail.ALL)
	 .addHeader("Authorization", "Token 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")
	 .build();
	    
	   
 }
	
  @Test(priority=1)
  public void TestPOSTAPI() {
	  
	  String reqBody = "{\"title\": \"TestAPIKey\",\"key\": \"ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQC1WzOx9n8MvzCBwVNK1Fw2/lSW8ms8n/JVkWYZm/Ip+bmINYLPIYjIHShQsjFjQNeeWE6q6SQkF1qVmpky0zMWWctYGjsDnzDr7/NG9sbm2VVONCFgLxeM+IqarNk9qG4a2NmeI7zCdL3QiKeqW2ssed7oH0RQARc26JME8FMzJylAI9DZ6uubOPCRZgWWIheiqnIDuDEN0aJAlDcxtimMt0cu/+PieLMhdRyOdazPn7gImqyg3mMjdvTHPuDeqWKKxJwn85Lac4th+sS85UK5FSZtyoFLNSwCShVRznS3omGOWF2WdvkWnGrT2LaPwvSLKfna4E4omYd77tPtuvV0l+IAn5xE/ckagm7jieWEWdvdOr5ea5ytmlMerrhYLe3BQa4EoKtGTkhnKrpf8glrOdtgqery1yuJomRbNNP77y+EMMJvmJewxBcDP6RG1mHbc3FYpz9vDMRkaOCnio+G9JsBvZrKtVrE1DuM8Li2W8vdksYC1z5Wp9Qlsynh338=\"}";
	    
	    Response response = given().spec(reqSpecification)
	     .body(reqBody)		
	     .when().post("/user/keys");  // Send POST request
	    
	    String body=response.getBody().asPrettyString();
	    System.out.println(body);
		id=response.then().extract().path("id");			
			 response.then().statusCode(201);
			 
  }
  @Test(priority=2)
  public void TestGETAPI() {
	  
	 System.out.println("Executing GET Method for API"+id);	
      
	  // Send GET Request
	  Response response = given().spec(reqSpecification)
			  .pathParam("keysid", id)
	  .when().get("/user/keys/{keysid}");   		//  details with GET
		//	  .when().get().path("/user/keys/{keysid}");
	  Reporter.log("After executing Get Method");
	  
	  response.then().statusCode(200);
  }
  @Test(priority=3)
  public void TestDELETEAPI() {
	
	  
	  Reporter.log("Executing DELETE Method for API");	
		  Response response = given().spec(reqSpecification)
				  .pathParam("keysid", id)
			  .when().delete("/user/keys/{keysid}");  // Send DELETE request
			//	  .when().delete().path("/user/keys/{keysid}");
		  
	    Reporter.log("After executing DELETE METHOD");	
	    response.then().statusCode(204);
	        
	  
  }
}

