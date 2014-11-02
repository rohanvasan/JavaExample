package basics;

import basics.Adder;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class AdderTest {

    @Test
    public void addListOfLongs() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        Number result = Adder.add(integers);
        assertEquals(15,result.longValue());
    }

    public void multiplyListOfNumbers() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        List<Number> result = Adder.multiply(integers, 3);
        result.add(6);
    }

}