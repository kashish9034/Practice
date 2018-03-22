package dp;

import java.util.Scanner;

public class PowerSum {
	static int count = 0;
	static double power = 2.0;
	public static void main(String[]args) throws InterruptedException{
		
		Scanner sc = new Scanner(System.in);
		int sum = sc.nextInt();
		sc.nextLine();
		power = Double.parseDouble(sc.nextLine());
		sc.close();
		//System.out.println(Math.sqrt(sum));
		for(int i=1; i<=(int)Math.sqrt(sum);i++){
			//Thread.sleep(1000);
			//System.out.println("calling starts with i " + i);
			sum(sum,i);
			
		}
		System.out.println(count);
	}
	
	static void sum(int sum,int start_num) throws InterruptedException{
		//System.out.println("call sum - with params ::: sum = "+sum +" start = "+start_num);
		 sum = sum - (int)(Math.pow(start_num,power));		
		// System.out.println("Reduced ");
		if(sum == 0){
			//System.out.println("sum zero with " +start_num);
			count++;
			return;
		}
		if(sum<0){
			return;
			
		}
		
		else{
				 int check =(int) Math.pow(sum,(1.0/power));
				 //System.out.println("Check is" + check);
			for(int i=start_num;i<=check; i++){
				//Thread.sleep(1000);
				//System.out.println("Sending another call with sum "+ sum + " and start number " + (i+1));
				sum(sum,i+1);
			}
		}
	}
	
}
