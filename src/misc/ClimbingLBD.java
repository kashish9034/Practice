package misc;

import java.util.Scanner;

public class ClimbingLBD {

	static int[] climbingLeaderboard(int[] scores, int[] alice) {
		// Complete this function
		int j = 0, scores_passed = 0;
		int[] result = new int[alice.length];
		int[] scores_uniq = new int[scores.length];
		// initialize base elements
		scores_uniq[0] = scores[0];
		for (int i = 1; i < scores.length; i++) {
			if (scores_uniq[j] != scores[i]) {
				j++;
				scores_uniq[j] = scores[i];

			}
		}
		
		//System.out.println("Alice's Score::Rank");
		for (int i = alice.length - 1; i >= 0; i--) {
			for (int x = scores_passed; x <= j; x++) {
				if (alice[i] >= scores_uniq[x]) {
					result[i] = ++scores_passed;
					scores_passed--;
					//scores_passed++;
				//	System.out.println(alice[i]+"         ::"+result[i]);
					break;
				}
				else if (alice[i] < scores_uniq[x]) {
					scores_passed++;
				}
				if(x==j) {
					result[i] = ++scores_passed;
					scores_passed--;
				//	System.out.println(alice[i]+"         ::"+result[i]);
					break;
				}
			}

		}

		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] scores = new int[n];
		for (int scores_i = 0; scores_i < n; scores_i++) {
			scores[scores_i] = in.nextInt();
		}
		int m = in.nextInt();
		int[] alice = new int[m];
		for (int alice_i = 0; alice_i < m; alice_i++) {
			alice[alice_i] = in.nextInt();
		}
		int[] result = climbingLeaderboard(scores, alice);

		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
		}
		System.out.println("");

		in.close();

	}
}
