package dp;

import java.util.Scanner;

public class Permutations {
static int []array;
	
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		array = new int[size];
		for(int i=0;i<size;i++){
			array[i] = sc.nextInt();
		}
		sc.close();
		permute(0,size-1);
	}
	
	static void permute(int l,int r){
		
		if(l==r){
			for(int i=0;i<array.length;i++){
				System.out.print(array[i]);
			}

			System.out.println();
		}
		else{
			for(int i=l;i<=r;i++){
				swap(l,i);
				permute(l+1,r);
				swap(l,i);
			}
			
		}
		
	}
	static void swap(int index1,int index2){
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
		
	}
	
}
