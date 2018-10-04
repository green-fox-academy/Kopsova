public class Counter {

   // Write a recursive function that takes one parameter: n and counts down from n.

    public static void main (String [] args) {

        int n=100;

        countFunction(n);
    }

    public static int countFunction (int n){
        if( n== 1) {
            System.out.println(n);
            return n;
            } else {
            System.out.print(n + ", ");
             n= countFunction(n-1);

                return n;
        }

    }
}
