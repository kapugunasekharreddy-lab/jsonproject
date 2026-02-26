package apipractice;

import java.util.ArrayList;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class requestpractice {

	@Test
	public void getrequest() {
		
		
				
				when()
				.get("https://reqres.in/api/users?page=2");
				
				
				
				
		
		ArrayList<String> email = new ArrayList<>();
		//JsonPath jsonPathEvaluator =  response.jsonPath();
		
//		email= jsonPathEvaluator.get("[0].data.email");
//		System.out.println(email);
		
		
				
	}

}
