package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ransom {

	
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		 int m = sc.nextInt();
	     int n = sc.nextInt();
	     sc.nextLine();
		String one = sc.nextLine();
		String two = sc.nextLine();
		boolean answer=solve(one,two);
		if(answer)
            System.out.println("Yes");
        else System.out.println("No");
	}
	
	
public static boolean solve(String one,String two) {
	String[]arr=one.split(" ");
	String[]arr2 = two.split(" ");
	ArrayList<String> arl1 = new ArrayList<String>(Arrays.asList(arr));

	ArrayList<String> arl2 = new ArrayList<String>(Arrays.asList(arr2));
	for(String s: arl2)
	{	
		if(arl1.contains(s)){
		//	System.out.println("checking containership of "+s);
			arl1.remove(s);
		}
		else{
			return false;
		}
	}
	
	return true;
    }
}
