package trees;

public class Node {
	int data;
	Node left;
	Node right;
	void init(){
		
		this.data = 3;
		this.left = new Node();
		this.right = new Node();
		this.left.left = new Node();
		this.left.right = new Node();
		this.right.left = new Node();
		this.right.right = new Node();
		this.left.data = 2;
		this.right.data = 6;
		this.left.left.data = 1;
		this.left.right.data = 4;
		this.right.left.data = 5;
		this.right.right.data = 7;
	}
}
