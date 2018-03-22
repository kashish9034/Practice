package dp;

import java.util.Scanner;

public class Staircase {
	static int[] ways;

	public static void main(String[] args) {
		int max = 0;

		Scanner sc = new Scanner(System.in);
		int no_of_queries = sc.nextInt();
		int[] input = new int[no_of_queries];
		for (int i = 0; i < no_of_queries; i++) {
			input[i] = sc.nextInt();
			if (input[i] > max) {
				max = input[i];
			}
		}
		ways = new int[max+1];
		ways[0] = 0;
		ways[1] = 1;
		ways[2] = 2;
		ways[3] = 4;
		count(max);
		for (int i=0;i<input.length;i++)
			System.out.println(ways[input[i]]);
		sc.close();
	}

	static void count(int stair_no) {
		if(stair_no<=3)
			return;
		for (int i = 4; i <= stair_no; i++) {
			ways[i] = ways[i]+ ways[i - 1] + ways[i - 2] + ways[i - 3];
		}

		// return ways[stair_no];
	}
}
