package basics;

import basics.java8.Giant;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GiantTest {
    /**
     * Two interfaces with the same method, both have a common implementation.
     * Cannot have default method for conflicting name in both the interfaces, causes compile time error.
     */

    @Test
    public void sing() {
        Giant giant = new Giant();
        assertEquals("Fee, Fii, Foe, Fum",giant.doIt());
        assertEquals("the implementation", giant.doThat());
    }

}