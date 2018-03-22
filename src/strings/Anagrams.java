package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import javax.swing.text.StyleContext.SmallAttributeSet;

public class Anagrams {

	public static void main(String[] args) {
		int fucking_result=0;
		char[] big_array, s_array;
		Scanner sc = new Scanner(System.in);
		String one = sc.nextLine();
		String two = sc.nextLine();

		big_array = one.toCharArray();
		s_array = two.toCharArray();
		int [] arr = no_of_occ(big_array);
		int [] arr2 = no_of_occ(s_array);
		for(int i=97;i<=122;i++){
			//System.out.print((char)i + "-" + arr[i]+",");

			//System.out.print((char)i + "-" + arr2[i]+",");
			fucking_result=fucking_result+Math.abs(arr[i]-arr2[i]);
		}
		System.out.println(fucking_result);
	}

	
	public static int[] no_of_occ(char[]arr){
		int result[]=new int[256];
		for(int i=97;i<=122;i++){
			result[i]=0;
		}
		for(int i=0;i<arr.length;i++){
			int index = (int)arr[i];
			result[index]=result[index]+1;
		}
		
		return result;
	}
}
