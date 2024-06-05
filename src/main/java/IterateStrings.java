import java.util.ArrayList;
import java.util.List;

public class IterateStrings {
    public List<String> iterateStrings(int numOfItems, String[] values){
        List<String> result = new ArrayList<>();
        int valueIndex = 0;

        for (int i = 0; i < numOfItems; i++) {
            result.add(values[valueIndex]);
            valueIndex = (valueIndex + 1) % values.length;
        }
        return result;

    }
}
