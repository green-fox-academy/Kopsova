public class StringsAgain {
    // Given a string, compute recursively a new string where all the 'x' chars have been removed.
    public static void main(String[] args) {
        String inputInit = "Xcxxx";
        System.out.println(changeX(inputInit));
    }

    public static String changeX(String input) {
        if (input.length() == 0) {
            return input;
        } else if (input.charAt(0) == 'x') {
            input = "" + changeX(input.substring(1));
        } else {
            input = input.substring(0, 1) + changeX(input.substring(1));
        }
        return input;
    }
}
