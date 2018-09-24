public class Exercise06_PrintParams {
    public static void main(String[] args){

// - Create a function called `printParams`
//   which prints the input String parameters
// - It can have any number of parameters

// Examples
// printParams("first")
// printParams("first", "second")
// printParams("first", "second", "third", "fourh")
// ...
        String [] bucky ={ "first", "second", "third","fourth", "fifth"};
        System.out.println(printParams(bucky));

    }
    public static String printParams (String[] bucky) {
        String output = "";
        for (int i = 0; i < bucky.length; i++) {
            output = output + " " + bucky[i];

        }
        return output;


    }
}
