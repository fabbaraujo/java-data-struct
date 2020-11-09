import java.util.*;

public class Threads {
    public static void main(String[] args) {
    
        Thread t1 = new Thread(new Runner("one"));
        Thread t2 = new Thread(new Runner("two"));
        Thread t3 = new Thread(new Runner("three"));
        Thread t4 = new Thread(new Runner("four"));

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}

public class Runner implements Runnable {
    String name;
    int time;
    Random r = new Random();

    public Runner(String x) {
        name = x;
        time = r.nextInt(999);
    }

    public void run() {
        try{
            System.out.printf("%s is sleeping for %d\n", name, time);
            Thread.sleep(time);
            System.out.printf("%s is done\n", name);
        } catch(Exception e) {}
    }
} 
