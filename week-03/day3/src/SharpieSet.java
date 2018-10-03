import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
    public static void main(String[] args) {

        Sharpie pen = new Sharpie("black", 10);
        Sharpie brush = new Sharpie("pink", 30, 50);
        Sharpie boldPen = new Sharpie("magenta", 15, 0);

        List<Sharpie> allSharpies = new ArrayList<Sharpie>();

        allSharpies.add(pen);
        allSharpies.add(brush);
        allSharpies.add(boldPen);

        System.out.println(countUsable(allSharpies));


        for (int i = 0; i < allSharpies.size(); i++) {
            allSharpies.get(i).print();
        }
        removeTrash(allSharpies);

        for (int i = 0; i < allSharpies.size(); i++) {
            allSharpies.get(i).print();
        }

    }

    public static int countUsable(List<Sharpie> ccc) {
        int count = 0;
        for (int i = 0; i < ccc.size(); i++) {

            if (ccc.get(i).inkAmount > 0) {
                count++;
            }
        }
        return count;
    }



    public static void removeTrash(List<Sharpie> aaa) {
        for (int i = 0; i < aaa.size(); i++) {
            if (aaa.get(i).inkAmount == 0) {
                aaa.remove(i);
            }
        }
    }
}



