package design.decorator;

public class Alloys extends AbstractAccessory{
	
	Alloys(Cars car){
		super(car);
	}
	
	
	@Override
	public String getDescription() {
		
		return super.getDescription()+ " Silver Alloys";
	}

	@Override
	public int getCost() {
		
		return super.getCost() + 4000;
	}
	
	public int spokes() {
		return 20;
	}
	
}
