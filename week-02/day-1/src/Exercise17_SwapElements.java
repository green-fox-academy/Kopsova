import java.util.Arrays;

public class Exercise17_SwapElements {
    public static void main (String[] [] args){

// - Create an array variable named `abc`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `abc`

        String[] abc = {"first", "second", "third"};
        String b = abc [1];
        abc[2] = abc[1];
        abc[1] = b;
        System.out.println(Arrays.toString(abc));


    }
}
