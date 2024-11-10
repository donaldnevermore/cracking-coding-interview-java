package cracking;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PermutationTest {
    @Test void testIsPermutation() {
        assertEquals(false, Permutation.isPermutationAscii("hello", "world"));
        assertEquals(true, Permutation.isPermutationAscii("god", "dog"));

        assertEquals(false, Permutation.isPermutationUnicode("hello", "world"));
        assertEquals(true, Permutation.isPermutationUnicode("god", "dog"));

        assertEquals(false, Permutation.isPermutationMap("hello", "world"));
        assertEquals(true, Permutation.isPermutationMap("god", "dog"));
    }
}
