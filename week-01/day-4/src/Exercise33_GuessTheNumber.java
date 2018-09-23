import java.util.Scanner;

public class Exercise33_GuessTheNumber  {

    public static void main(String[] args) {

        // Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stried number is lower
// You found the number: 8

        Scanner scanner = new Scanner(System.in);
        int givenNo = 8;
        int userinput = 0;
        while (userinput != givenNo) {
            System.out.println("Guess the number");
            userinput = scanner.nextInt();
            if (userinput > givenNo) {
                System.out.println("The stored number is lower");
            } else if (userinput < givenNo) {
                System.out.println("Given number is higher");
            }
        }
                System.out.println("You found the number: " + givenNo);
    }
}










