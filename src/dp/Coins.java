package dp;

import java.util.Scanner;

public class Coins {

	public static void main(String[] args) {
		int amount, no_of_coins;
		Scanner sc = new Scanner(System.in);
		amount = sc.nextInt();
		no_of_coins = sc.nextInt();
		sc.nextLine();
		int coins[] = new int[no_of_coins];
		for (int i = 0; i < no_of_coins; i++) {
			coins[i] = sc.nextInt();
		}

		long[] combinations = new long[amount + 1];
		combinations[0] = 1;
		for (int i = 0; i < no_of_coins; i++) {
		//	System.out.println(" No of Combinations for coin->" + coins[i]);
			for (int j = 1; j <= amount; j++) {
				if (coins[i] <= j) {
					combinations[j] = combinations[j] + combinations[j - coins[i]];
				//	print(combinations);
				}
				// System.out.println(" are" + combinations[]);
			}

		}
		//System.out.println();
		System.out.println(combinations[amount]);
	}
	
	static void print(int[]combinations){
		System.out.println();
		for(int i=0; i<combinations.length;i++)
			System.out.print(combinations[i]);
	}
}
