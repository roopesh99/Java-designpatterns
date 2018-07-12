package beans;

public class server implements Computer{

	private String RAM;
	private String CPU;
	private String HDD;
	
	public server(String ram,String cpu,String hdd) {
		RAM=ram;
		CPU=cpu;
		HDD=hdd;
	}
	
	@Override
	public String getRAM() {
		
		return this.RAM;
	}

	@Override
	public String getCPU() {
		
		return this.CPU;
	}

	@Override
	public String getHDD() {
		
		return this.HDD;
	}

}
