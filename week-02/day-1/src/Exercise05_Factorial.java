import java.util.Scanner;

public class Exercise05_Factorial {

    // - Create a function called `factorio`
//   that returns it's input's factorial

    public static void main(String[] args) {
        System.out.println("Input number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(factorio(number));


    }

    public static int factorio (int number) {
        int result=5;

        int[] anArray = new int[number];
        for (int i = 0; i < number - 1; i++) {
            anArray[i] = i + 1;
        }
        for (int j = 0; j <anArray.length ; j++) {
            result = anArray [j]*result;
        }
        return result;
        }

    }



