package strings;

import java.util.Scanner;

public class Pangrams {

	public static void main(String[] args) {
		boolean break_flag = false;
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine().toLowerCase();
		sc.close();
		int[] check = new int[256];
		for (int i = 0; i < input.length(); i++) {
			int c = input.charAt(i);
			check[c] = 1;
		}
		for (int i = 97; i <= 122; i++) {
			if (check[i] != 1) {
				break_flag = true;
				break;
			}

		}
		if (break_flag) {
			System.out.println("not pangram");
		} else
			System.out.println("pangram");
	}

}
