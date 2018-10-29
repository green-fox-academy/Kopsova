import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class E4_SquareMoreThan20 {
  //  Write a Stream Expression to find which number squared value is more then 20 from the following array:

    public static void main (String [] args){

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));

        List<Double> squaresMoreThan20;
        squaresMoreThan20 = numbers.stream().mapToInt(n-> n.intValue()).filter(n-> new Double (Math.pow(n,2)) >20).mapToObj(n-> new Double(n))
                .collect(Collectors.toList());

        squaresMoreThan20.stream().forEach(n-> System.out.println(n));

    }

}
