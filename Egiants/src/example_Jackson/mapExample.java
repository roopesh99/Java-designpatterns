package example_Jackson;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class mapExample {

	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String,String>();
		
		map.put("name", "roopesh");
		map.put("age", "12");
		
		ObjectMapper objectMapper =new ObjectMapper();
		
		
		try {
			
			String json=objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(map);
			System.out.println(" "+json);
			
			map = objectMapper.readValue(json, new TypeReference<Map<String, String>>(){});
            System.out.println(" "+map);
			
            
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	} 
	
}
