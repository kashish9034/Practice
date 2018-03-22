import java.io.IOException;
 import static java.lang.System.out;
public class Trial {
	int no;
	String data;
	// final static variables can be initialized in a static block. Cannot be done other way.
	
	
	
	public void abc(Object a){
		
		
	};
	public void abc(String a){};
	
	public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
		
		int [] ia ={1,2};
		int i =0;
		ia[0] = i =30;
		Thread t = new Thread(){
			public void run(){
				System.out.println("executing new thread");
				try {
					Thread.sleep(5000);
					System.out.println("Waking up back");
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		};
		System.out.println("Starting anonymous class thread. Will wait for it to end then i will come back up again");
		t.start();
		t.join();
		System.out.println("Apparently it has ended. I am running again");
		//long - int conversion and auto-boxing
		/*int a = 100;
		long b = 1000;
		b = a ;
		char x = 100;
		System.out.println((char)b + " " + x);
		
		*/
	
		
		//Messing with local dates
		
		/*LocalDate today = LocalDate.now();
		System.out.println(today.getDayOfMonth());
		System.out.println(today.getDayOfYear());
		System.out.println(today.getDayOfWeek().getValue());
		System.out.println(today.getMonthValue());
		System.out.println(today.getYear());
		System.out.println(today.getChronology());
*/
		
		//Object Serialization and Deserialization
		
		/*
		Trial o = new Trial();
		o.no = 100;
		o.data = "Abc";
		FileOutputStream file = new FileOutputStream("Kashish.txt");
		ObjectOutputStream obs = new ObjectOutputStream(file);
		obs.writeObject(o);
		FileInputStream filei = new FileInputStream("Kashish.txt");
		obs.close();
		ObjectInputStream in = new ObjectInputStream(filei);
		Trial t = (Trial) in.readObject();
		System.out.println(t.data);
		System.out.println(t.no);

*/		
		//printing size of primitives
		
		/*System.out.println(Double.MAX_VALUE +" " + Double.BYTES);
		
		 int i = 2147483647;  
		 i=i+100000000; 
		 System.out.println(i);
		 System.out.println(Integer.MAX_VALUE + " "+Integer.BYTES);
		 System.out.println(Long.MAX_VALUE + " "+ Long.BYTES);
		 System.out.println(Byte.MAX_VALUE + " "+ Byte.BYTES);
		 System.out.println(Short.MAX_VALUE);
		 System.out.println(Math.pow(2, 63)-1); 
		  */
	
	
	
	
	
	
	
	
	
	
	
	}
	
	final static int class_variable;
	
	
	static {
		class_variable = 100;
		 String abc = new String();
	}
	

	public void method(){
		System.out.println("Super Class method");
	}
}









