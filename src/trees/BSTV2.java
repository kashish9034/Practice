package trees;

public class BSTV2 {
	static Node root;
	
	public static void main(String[]args){
		root = new Node();
		root.init();
		String answer =((isNodeBinary(root))? "YES": "NO");
		System.out.println(answer);
		
	}
	
	static boolean isLeftTreeLesser(Node n, int data){
		if(n==null)
			return true;
		return data>=n.data && isLeftTreeLesser(n.left, data)&& isLeftTreeLesser(n.right, data);
		
		
	}
	static boolean isRightTreeGreater(Node n, int data){
		if(n==null)
			return true;
		return data<=n.data && isRightTreeGreater(n.left, data) && isRightTreeGreater(n.right, data);
		
		
	}
	
	static boolean isNodeBinary(Node n){
		if(n.left==null && n.right == null)
			return true;
		if(n.data>n.left.data && n.data<n.right.data)
			return isNodeBinary(n.left) && isNodeBinary(n.right) && isLeftTreeLesser(n.left, n.data) && isRightTreeGreater(n.right, n.data);
		else 
			return false;
		
		
		
	}
}
