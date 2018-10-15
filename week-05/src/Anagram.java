import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {
    String firstString;
    String secondString;


    public static  boolean isAnagram (String firstString, String secondString) {
        char[] arr1 = firstString.toLowerCase().toCharArray();
        char[] arr2 = secondString.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean status;
        status = Arrays.equals(arr1, arr2);
        return  status;
    }
    }









