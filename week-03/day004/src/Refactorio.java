public class Refactorio {

    // Create a recursive function called `refactorio`
// that returns it's input's factorial

    public static void main(String[] args) {


        int n = 4;

        System.out.println(refactorio(n));
    }

    public static int refactorio(int number) {

        if (number <= 1) {
            return 1;
        } else {

            return number * refactorio(number - 1);
        }

    }
}
