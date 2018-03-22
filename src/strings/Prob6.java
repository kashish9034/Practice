package strings;

import java.util.Scanner;

public class Prob6 {
	static int palindromeIndex(String s){
        // Complete this function
		
		return 0;
		
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = palindromeIndex(s);
            System.out.println(result);
        }
    }
}
