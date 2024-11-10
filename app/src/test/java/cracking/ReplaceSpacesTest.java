package cracking;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReplaceSpacesTest {
    @Test void testReplace() {
        var a = "Mr John Smith    ".toCharArray();
        ReplaceSpaces.replace(a, 13);
        assertEquals("Mr%20John%20Smith", new String(a));
    }
}
