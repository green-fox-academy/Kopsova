public class String05Reverse {


    public static void main(String... args) {
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // Create a method that can reverse a String, which is passed as the parameter
        // Use it on this reversed string to check it!
        // Try to solve this using charAt() first, and optionally anything else after.


        System.out.println(reverse(reversed));
    }


    public static String reverse(String reversed) {

        int lengthOfReversed = reversed.length();
        String newrewersed = "";


        for (int i = 0; i <lengthOfReversed; i++) {

           newrewersed = newrewersed + reversed.charAt(lengthOfReversed-1-i);
        }

        return newrewersed;
    }
}




