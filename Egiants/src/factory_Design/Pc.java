package factory_Design;

public class Pc implements Computer{
	
	private String RAM;
	private String HDD;
    private String CPU;
    
    public Pc(String ram,String hdd,String cpu) {
    	RAM=ram;
    	HDD=hdd;
    	CPU=cpu;
    }
    

	@Override
	public String getRam() {		
		return this.RAM;
	}

	@Override
	public String getHDD() {	
		return this.HDD;
	}

	@Override
	public String getCPU() {		
		return this.CPU;
	}

}
