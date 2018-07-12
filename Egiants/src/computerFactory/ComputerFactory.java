package computerFactory;

import factory_Design.Computer;
import factory_Design.Pc;
import factory_Design.Server;

public class ComputerFactory {

	public static Computer createComputer(ComputerType type,
			     String ram,String hdd,String cpu) {
		
	      Computer comp=null;
		switch(type) {
		case PC:
			comp=new Pc(ram,hdd,cpu);
		case SERVER:
			comp=new Server(ram,hdd,cpu);
		
		}
		
		
		
		return comp;
	}
	
	
}
