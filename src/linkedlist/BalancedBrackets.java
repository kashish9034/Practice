package linkedlist;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		String[] input = new String[no];
		sc.nextLine();
		for (int i = 0; i < no; i++) {
			input[i] = sc.nextLine();
		}
		for(String s: input){
			 System.out.println( (check(s)) ? "YES" : "NO" );
		}
		sc.close();
	}

	static boolean check(String a) {
		final ArrayList<String> opening = new ArrayList<String>();
		opening.add("(");
		opening.add("{");
		opening.add("[");

		final ArrayList<String> closing = new ArrayList<String>();
		closing.add(")");
		closing.add("}");
		closing.add("]");
		
		Stack<String> temp = new Stack<String>();	
		Stack<String> s = new Stack<String>();
		for (int i = 0; i < a.length(); i++) {
			s.add(a.substring(i, i + 1));

		}
		
		int time = s.size();
		for (int i = 0; i < time; i++) {
			if (temp.size() == 0) {
				temp.push(s.pop());
				
			} else {
				if (closing.contains(s.peek())) {
					temp.push(s.pop());
				} else if (opening.contains(s.peek())) {
					if (opening.indexOf(s.peek()) == closing.indexOf(temp.peek())) {
						s.pop();
						temp.pop();
					} else
						return false;

				}

			}
		}

		// System.out.println(s.peek());
		if(temp.size()==0){
		return true;
		}
		else
			return false;

	}
}
