import java.util.*;

public class ListToArray {
    public static void main(String[] args) {

        String[] stuff = {"babies", "watermelong", "melons", "fudge"};
        LinkedList<String> thelist = new LinkedList<String> (Arrays.asList(stuff));

        thelist.add("pumpking");
        thelist.addFirst("firstthing");

        //convert back to array
        stuff = thelist.toArray(new String[thelist.size()]);

        for(String s : stuff)
            System.out.printf("%s ", s);
    }
}
