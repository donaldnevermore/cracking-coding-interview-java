package cracking;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class UniqueCharTest {

    @Test
    public void shouldAnswerWithTrue() {
        assertEquals(false, UniqueChar.isUnique("hello"));
        assertEquals(true, UniqueChar.isUnique("world"));
        assertEquals(true, UniqueChar.isUnique("你好世界"));

        assertEquals(false, UniqueChar.isUniqueUnicode("hello"));
        assertEquals(true, UniqueChar.isUniqueUnicode("world"));
        assertEquals(true, UniqueChar.isUniqueUnicode("你好世界"));

        assertEquals(false, UniqueChar.isUniqueAscii("hello"));
        assertEquals(true, UniqueChar.isUniqueAscii("world"));

        assertEquals(false, UniqueChar.isUniqueLowerLetter("hello"));
        assertEquals(true, UniqueChar.isUniqueLowerLetter("world"));
    }
}
