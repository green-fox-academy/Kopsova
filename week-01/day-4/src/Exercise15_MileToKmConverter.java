import java.util.Scanner;

public class Exercise15_MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write distance in km:");
        float km = scanner.nextFloat();
        System.out.println ((km* 0.621371) +" miles");

    }
}
