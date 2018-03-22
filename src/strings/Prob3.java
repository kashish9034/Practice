package strings;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Prob3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		ArrayList<Integer> result = new ArrayList<Integer>();
			
		String input = sc.next();

		sc.close();
		//System.out.println("<----------calling test method()String---------->");
		if(input.length()==2){
			System.out.println(test(input));
		}
		else{
		char arr[] = findDistinct(input);
		String distinct="",remove="";
		for(char a: arr){
			distinct = distinct + String.valueOf(a);
			
		}
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i + 1; j < arr.length; j++) {
				//System.out.print(String.valueOf(initial) + String.valueOf(arr[j]) + " ");
				remove=distinct.replaceAll(String.valueOf(arr[i]), "" ).replaceAll(String.valueOf(arr[j]), "");
				//System.out.println("The characters to be removed are ->>" + remove);
				remove = "["+remove+"]";
				result.add(test(input.replaceAll(remove, "")));
			}
		}
		Collections.sort(result);
		if(result.size()!=0){
		System.out.println(result.get(result.size()-1));
		}
		else
			System.out.println(0);
	}}
	
	

	public static char[] findDistinct(String input) {
		int z, no_of_uniq = 0;
		int arr[] = new int[256];
		for (int i = 0; i < input.length(); i++) {
			z = (int) input.substring(i, i + 1).charAt(0);
			arr[z] = 1;
		}

		for (int i = 0; i < 256; i++) {
			if (arr[i] == 1) {
				no_of_uniq++;
			}
		}

		char[] result = new char[no_of_uniq];

		for (int i = 0, j = 0; i < 256; i++) {
			if (arr[i] == 1) {
				result[j] = (char) i;
				j++;
			}
		}
		return result;
	}

	public static int test(String input) {
		//System.out.println("Testing for " + input);
		String a1 = input.substring(0, 1);
		String a2 = input.substring(1, 2);
		if(a1.equals(a2)) return 0;
		//System.out.println("A1; " + a1);
		//System.out.println("A2; " + a2);
		int count = 0;
		for (int i = 0; i < input.length(); i++) {

			//System.out.println("The character is " + input.substring(i, i + 1));
			if (i % 2 == 0) {
				if (input.substring(i, i + 1).equals(a1)) {
					count++;
				}
				else{
					return 0;
				}
			} else {
				if (input.substring(i, i + 1).equals(a2)) {
					count++;
				}
				else{
					return 0;
				}
			}

		}
		//System.out.println("The count is " + count + " and length of input string is " + input.length());

		if (count < input.length() - 1) {
			return 0;
		} else
			return count;
	}
}
