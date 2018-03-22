package strings;

import java.util.Stack;

public class Trial {
	Prob1 prob;
	Trial t;

	public static void main(String[] args) {
		Trial ab = new Trial();
		ab.t.t.t.t.prob = new Prob1();
		Stack<String> stack = new Stack<String>();
		stack.add("a");
		stack.add("ee");
		stack.add("d");
		stack.add("d");
		stack.add("ee");
		stack.add("eeee");
		stack.add("aa");
		stack.add("aaa");
		System.out.println(stack.contains(new String("eeee")));
	}
}
