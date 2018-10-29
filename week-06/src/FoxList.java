import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FoxList {

ArrayList<Fox> foxesInWood = new ArrayList<>();
    public FoxList() {

    }
    public void add(Fox fox){
        foxesInWood.add(fox);
    }

    public ArrayList findGreenFox (){
      List<Fox> result = new ArrayList<Fox>();
      result = foxesInWood.stream().filter(n -> n.color =="green").collect(Collectors.toList());
      return result;


    }

    public ArrayList findGreenPallinda (){


}
