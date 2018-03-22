package threads;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Latches extends Thread {
	private static CountDownLatch cdl;

	public Latches(String string) {
		super(string);
	}

	public void run() {

		System.out.println("running thread " + Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		cdl.countDown();

	}

	public static void main(String[] args) {

		cdl = new CountDownLatch(5);
		ExecutorService exsvc = Executors.newFixedThreadPool(1);

		for (int i = 0; i < 5; i++) {
			exsvc.submit(new Latches("Threadasds" + i));
		}

		exsvc.shutdown();
		try {
			cdl.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Printing this after ending await");
	}

}
