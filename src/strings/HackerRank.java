package strings;

import java.util.Scanner;

public class HackerRank {
	public static final char[] form = { 'h', 'a', 'c', 'k', 'e', 'r', 'r', 'a', 'n', 'k' };

	static String hackerrankInString(String s) {
		// Complete this function
		int j = 0;
		for (int i = 0; i < s.length(); i++) {
			if(j==form.length)
				break;
			if (s.charAt(i) ==  form[j]) {
				j++;
			}
		}

		if (j == form.length)
			return "YES";
		else
			return "NO";
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			String s = in.next();
			String result = hackerrankInString(s);
			System.out.println(result);
		}
		in.close();
	}

}
