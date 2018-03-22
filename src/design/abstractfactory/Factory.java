package design.abstractfactory;

public abstract class Factory {
	public static final IntelFactory in = new IntelFactory();
	public static final AMDFactory am = new AMDFactory();

	public static Factory getFactory(String fact) {

		switch (fact) {
		case "Intel":
			return in;
		case "AMD":
			return am;
		default:
			return null;
		}
	}
	
	public abstract CPU getCPU();

	public abstract MMU getMMU() ;
}
