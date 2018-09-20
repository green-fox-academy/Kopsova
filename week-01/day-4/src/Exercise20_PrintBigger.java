import java.util.Scanner;

public class Exercise20_PrintBigger {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type 2 numbers. Hit ENTER after typing each.");
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        if (a > b) {
            System.out.println(a);
        } else {
            if (a == b) {
                System.out.println("same numbers");
            } else {
                System.out.println(b);
            }
        }
    }
}




