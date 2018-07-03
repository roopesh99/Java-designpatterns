package example_Jackson;

import java.io.File;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class jsonTreeExample {

	public static void main(String[] args) {
		try {
			
			long id;
			String firstName="roopes";
			String middleName="ksj";
			String lastName="sfjskdjf";
			
			ObjectMapper mapper = new ObjectMapper();
			
			JsonNode root=mapper.readTree(new File("B:\\user.json"));
			
			     id =root.path("id").asLong();
			     System.out.println(" "+id);
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
}
