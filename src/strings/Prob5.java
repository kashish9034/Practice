package strings;

import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		sc.close();
		char[] arr = input.toCharArray();
		int count = 0;
		int position;
		for (int i = 0; i < arr.length; i++) {
			
			if (i % 3 == 0 && arr[i] != 'S')
				count++;
			if (i % 3 == 1 && arr[i] != 'O')
				count++;
			if (i % 3 == 2 && arr[i] != 'S')
				count++;

		}
		
		System.out.println(count);
	}
}
