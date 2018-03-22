package design.abstractfactory;

public class IntelFactory extends Factory{

	public CPU getCPU() {
		return new IntelCPU();
	}

	public MMU getMMU() {
		return new IntelMMU();
	}
}
