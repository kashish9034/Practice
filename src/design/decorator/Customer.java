package design.decorator;

public class Customer {

	
	public static void main(String[]args) {
		
		Cars car = new Alloys(new BassTube(new Car("Nano","Tata")));
		System.out.println("Cost of car is " +car.getCost());
		System.out.println("Name of car is " +car.getDescription());
	}
}
