import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class NumberConverter {

    String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelwe",
            "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    String[] tens = {"", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    String[] hundreds = {"hundred", "thousand", "milion", "bilon", "trilon"};

    int number;

    public String convert(int number) {
        ArrayList<String> superResult = new ArrayList<>();
        superResult.add(from1_000_000till_999_999_999(number));
        superResult.add(from1000to999_999(number));
        superResult.add(from100to999(number));
        if ((number > 100) && !((((number % 100) / 10) == 0) || (number % 10 == 0))) {
            superResult.add("and");
        }
        superResult.add(from1to99(number));


        return superResult.toString()
                .replace("[","").replace("]", "")
                .replace("  ", "").replace(",", "");
    }


public  String from1to99 (int number){
    ArrayList<String> result = new ArrayList<>();
    if (number % 100 <= 19) {
        result.add(ones[number % 100]); // one-nineteen
    } else {
        if (number % 100 > 19) {

            result.add(tens[(number % 100)/10]); // twenty
            result.add(ones[number % 10]); //one
        }
    } return result.toString();
}

public  String from100to999 (int number) {
    ArrayList<String> result = new ArrayList<>();
    if (number > 99) {
        result.add(ones[(number % 1000) / 100]); // one - nine
        if (((number % 1000) / 100) != 0) {
            result.add(hundreds[0]); // hundred
        }
    }
         return result.toString();
    }

public  String from1000to999_999 (int number){
        ArrayList<String> result = new ArrayList<>();
        if (number> 999 && number< 20000) {
            result.add(ones[(number%100000)/1000]); // one-nineteen
            result.add((hundreds[1])); //thousand
        } else {
            if (number > 99999) {
                result.add(ones[(number % 1000000) / 100000]);   //one-nine
                if (number % 1000000 / 100000 !=0) {
                    result.add((hundreds[0])); // hundred
                }
            }
            result.add(tens[number % 100000 / 10000]); // twenty
            result.add(ones[number % 10000 / 1000]); //one
            if (number > 999 && number%10000/1000!=0) {
                result.add((hundreds[1])); //thousand
            }
        }
        return result.toString();
    }

public String from1_000_000till_999_999_999(int number){
        ArrayList<String> result = new ArrayList<>();
        if (number> 999999 && number< 20000000) {
            result.add(ones[(number%100000000)/1000000]); // one-nineteen
           if (number>999999){
               result.add((hundreds[2])); //milion
           }
        } else {
            if (number > 999999) {
                result.add(ones[number % 1000000000 / 100000000]);   //one-nine
                result.add((hundreds[0])); // hundred
            }
            result.add(tens[number % 100000000 / 10000000]); // twenty
            result.add(ones[number % 10000000 / 1000000]); //one
            if (number > 1000000) {
                result.add((hundreds[2])); //milion
            }
        }
        return result.toString();
    }


}
