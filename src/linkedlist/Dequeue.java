package linkedlist;

import java.util.Scanner;
import java.util.Stack;

public class Dequeue {

	public static class MyQueue<T> {
		private Stack<T> inbox = new Stack<T>();
		private Stack<T> outbox = new Stack<T>();

		public void enqueue(T value) { // Push onto newest stack
			inbox.push(value);
		}

		public T peek() {
			if (outbox.isEmpty()) {
				while (!inbox.isEmpty()) {
					outbox.push(inbox.pop());
				}
			}
			return outbox.peek();
		}

		public T dequeue() {
			if (outbox.isEmpty()) {
				while (!inbox.isEmpty()) {
					outbox.push(inbox.pop());
				}
			}
			return outbox.pop();
		}
	}

	public static void main(String[] args) {
		MyQueue<Integer> queue = new MyQueue<Integer>();	
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			int operation = scan.nextInt();
			if (operation == 1) { // enqueue
				queue.enqueue(scan.nextInt());
			} else if (operation == 2) { // dequeue
				queue.dequeue();
			} else if (operation == 3) { // print/peek
				System.out.println(queue.peek());
			}
		}
		scan.close();
	}
}
