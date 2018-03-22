package design.builder;

public class Run {

	public static void main(String[] args) {
		Hero SuperMan = new Hero.Builder("SuperMan").addSuperPower("canFly").setDC().build();
		
		System.out.println(SuperMan);
	}

}
