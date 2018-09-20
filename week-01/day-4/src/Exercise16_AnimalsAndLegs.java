import java.util.Scanner;

public class Exercise16_AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many chickens?");
        int c = scanner.nextInt();
        System.out.println("How man5y pigs?");
        int p = scanner.nextInt();

        System.out.println(((c*2) + (p*4))+ " legs");



    }
}
