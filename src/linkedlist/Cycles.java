package linkedlist;

public class Cycles {

	public static void main(String[] args) {
		Node n = new Node();
		n.data = 10;
		n.next = new Node();
		n.next.data = 11;
		n.next.next = new Node();
		n.next.next.data = 10;
		System.out.println(hasCycle(n));
	}

	static boolean hasCycle(Node head) {
		if (head == null) {
			return false;

		}
		Node temp = head;
		Node temp2 = head.next;
		
			while (temp!=temp2) {
				try {
					temp = temp.next;
					temp2 = temp.next.next;
					if (temp == temp2) {
						return true;
					
					}
				} catch (NullPointerException e) {
					//System.out.println("NPT");
					return false;
				}
			
		}

			return false;
	}

}
