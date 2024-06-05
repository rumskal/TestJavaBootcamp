import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class HighestLowestNumTest {
        @Test
        @DisplayName("Given list of number, checks highest and lowest number.")
        public void givenNumberFindHighestAndLowest() {
            String input = "23 3 32 67 123 2";
            List<Integer> expected = new ArrayList<>();
            expected.add(123);
            expected.add(2);
            HighestAndLowestNum obj = new HighestAndLowestNum();
            List<Integer> actual = obj.getHighestLowest(input);
            Assertions.assertEquals(expected, actual);
        }
    }

