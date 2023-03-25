package cracking;

import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromePermutationTest {
    @Test
    public void test() {
        assertEquals(true, PalindromePermutation.is("Tact Coa"));

        assertEquals(true, PalindromePermutation.is2("odd"));
    }
}
