package example_Jackson;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

	public static void main(String[] args) {
		
		EmployeeBean employeeBean=new EmployeeBean();
		employeeBean.setId(0);
		employeeBean.setGender("male");
		employeeBean.setName("Roopesh ");
		employeeBean.setDesignation("Manager");
		
		ObjectMapper objectMapper =new ObjectMapper();
		try {
			//this converts from object to json string
			String jsonStr=objectMapper.writeValueAsString(employeeBean);
			System.out.println(jsonStr);
			
			
			EmployeeBean employeeBean2=new EmployeeBean();
			employeeBean2=objectMapper.readValue(jsonStr, EmployeeBean.class);
			System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(employeeBean2));
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
