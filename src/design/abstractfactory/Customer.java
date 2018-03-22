package design.abstractfactory;

public class Customer {

	public static void main(String[] args) {
			
			Factory one = Factory.getFactory("Intel");
			CPU cpu = one.getCPU();
			System.out.println(cpu.cores()+" "+cpu.frequency);
	}
}
