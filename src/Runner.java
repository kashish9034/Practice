

import strings.OF;

public class Runner implements TrialInt {

	
	public static void main(String... args) {	
		
		String a ="12";
		int i = Integer.valueOf(a.substring(0,1));
		System.out.println(i);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private void primitives(){
		
		OF.insertLine();
		OF.print("byte values ", Byte.MIN_VALUE + " " + Byte.MAX_VALUE + "-- Bytes " + Byte.BYTES);
		OF.print("Character values ",
				(int) Character.MIN_VALUE + " " + (int) Character.MAX_VALUE + "-- Bytes " + Character.BYTES);
		OF.print("Short values ", Short.MIN_VALUE + " " + Short.MAX_VALUE + "-- Bytes " + Short.BYTES);
		OF.print("Integer values ", Integer.MIN_VALUE + " " + Integer.MAX_VALUE + "-- Bytes " + Integer.BYTES);
		OF.print("Long values ", Long.MIN_VALUE + " " + Long.MAX_VALUE + "-- Bytes " + Long.BYTES);
		OF.print("Float values ", Float.MIN_VALUE + " " + Float.MAX_VALUE + "-- Bytes " + Float.BYTES);
		OF.print("Double values ", Double.MIN_VALUE + " " + Double.MAX_VALUE + "-- Bytes " + Double.BYTES);

		// starting with lowest and upcasting;

		// char will not get converted to byte and short. will get converted to
		// int.
		// byte will not convert to char but will convert to short

		byte b = 97;
		char c = 97;
		short s = 97;
		s = b;
		int i = 97;
		i = b;
		i = c;
		i = s;
		long l = 97;
		l = c;
		l = i;
		l = s;
		l = b;

		float f = 97;
		f = b;
		f = c;
		f = l;
		f = i;
		f = s;
		double d = 97;
		d = f;
		d = c;
		d = l;
		d = i;
		d = s;
		d = b;
		boolean asd = true | false;
		String[] arr = new String[2];
		System.out.println(arr[0]);

		// study the effect of | operator on primitives
		System.out.println(Integer.toBinaryString(99));
		System.out.println(Integer.toBinaryString(98));
		System.out.println(Integer.toBinaryString(99));
		int x = 99;
		System.out.println(~99);
		boolean b1 = true, b2 = false;
		if (b1 = b2 = true)
			;
	}
}

