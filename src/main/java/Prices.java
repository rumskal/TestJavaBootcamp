import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Prices {
    public static void main(String[] args) {
        List<Map<List<String>, List<Double>>> list = new ArrayList<>();//A
        Map<List<String>, List<Double>> map = new HashMap<>();
        list.add(null);//B
        list.add(map);
        list.add(new HashMap<List<String>, List<Double>>());
        for (Map entry : list) { //C
            System.out.println(entry + "");
        }
    }
}
