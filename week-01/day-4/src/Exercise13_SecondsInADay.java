public class Exercise13_SecondsInADay {

    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables
        System.out.println((60-currentSeconds) + ( (59-currentMinutes)*60) + ((23 - currentHours) *60 * 60));
    }




}
