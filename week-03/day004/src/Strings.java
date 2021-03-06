import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Strings {

    // Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.

    public static void main(String[] args) {
        String inputInit = "Xcxxx";
        System.out.println(changeX(inputInit));
    }

    public static String changeX(String input) {
        if (input.length() == 0) {
            return input;
        } else if (input.charAt(0) == 'x') {
            input = 'y' + changeX(input.substring(1));
        } else {
            input = input.substring(0, 1) + changeX(input.substring(1));
        }
        return input;
    }
}
