package threads;

import threads.sync.Person;

public class Runner {
 int i = 100;
 
		public Runner(){

	}
		
		static{

		}
	public static void main(String[] args) throws InterruptedException {
		//Thread one = new Thread(new T1(), "one");
		//Thread two = new Thread(new T1(), "two");
		Person p = new Person("Kashish",22);
		T1 t;
		for(int i=0;i<1000;i++){
		t = new T1(p);
		t.start();
		}
		// one.start();
		// waits for the thread on which it is called to die.
		// one.join();
		// two will be started only after one is dead.

		// two.start();

	}
}
