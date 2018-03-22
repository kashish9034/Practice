package design.decorator;

public abstract class AbstractAccessory implements Cars {
	protected Cars car;

	AbstractAccessory() {
	}

	AbstractAccessory(Cars car) {
		this.car = car;
	}
	@Override
	public String getDescription() {
		
		return this.car.getDescription();
	}

	@Override
	public int getCost() {
		
		return this.car.getCost();
	}

	

}
