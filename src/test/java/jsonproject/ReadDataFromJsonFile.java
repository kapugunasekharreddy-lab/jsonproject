package jsonproject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadDataFromJsonFile {

	public static void main(String[] args) throws IOException, ParseException {
		
		
		JSONParser jsonparser=new JSONParser();
		FileReader reader=new FileReader(".\\jsonfiles\\employee.json");
		
		Object obj=jsonparser.parse(reader);
		
		JSONObject empjsonobj=(JSONObject)obj;
		
		String fname=(String) empjsonobj.get("firstName");
		String lname=(String) empjsonobj.get("lastName");

		System.out.println("Firstname is "+fname);
		System.out.println("Lastname is "+lname);
		
		JSONArray array=(JSONArray) empjsonobj.get("address");
		
		System.out.println(array.get(0));
		for(int i=0;i<array.size();i++) {
			
			JSONObject address=(JSONObject) array.get(i);
			
			String street=(String) address.get("street");
			String city=(String) address.get("city");
			String state=(String) address.get("state");
			
			System.out.println("Address of "+i+" is ....");
			System.out.println(street +" " +city+" "+state);
		}
	}

}
