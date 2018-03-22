package design.abstractfactory;

public class AMDFactory extends Factory{
	public CPU getCPU() {
		return new AMDCpu();
	}

	public MMU getMMU() {
		return new AMDMMU();
	}
}
