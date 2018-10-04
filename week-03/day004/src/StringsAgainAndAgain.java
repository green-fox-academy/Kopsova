public class StringsAgainAndAgain {

    public static void main (String[] args) {
        // Given a string, compute recursively a new string where all the
// adjacent chars are now separated by a "*".
        String inputInit = "Xcxxx";
        System.out.println(changeX(inputInit));
    }

    public static String changeX(String input) {
        if (input.length() == 1) {
            return input;
        } else  {
            input = input.substring(0, 1) +"*"+ changeX(input.substring(1));
        }
        return input;
    }
}
