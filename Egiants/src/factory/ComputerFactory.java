package factory;

import beans.Computer;
import beans.pc;
import beans.server;

public class ComputerFactory {

	public static Computer createComputer(ComputerType type,String ram,String cpu,String hdd)
	{
		Computer comp = null;
		switch (type) {
		case PC:
			comp = new pc(ram, cpu,hdd);
			break;
		case SERVER:
			comp = new server(ram, cpu,hdd);
			break;
		}

		return comp;
	}	
}
