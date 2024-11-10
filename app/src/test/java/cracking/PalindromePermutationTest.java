package cracking;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PalindromePermutationTest {
    @Test void test() {
        assertEquals(true, PalindromePermutation.is("Tact Coa"));
        assertEquals(true, PalindromePermutation.is2("odd"));
    }
}
