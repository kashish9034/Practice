package dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;


public class PasswordCracker {
	static ArrayList<String> array;
	static HashMap<String,String> memo = new HashMap<String,String>();
	
	static String pwdCrack(String attempt/*,String prevResult,String prevAttempt*/){
		//System.out.println("Previous Result : "+prevResult+"Previous Attempt:" + prevAttempt);
		ArrayList<String> keys = getStringStart(attempt.substring(0, 1), attempt.length());
		String temp1="",temp2="";
		if(keys==null)
			return "#";
		for(String x:keys){
			if(x.equals(attempt)){
				return x;
			}
			else{
				 temp1= pwdCrack(attempt.substring(0,x.length())/*,prevResult,attempt*/);
				 temp2=pwdCrack(attempt.substring(x.length())/*,prevResult+" " +temp1+" ",attempt*/);
			}
		}
		if(temp2=="#")
			return "#";
		else
			return temp1+" "+temp2;
	
	}
	
	
	
	
/*
	static String passwordCracker(String attempt, String result) throws InterruptedException {
		ArrayList<String> results = new ArrayList<String>();
		if (attempt.length() == 0) {
			return result.trim();
		}
		String cache = memo.get(attempt);
		if(cache!=null){
			System.out.println("results fetched from cache for attempt:"+ attempt + " result: "+ result);
			results.add(passwordCracker(attempt.substring(cache.length()), result+ " "+cache));
		}
		else{
		for (int i = 1; i <= attempt.length(); i++) {
			ArrayList<String> keys = getStringStart(attempt.substring(0, i), attempt.length());

			if (keys != null) {
				for (String x : keys) {

					String match = attempt.substring(0, x.length());
					if (match.equals(x)) {
						String result_store = result;
						result = result + match + " ";
						results.add(passwordCracker(attempt.substring(x.length()), result));
						result = result_store;
					}

				}
				i = i + findMin(keys)-1;

			}

		}
		}
		//System.out.println(results.size());
		for(String r:results){
			if(!r.equals("#")){
				memo.put(attempt, r);
				return r;
			}
		}
		return "#";

	}
*/
	/*private static int findMin(ArrayList<String> keys) {

		int min = Integer.MAX_VALUE;
		for (String str : keys) {
			if (str.length() < min) {
				min = str.length();
			}
		}

		return min;
	}*/

	static ArrayList<String> getStringStart(String s, int length) {
		ArrayList<String> l = new ArrayList<String>();
		int i = 0;
		for (String key : array) {
			if (key.startsWith(s) && key.length() <= length) {
				l.add(i, key);
				i++;
			}
		}
		if (i == 0)
			return null;
		else
			return l;
	}

	public static void main(String[] args) throws InterruptedException {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			String[] pass = new String[n];
			for (int pass_i = 0; pass_i < n; pass_i++) {
				pass[pass_i] = in.next();
			}
			String attempt = in.next();
			array = new ArrayList<String>(Arrays.asList(pass));
			System.out.println(pwdCrack(attempt/*,"",""*/));
			/*String result  = passwordCracker(attempt, "");
			result= result.equals("#")?"WRONG PASSWORD":result;
			System.out.println(result);
			*/array = null;
		}
		in.close();
	}

}
