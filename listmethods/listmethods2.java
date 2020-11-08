import java.util.*;

/**
 * listmethods2
 */
public class ListMethods2 {

    public static void main(String[] args) {
        String[] stuff = {"applets", "beef", "corn", "ham"};
        List<String> list1 = Arrays.asList(stuff);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("youtube");
        list2.add("google");
        list2.add("digg");

        for(String s : list2)
            System.out.printf("%s ", s);

        Collections.addAll(list2, stuff);
        System.out.println();

        for(String s : list2)
            System.out.printf("%s ", s);

        System.out.println();

        System.out.println(Collections.frequency(list2, "digg"));

        boolean tof = Collections.disjoint(list1, list2);

        System.out.println(tof);

        if(tof)
            System.out.println("these list do not have anything in common");
        else
            System.out.println("the lists must have something in common");
    }
}