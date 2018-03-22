
class DogException extends Animal{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String name = "Dog";
	public void get(){
		System.out.println(name);
		System.out.println("I am a dog and a animal");
	}
}
