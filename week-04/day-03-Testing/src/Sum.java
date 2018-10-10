import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Sum {
ArrayList <Integer> list ;

    public Sum(ArrayList<Integer> list) {
        this.list = list;
    }
//    List <Integer> myList = new ArrayList () ;

    public int sum( ArrayList<Integer> list) {
        this.list=list;

        int s=0;

        for (int i = 0; i < list.size() ; i++) {

           s += list.get(i);
        }
     return s;
    }
}
