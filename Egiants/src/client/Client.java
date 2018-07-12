package client;

import beans.Computer;
import factory.ComputerFactory;
import factory.ComputerType;

public class Client {

	public static void main(String[] args) {

		Computer pc = ComputerFactory.createComputer(ComputerType.PC, "1GB", "256GB", "Intel Core 2 Duo");

		Computer server = ComputerFactory.createComputer(ComputerType.SERVER, "32GB", "1TB", "AMD Ryzen 7 2700X");
		
		System.out.println("PC Config:: "+pc.getCPU()+""+pc.getHDD()+""+pc.getRAM());
		System.out.println("Server Config:: "+server.getCPU()+""+server.getHDD()+""+server.getRAM());
		
		
	}

}

