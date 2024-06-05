import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IterateStringsTest {
    @Test
    @DisplayName("Given input 5, blue, red,it returns blue, red blue, red,blue.")
    public void iterateValueFor5 (){
        String[] values = new String[2];
        values[0]="blue";
        values[1]= "red";
        IterateStrings obj = new IterateStrings();
        List<String> actual = obj.iterateStrings(5,values);
        List<String> expected = new ArrayList<String>(
                Arrays.asList("blue","red","blue","red","blue"));
        Assertions.assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Given input 1, bone, two,three it returns one.")
    public void iterateValueFor1 (){
        String[] values = new String[3];
        values[0]="one";
        values[1]= "two";
        values[2]= "three";
        IterateStrings obj = new IterateStrings();
        List<String> actual = obj.iterateStrings(1,values);
        List<String> expected = new ArrayList<String>(
                Arrays.asList("one"));
        Assertions.assertEquals(expected,actual);
    }
}
