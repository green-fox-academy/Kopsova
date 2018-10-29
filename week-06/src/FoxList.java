import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FoxList {

    ArrayList<Fox> foxesInWood = new ArrayList<>();

    public FoxList() {

    }

    public void add(Fox fox) {
        foxesInWood.add(fox);
    }

    public String findGreenFox() {
        List<Fox> result = new ArrayList<Fox>();
        result = foxesInWood.stream().filter(n -> n.color == "green").collect(Collectors.toList());
       // List<Fox> finalResult = result;
        return  result.stream().map(Fox->Fox.name).collect(Collectors.joining(", "));//forEach(n-> result.get(n).name);

    }

    public String findGreenPallinda() {
        List<Fox> result = new ArrayList<Fox>();
        result = foxesInWood.stream().filter(n -> n.color == "green"&& n.type=="pallinda").collect(Collectors.toList())
        ;
        return result.stream().map(Fox ->Fox.name).collect(Collectors.joining( ", "));
    }
}
