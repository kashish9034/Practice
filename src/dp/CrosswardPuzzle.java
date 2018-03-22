package dp;

import java.util.Scanner;

public class CrosswardPuzzle {
	static String hints;

	static void crosswordPuzzle(char[][] crossword) {
		
			String index = findStartIndex(crossword);
			int x = index.charAt(0);
			int y = index.charAt(1);
			fillMatrix(crossword, findStringStart("A"), 0, x, y, false);
	}

	static char[][] fillMatrix(char[][] crossword, String str,int index, int x, int y, boolean horizontal) {
		
		
		if(index == str.length()-1){
			crossword[x][y]=str.charAt(index);
			return crossword;
		}
		if(crossword[x + 1][y] == '-' && crossword[x][y + 1] == '-'){
			
			fillMatrix(crossword, findStringStart(str.substring(0,1)), 0, x+1, y, true);
			fillMatrix(crossword, findStringStart(str.substring(0,1)), 0, x, y+1, false);
		}
		if (horizontal) {
			if (crossword[x + 1][y] == '-') {
					crossword[x][y]=str.charAt(index);
					fillMatrix(crossword, str, index+1, x+1, y, true);
			}
		} else if (crossword[x][y + 1] == '-') {
					crossword[x][y]=str.charAt(index);
					fillMatrix(crossword, str, index+1, x, y+1, false);
		}
		
		return crossword;
	}
	
	static String findStringStart(String s){
		String [] arr = hints.split(";");
		for(String x : arr){
			if(x.startsWith(s))
				return x;
		}
		return null;
	}

	static String findStartIndex(char[][] crossword) {

		for (int i = 0; i < 10; i++) {
			
			for (int j = 0; j < 10; j++) {

				if (crossword[i][j] == '-') {
					return "" + i + j;
				}

			}
		}
		return null;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] crossword = new String[10];
		for (int crossword_i = 0; crossword_i < 10; crossword_i++) {
			crossword[crossword_i] = in.next();
		}

		String hints = in.next();
		char[][] crossword_char = new char[10][10];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {

				crossword_char[i][j] = crossword[i].charAt(j);
			}
		}
		CrosswardPuzzle.hints = "AGRA;NORWAY;ENGLAND;GWALIOR";
		crosswordPuzzle(crossword_char);

		
		in.close();
	}

}
