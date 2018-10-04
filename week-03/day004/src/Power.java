public class Power {
    // Given base and n that are both 1 or more, compute recursively (no loops)
// the value of base to the n power, so powerN(3, 2) is 9 (3 squared).

    public static void main (String [] args){
        int base = 10;
        int n = 3;

        System.out.println(power(base, n));
    }

    public static int power (int base, int n){
        if (n==0){
           int result=1;
             return result;
        } else {
            int result = base * power(base, n - 1);
            return result;
        }
    }
}
