package threads;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
 //example class to demonstrate locks and interleaved execution
//improved code for https://youtu.be/8sgDgXUUJ68
public class Worker {
   
    //we can't get stageOne() and stageTwo() synchronized
    //because we won't be able to use them concurrently
    //so we use these locks (good practice) to lock everything inside method
    private static Object lock1 = new Object();
    private static Object lock2 = new Object();
   
    private static Random random = new Random();
    private static List<Integer> list1 = new ArrayList<>();
    private static List<Integer> list2 = new ArrayList<>();
   
    //adds sleep for 1 ms and add random item to list1
    public static void stageOne() {
        synchronized (lock1){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                System.err.println(e.toString());
            }
            list1.add(random.nextInt(100));
        }
       
    }
   
    //adds sleep for 1 ms and add random item to list2
    public static void stageTwo() {
        synchronized (lock2){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                System.err.println(e.toString());
            }
            list2.add(random.nextInt(100));
        }
    }
   
    public static void doStages() {
        for (int i=0; i<1000; i++) {
            stageOne();
            stageTwo();
        }
    }
   
    /**
     * @param lambda - way of how we start doStages()
     */
    public static void startAndGetStatistics(Begin lambda) {
        System.out.println("Starting... \t\t\t//wait for aproximately 3 seconds");
        long start = System.currentTimeMillis();
       
        lambda.process();   //here is start (method doStages() launches here)
       
        long end = System.currentTimeMillis();
        System.out.println("Time taken: " + (end-start));
        System.out.println("List1 size: " + list1.size() + "; List2 size: " + list2.size());
    }
   
    public static void main (String [] args) {
        //working without concurrency
        System.out.println("Starting without concurency:");
        startAndGetStatistics(() -> doStages());    //just start do stages
       
        //clearing lists
        list1.clear();
        list2.clear();
       
        //working with concurrency
        System.out.println("\nStarting with concurency:");
        startAndGetStatistics(() -> {
            Thread thread1 = new Thread (() -> doStages());
            Thread thread2 = new Thread (() -> doStages());
            Thread thread3 = new Thread(()-> doStages());
            thread1.start();
            //thread2.start();
            //thread3.start();
            try {
                thread1.join(); //wait for thread1 to stop
                thread2.join(); //wait for thread2 to stop
                thread3.join();
            } catch (InterruptedException e) {
                System.err.println(e.toString());
            }
           
        });
       
        System.out.println("\nConclusion: "
                + "\n\tSometimes we can do twice of our work during same time, using concurrency.");
    }
   
    //required for lambda
    interface Begin {
        void process();
    }
}