public class SumDigit {
    // Given a non-negative int n, return the sum of its digits recursively (no loops).
// Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
// divide (/) by 10 removes the rightmost digit (126 / 10 is 12).



    public static void main (String [] args){

int n = 18011977;



        System.out.println(sumDigit(n));

   }

   public static int sumDigit (int d){

        if (d == 0) {

            return d;
        } else {

            d = (d%10) + sumDigit((d/10));

        }
        return d;
   }
}
