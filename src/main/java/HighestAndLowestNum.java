import java.util.ArrayList;
import java.util.List;

public class HighestAndLowestNum {
    public List<Integer> getHighestLowest(String input){
        // Split the input string based on spaces
        String[] numbersArray = input.split(" ");

        // Initialize variables to keep track of the highest and lowest numbers
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // Iterate through the array of strings
        for (String numStr : numbersArray) {
            int num = Integer.parseInt(numStr);
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        // Create a list containing the highest and lowest numbers
        List<Integer> result = new ArrayList<>();
        result.add(max);
        result.add(min);
        return result;
    }


}
