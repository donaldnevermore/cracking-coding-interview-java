package cracking;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReplaceSpacesTest {
    @Test
    public void testReplace() {
        var a = "Mr John Smith    ".toCharArray();
        ReplaceSpaces.replace(a, 13);

        assertEquals("Mr%20John%20Smith", new String(a));
    }
}
