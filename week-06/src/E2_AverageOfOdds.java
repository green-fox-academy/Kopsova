import java.util.*;
import java.util.stream.Collectors;

public class E2_AverageOfOdds {

//Write a Stream Expression to get the average value of the odd numbers from the following array:
public static void main (String [] args){

        int sum=0;
        double average = 0;
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));
        OptionalDouble odds;
               odds= numbers.stream().mapToInt(n-> n.intValue()).filter(n->n%2!=0).average();


    }


}
