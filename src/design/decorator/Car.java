package design.decorator;

public class Car implements Cars{
	private String name;
	private String company;
	
	Car(String name,String company){
		this.name = name;
		this.company = company;
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}



	@Override
	public String getDescription() {
	
		return "A Car with seating capacity of 4";
	}



	@Override
	public int getCost() {
		
		return 100000;
	}

	
	
}
