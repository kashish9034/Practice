package strings;

import java.util.*;

public class Prob1 {
	int abc;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		sc.close();
		char[] arr = input.toCharArray();
		Stack<Character> s = new Stack<Character>();
		Stack<Character> s2 = new Stack<Character>();
		for (int i = arr.length-1; i>=0 ; i--)
			s.push(arr[i]);

		s2 = reduce(s);

		if (s2.size() == 0) {
			System.out.println("Empty String");
		} else {
			for (int i = 0; i <  s2.size(); i++) {
				System.out.print(s2.get(i));

			}

		}
	}

	public static Stack<Character> reduce(Stack<Character> s) {

		Character a = ' ', c = ' ';
		Stack<Character> s2 = new Stack<Character>();
		while (!s.isEmpty()) {
			a = s.pop();
			try {

				if (!s2.isEmpty()) {
					c = s2.firstElement();
					if (c == a) {
						//System.out.println("eating a pair of " + a + " --1 from each stack");
						s2.pop();
						break;
					}
				}
				Character b = s.pop();
				if (a == b) {
					//System.out.println("eating a pair of " + a);
				} else {
					s.push(b);
					s2.push(a);

				}

			} catch (EmptyStackException e) {
				s2.push(a);
				//System.out.println("Only one element left in stack");

			}

		}

		return s2;
	}
}
