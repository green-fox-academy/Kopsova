public class BunniesAgain {
// We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
// (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
// have 3 ears, because they each have a raised foot. Recursively return the
// number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

    public static void main (String [] args){
        int bunnies = 5;

        System.out.println(oddEars(bunnies));
    }

    public static int oddEars (int x) {
        if (  x==1) {
            return 2;
        }
         else if (x%2==0){

            return  3 + oddEars(x-1);
        } else {
             return  2 + oddEars(x-1);
        }
    }

}
