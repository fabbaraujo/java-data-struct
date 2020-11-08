import java.util.*;

public class ListMethods {
    public static void main(String[] args) {
    
        //convert array to list
        Character[] chars = {'p', 'w', 'n'};
        List<Character> l = Arrays.asList(chars);
        System.out.println("List is: ");
        output(l);

        //reverse and print the list
        Collections.reverse(l);
        System.out.println("After reverse: ");
        output(l);

        //create new array and a new list
        Character[] newchars = new Character[3];
        List<Character> listcopy = Arrays.asList(newchars);

        //copy contents of l into listcopy
        Collections.copy(listcopy, l);
        System.out.println("Copy of list: ");
        output(listcopy);

        //fill collection
        Collections.fill(l, 'X');
        System.out.println("After filling the list: ");
        output(l);
    }

    private static void output(List<Character> list) {

        for(Character c : list)
            System.out.printf("%s ", c);

        System.out.println();
    }
}
