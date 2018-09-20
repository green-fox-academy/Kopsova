import java.io.PrintStream;
import java.util.Scanner;

public class Exercise14_HelloUser {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input username:");
        String characterName = scanner.nextLine();

        System.out.println("Hello " + characterName);


    }
}
