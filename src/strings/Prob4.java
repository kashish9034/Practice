package strings;

import java.util.Scanner;

public class Prob4 {

	public static void main(String[] args) {
		int check;

		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		String input = sc.next();
		int key = sc.nextInt();
		
		sc.close();
		char[] arr = input.toCharArray();
		char[] result = new char[length];
		for (int i = 0; i < arr.length; i++) {
			check = (int) arr[i];
			if (check >= 65 && check <= 90) {
				check = (check - 65 + key) % 26;
				check = check + 65;
				result[i] = (char) check;
			} else if (check >= 97 && check <= 122) {
				check = (check - 97 + key) % 26;
				check = check + 97;
				result[i] = (char) check;
			}
			else{
				result[i]=arr[i];
				
			}
			
		//	System.out.println("input was " + arr[i] + " output is "+ result[i]);
		}
		
		for(char a: result)
			System.out.print(a);
	}

}
