package cracking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompressionTest {
    @Test
    void testCompress() {
        assertEquals("a2b1c5a3", Compression.compress("aabcccccaaa"));
    }
}
