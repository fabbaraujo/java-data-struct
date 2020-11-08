public class Recursao {
    public static void main(String args[]) {
       System.out.println(fact(5));

      //5!
      //5 * 4!
      //4 * 3!
      //3 * 2!
      //2 * 1!
      //1! = 1
      
      //1
      //2 * 1 = 2
      //3 * 2 = 6
      //4 * 6 = 24
      //5 * 24 = 120
      //120
    }

    //fact
    public static long fact(long n) {
        if(n <= 1)
            return 1;
        else
            return n * fact(n-1);
    }
}
