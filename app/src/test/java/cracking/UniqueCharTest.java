package cracking;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UniqueCharTest {
    @Test void shouldAnswerWithTrue() {
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
