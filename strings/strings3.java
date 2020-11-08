public class Strings {
    public static void main(String args[]) {
        String a = "Bacon ";
        String b = "monster";
        String c = "    monster    ";

        System.out.println(a + b);
        System.out.println(a.concat(b));
        System.out.println(a.replace('B', 'F'));
        System.out.println(b.toUpperCase());
        System.out.println(c.trim());
    }
}
