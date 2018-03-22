package design.decorator;

public class BassTube extends AbstractAccessory {

	BassTube(Cars car){
		super(car);
	}
	@Override
	public String getDescription() {
		
		return super.getDescription()+" JBL bass tube";
	}

	@Override
	public int getCost() {
		
		return super.getCost() + 10000;
	}

	
	
}
