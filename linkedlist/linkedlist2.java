import java.util.*;

public class Performance {
    public static void main(String args[]) {

        ArrayList arraylist = new ArrayList();
        LinkedList linkedlist = new LinkedList();

        //ArrayList add
        long starttime = System.nanoTime();

        for(int i = 0; i < 100000; i++) {
            arraylist.add(i);
        }

        long endtime = System.nanoTime();
        long duration = endtime - starttime;
        System.out.println("ArrayList add: " + duration);

        //LinkedList add
        starttime = System.nanoTime();

        for(int i = 0; i < 100000; i++) {
            linkedlist.add(i);
        }

        endtime = System.nanoTime();
        duration = endtime - starttime;
        System.out.println("LinkedList add: " + duration);

        //ArrayList get
        starttime = System.nanoTime();
        
        for(int i = 0; i < 100000; i++) {
            arraylist.get(i);
        }

        endtime = System.nanoTime();
        duration = endtime - starttime;
        System.out.println("ArrayList get: " + duration);

        //LinkedList get
        starttime = System.nanoTime();

        for(int i = 0; i < 100000; i++) {
            linkedlist.get(i);
        }

        endtime = System.nanoTime();
        duration = endtime - starttime;
        System.out.println("LinkedList get: " + duration);

        //ArrayList remove
        starttime = System.nanoTime();

        for(int i = 99999; i >= 0; i--) {
            arraylist.remove(i);
        }

        endtime = System.nanoTime();
        duration = endtime - starttime;
        System.out.println("ArrayList remove: " + duration);

        //LinkedList remove
        starttime = System.nanoTime();

        for(int i = 99999; i >= 0; i--) {
            linkedlist.remove(i);
        }

        endtime = System.nanoTime();
        duration = endtime - starttime;
        System.out.println("LinkedList remove: " + duration);
    }
}
