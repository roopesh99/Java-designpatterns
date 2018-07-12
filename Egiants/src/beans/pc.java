package beans;

public class pc  implements Computer{

	private String RAM;
	private String CPU;
	private String HDD;
	
	public pc(String ram,String cpu,String hdd) {
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
