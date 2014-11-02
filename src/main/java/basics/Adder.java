package basics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by coffee on 10/31/14.
 */
public class Adder {
    /**
     * Integer extends Number, covariance used since type erasure prevents using List<Number>
     */
    public static Number add(List<? extends Number> numbers) {
        Number result = 0;
        for (Number n : numbers) {
            result = n.longValue() + result.longValue();
        }
        return result;
    }


    public static List<Number> multiply(List<? extends Number> numbers, int multiplier) {
        List<Number> result = new ArrayList<Number>();
        for (Number n : numbers) {
            result.add(n.longValue() * multiplier);
        }
        return result;
    }
}
