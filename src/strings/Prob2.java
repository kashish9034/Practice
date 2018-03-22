package strings;

import java.util.Scanner;

public class Prob2 {

	public static void main(String[] args) {
		int count,i;
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		if(input.isEmpty()){
			count=0;
		}
		else{
			count=1;
		}
		for ( i = 0; i < input.length(); i++) {
			if (Character.isUpperCase(input.charAt(i))) {

				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}
}
