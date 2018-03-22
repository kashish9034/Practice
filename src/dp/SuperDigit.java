package dp;

import java.util.Scanner;

public class SuperDigit {

	static int digitSum(String n, int k) {
		if (n.length() == 1)
			return Integer.parseInt(n);
		else {
				int sum = 0;
				for(int i=0;i<n.length();i++){
				sum = sum +Integer.parseInt(n.substring(i, i+1));
				}
			return digitSum(String.valueOf(sum), String.valueOf(sum).length());	
		}

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String n = in.next();
		int k = in.nextInt();
		String temp =n;
		//System.out.println(n);
		int result =digitSum(String.valueOf((digitSum(n, k)*k)),k);
		System.out.println(result);
		in.close();
	}
}
