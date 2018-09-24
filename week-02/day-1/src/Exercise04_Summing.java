public class Exercise04_Summing {
    public static void main(String[] args) {
        // - Write a function called `sum` that sum all the numbers
//   until the given parameter and returns with an integer

        int[] anArray = {5, 6, 8, 9};
        System.out.println(sum(anArray));
    }

    public static int sum(int[] anArray) {
        int suma = 0;
        for (int i = 0; i < anArray.length; i++) {
            suma += anArray[i];

        }
        return suma;
    }
}


