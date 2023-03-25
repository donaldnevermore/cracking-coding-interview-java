package cracking;

import org.junit.Test;
import static org.junit.Assert.*;

public class CompressionTest {
    @Test
    public void testCompress() {
        assertEquals("a2b1c5a3", Compression.compress("aabcccccaaa"));
    }
}
