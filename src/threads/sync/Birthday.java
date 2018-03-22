package threads.sync;

public class Birthday extends Thread {
	Person p;

	public Birthday(Person p) {

		this.p = p;
		System.out.println("Happy Birthday " + this.p.getName());

	}

	public void run() {
		System.out.println("Increasing the age of this person.. Everyone Clap!! Currently age is " + this.p.getAge());
		try {
			Thread.sleep(5000);
			
			synchronized (p) {
				p.setAge(p.getAge() + 1);
				System.out.println("The new age of " + this.p.getName() + " is " + this.p.getAge());
				System.out.println("Notifying other threads to wake up!");
				p.notify();
			}
			
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		
		
	}
}
