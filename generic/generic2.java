import java.util.*;

public class Generics {
    public static void main(String[] args) {
    
        Integer[] iray = {1, 2, 3, 4, 5};
        Character[] cray = {'b', 'u', 'c', 'k', 'y'};

        printMe(iray);
        printMe(cray);
    }

    public static <T> void printMe(T[] x) {
        for(T t: x)
            System.out.printf("%s ", t);

        System.out.println();
    }
}
