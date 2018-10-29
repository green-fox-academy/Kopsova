import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class E3_Squared {


   //Write a Stream Expression to get the squared value of the positive numbers from the following array:
   public static void main (String [] args){

       ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

      // DoubleStream squaredPositive ;
       List <Double> squaredPositive;
       squaredPositive =  numbers.stream().filter(n -> n>=0).map(n-> new Double ( Math.pow(n,2))).
               collect(Collectors.toList());
       //nebo
//       squaredPositive =  numbers.stream().mapToInt(n-> n.intValue()).filter(n -> n>=0).mapToObj(n-> new Double ( Math.pow(n,2))).
//       collect(Collectors.toList());
//

       squaredPositive.stream().forEach(n-> System.out.println(n));
   }
}
