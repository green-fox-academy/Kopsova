import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.stream.Collectors;
//Create a Fox class with 3 properties(name, type, color) Fill a list with at least 5 foxes, it's up to you how
// you name/create them! Write a Stream Expression to find the
// foxes with green color! Write a Stream Expression to find the foxes with green color and pallida type!

public class E10_MainFox {

    public static void main(String[] args) {

        FoxList myFoxes = new FoxList();
        myFoxes.add(new Fox("Lilly", "pallinda", "green"));
        myFoxes.add(new Fox("Kiki", "vulpes", "red"));
        myFoxes.add(new Fox("Miky", "pallinda", "green"));
        myFoxes.add(new Fox("Snowie", "polar", "white"));
        myFoxes.add(new Fox("Sparky", "polar", "green"));



        System.out.println(myFoxes.findGreenFox());
        System.out.println(myFoxes.findGreenPallinda());

    }
}
