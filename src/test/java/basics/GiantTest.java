package basics;

import basics.Giant;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GiantTest {

    @Test
    public void sing() {
        Giant giant = new Giant();
        assertEquals("Fee, Fii, basics.Foo, basics.Fum",giant.doIt());
        assertEquals("the implementation", giant.doThat());
    }

}