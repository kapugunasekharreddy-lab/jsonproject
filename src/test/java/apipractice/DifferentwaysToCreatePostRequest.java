package apipractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class DifferentwaysToCreatePostRequest {

//1. using hashmap
//2.using org.json JSONObject data=new JSONObject();
//3. using pojo class
//4.using external file
	
	
		@Test(priority=1)
		 void postusingexternalFile() throws FileNotFoundException {
			String UserName = System.getProperty("user.dir");
			String path=UserName+"\\body.json";
			 File f=new File(path);
			 System.out.println(path);
			 
			 FileReader fr=new FileReader(f);
			 JSONTokener jt=new JSONTokener(fr);
			 
			 JSONObject data=new JSONObject(jt);
			 
			 	Response response=
			 			given()
			 	.contentType("application/json")
			 	.body(data.toString())
			 	
			 	.when()
			 		.post("url");
			 	
//			 	.then
//			 	 	.statuscode(201)
//			 	 	.header("Content-Type","application/soap+xml; charset=utf-8")
		}
		
	

}
