package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class AbsoluteDifference {

	public static void main(String[] args) {
		int diff, min = 100000;
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] input = new int[size];
		int prev = input[0];
		for (int i = 0; i < size; i++) {
			input[i] = sc.nextInt();
		}
		for (int i = 1; i < size; i++) {
			// prev = input[i];
			diff = input[i] - prev;
			if (min > Math.abs(diff)) {
				System.out.print("changing min from " + min);
				min = Math.abs(diff);
				System.out.println(" to  " + min);
			}
			prev = input[i];
		}
		System.out.println("Minimum is " + min);
		sc.close();
	}

	
	
}
