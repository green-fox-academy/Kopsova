public class Numberaded {
    // Write a recursive function that takes one parameter: n and adds numbers from 1 to n.

    public static void main (String [] args) {

        int n = 10;

        System.out.println(addNum(n));

    }
    public static int addNum (int n){

        if( n== 1) {
            return n;
        } else {
            n= n + addNum(n-1);
            return n;
        }
    }



}
