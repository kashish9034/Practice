package threads.sync;

public class GetYoung extends Thread {
	Person p;

	public GetYoung(Person p) {
		this.p = p;
	}

	public void run() {

		synchronized (this.p) {
				
				
				try {
					
					p.wait();
					System.out.println("This person is getting younger! This will take around 5 seconds");
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				p.setAge(p.getAge()-1);
				System.out.println("The new age is "+ p.getAge());
			//	p.notify();
		}
	}

}
