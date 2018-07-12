package client;

import computerFactory.ComputerFactory;
import computerFactory.ComputerType;
import factory_Design.Computer;

public class Client {

	 public static void main(String[] args) {
		 Computer pc=ComputerFactory.createComputer(ComputerType.PC, "16GB","256Gb","19gb");
	       
		 Computer server=ComputerFactory.createComputer(ComputerType.SERVER, "25gb","514gb","20gb");
		  
		System.out.println("Pc Congifg:: "+pc.getCPU()+" "+pc.getHDD()+" "+pc.getRam());
		
		System.out.println("Server Config:: "+server.getCPU()+" "+server.getHDD()+" "+server.getRam());
		 
	 }
	
}
