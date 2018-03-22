package threads;

import java.util.ArrayList;
import java.util.Random;

//Implementing Producer and Consumer with Wait and Notify
public class ProducerConsumer2 {
	static volatile ArrayList<Integer> shop = new ArrayList<Integer>(10);

	public static void main(String[]args) {
		ProducerConsumer2 pd = new ProducerConsumer2();
		Thread produce = new Thread() {
			public void run() {
				try {
					pd.produce();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};

		Thread consume = new Thread() {
			public void run() {
				try {
					pd.consume();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};

		produce.start();
		consume.start();
		/*try {
			produce.join();
			consume.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

	}

	void consume() throws InterruptedException {
		synchronized (shop) {
			
			while (shop.size() != 10) {
				Thread.sleep(1000);
				int element = new Random().nextInt(100);
				System.out.println("Inserting into shop Item " + element);
				shop.add(element);

				if (shop.size() == 10) {

					shop.notify();
					shop.wait();

				}
			}

		}

	}

	void produce() throws InterruptedException {

		synchronized (shop) {
			
			if (shop.size() == 0) {

				shop.notifyAll();
				shop.wait();

			}
			while (shop.size() != 0) {
				Thread.sleep(1000);
				int index = new Random().nextInt(shop.size());
				System.out.println("Buying Item " + shop.get(index));
				shop.remove(index);

				if (shop.size() == 0) {

					shop.notify();
					shop.wait();

				}
			}

		}
	}

}
