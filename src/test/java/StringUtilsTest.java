import static org.junit.jupiter.api.Assertions.assertEquals;

import edu.sandiego.cs.comp305.StringUtils;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

    @Test
    void testReverseString() {
        assertEquals("orange", StringUtils.reverseString("egnaro"));
    }

    @Test
    void testReverseStringWithEmptyString() {
        assertEquals("", StringUtils.reverseString(""));
    }

    @Test
    void testReverseStringWithOneCharacter() {
        assertEquals("o", StringUtils.reverseString("o"));
    }
}
