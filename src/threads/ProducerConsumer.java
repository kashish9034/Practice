package threads;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer {

	private static BlockingQueue<Integer> bq = new ArrayBlockingQueue<Integer>(10);

	public static void main(String[] args) {
		// Creating two threads-> one for consumer other for producer

		Thread consume = new Thread() {

			public void run() {
				consume();

			}
		};

		Thread produce = new Thread() {

			public void run() {

				produce();
			}
		};

		produce.start();
		consume.start();
		try {
			produce.join();
			consume.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	static void produce() {

		try {
			while (true) {
				Thread.sleep(100);
				bq.put(new Random().nextInt(100));
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	static void consume() {

		try {
			while (true) {
				Thread.sleep(500);
				System.out.println("Taking away" + bq.take()+" New size:: " + bq.size());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
