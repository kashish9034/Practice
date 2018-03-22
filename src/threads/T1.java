package threads;

import threads.sync.Person;

public class T1 extends Thread {
	Person p;
	
	public T1(Person p){
		this.p=p;
	}
	
	public void run() {
	//	System.out.println("<-----------" + currentThread().getName() + "------------->");
		//System.out.println("Thread starts now");
		try {
			
			synchronized(p){
				p.setAge(p.getAge()+1);
				System.out.println(p.getAge());
				p.setAge(p.getAge()-1);
			}

			
		} catch (Exception ee) {
			ee.printStackTrace();
		}
		//System.out.println("Thread ending now");
	}

}
