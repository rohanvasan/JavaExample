package basics.tokenize;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class StringReverserTest {

    @Test
    public void reverseStringWithTwoWords() {
        assertEquals("World Hello", StringReverser.reverse("Hello World"));

    }
    @Test
    public void reverseStringWithSingleWord() {
        assertEquals("World", StringReverser.reverse("World "));

    }

}