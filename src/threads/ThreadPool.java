package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool extends Thread {

	public void run() {

		try {
			System.out.println(Thread.currentThread().getName() + " Starting");
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName() + " Finishing");

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		System.out.println("Time taken with pool size of 1= " + startExperiment(1));
		System.out.println("Time taken with pool size of 5= " + startExperiment(5));
		System.out.println("Time taken with pool size of 10= " + startExperiment(10));
		

	}

	public static long startExperiment(int PoolSize) {
		ExecutorService exsvc = Executors.newFixedThreadPool(PoolSize);
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10; i++) {

			exsvc.submit(new ThreadPool());
		}
		exsvc.shutdown();
		long end = System.currentTimeMillis();

		return end - start;

	}

}
