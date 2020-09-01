package data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONDataReader {

	
public String password , email, pilgrimname, passportnumber, filenumber, Companylicensenumber;
	
	public void jsonReader() throws FileNotFoundException, IOException, ParseException {
		
		String filePath = System.getProperty("user.dir")+"/src/test/java/data/UserData.json";
		File srcFile = new File(filePath);
		JSONParser parser = new JSONParser();
		JSONArray jArray = (JSONArray) parser.parse(new FileReader(srcFile));
		for (Object jsonObj : jArray) {
			
			JSONObject user =  (JSONObject) jsonObj;


			email = (String) user.get("email");
			System.out.println(email);
			
			password = (String) user.get("password");
			System.out.println(password);

		}

	}
	
	
	public void jsonReader1() throws FileNotFoundException, IOException, ParseException {
		
		String filePath = System.getProperty("user.dir")+"/src/test/java/data/PilgrimData1.json";
		File srcFile = new File(filePath);
		JSONParser parser = new JSONParser();
		JSONArray jArray = (JSONArray) parser.parse(new FileReader(srcFile));
		for (Object jsonObj : jArray) {
			
			JSONObject user =  (JSONObject) jsonObj;


			pilgrimname = (String) user.get("pilgrimname");
			System.out.println(pilgrimname);
			
			passportnumber = (String) user.get("passportnumber");
			System.out.println(passportnumber);
			
			filenumber = (String) user.get("filenumber");
			System.out.println(filenumber);
			
			Companylicensenumber = (String) user.get("Companylicensenumber");
			System.out.println(Companylicensenumber);
		}

	}
	
	public void jsonReader2() throws FileNotFoundException, IOException, ParseException {
		
		String filePath = System.getProperty("user.dir")+"/src/test/java/data/PilgrimData2.json";
		File srcFile = new File(filePath);
		JSONParser parser = new JSONParser();
		JSONArray jArray = (JSONArray) parser.parse(new FileReader(srcFile));
		for (Object jsonObj : jArray) {
			
			JSONObject user =  (JSONObject) jsonObj;

			
			Companylicensenumber = (String) user.get("Companylicensenumber");
			System.out.println(Companylicensenumber);
		}

	}
	
	public void jsonReader3() throws FileNotFoundException, IOException, ParseException {
		
		String filePath = System.getProperty("user.dir")+"/src/test/java/data/PilgrimData3.json";
		File srcFile = new File(filePath);
		JSONParser parser = new JSONParser();
		JSONArray jArray = (JSONArray) parser.parse(new FileReader(srcFile));
		for (Object jsonObj : jArray) {
			
			JSONObject user =  (JSONObject) jsonObj;

			
			pilgrimname = (String) user.get("pilgrimname");
			System.out.println(pilgrimname);
		}

	}
	
	
	public void jsonReader4() throws FileNotFoundException, IOException, ParseException {
		
		String filePath = System.getProperty("user.dir")+"/src/test/java/data/PilgrimData4.json";
		File srcFile = new File(filePath);
		JSONParser parser = new JSONParser();
		JSONArray jArray = (JSONArray) parser.parse(new FileReader(srcFile));
		for (Object jsonObj : jArray) {
			
			JSONObject user =  (JSONObject) jsonObj;

			
			pilgrimname = (String) user.get("pilgrimname");
			System.out.println(pilgrimname);
			
			passportnumber = (String) user.get("passportnumber");
			System.out.println(passportnumber);
			
			filenumber = (String) user.get("filenumber");
			System.out.println(filenumber);
			
			Companylicensenumber = (String) user.get("Companylicensenumber");
			System.out.println(Companylicensenumber);
		}

	}
}
