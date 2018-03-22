package threads.sync;

public class SyncBlocks {

	public static void main(String[] args) throws InterruptedException {
		Person p = new Person("Kashish", 22);
		// Birthday birth = new Birthday(p);
		Thread t = new Thread(new Birthday(p), "23rd Birthday!");
		Thread y = new Thread(new GetYoung(p),"Make Me young!");
		//synchronized (p) {

			t.start();
			y.start();

		//}
		//p.setAge(100);
		//System.out.println("Changed age to "+ p.getAge());
	}
}
