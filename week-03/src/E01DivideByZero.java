import java.util.Scanner;

public class E01DivideByZero {
    public static void main(String[] args) {
// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0


        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");
        int divisor = scanner.nextInt();

        try {
            int result = 10/divisor;
            System.out.println(result);
        } catch (ArithmeticException except) {
            System.out.println("Cant divide by 0");
        }
    }

}
