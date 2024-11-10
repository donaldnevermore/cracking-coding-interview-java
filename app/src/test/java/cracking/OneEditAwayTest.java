package cracking;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OneEditAwayTest {
    @Test void shouldAnswerWithTrue() {
        assertEquals(true, OneEditAway.is("pale", "ple"));
        assertEquals(true, OneEditAway.is("pales", "pale"));
        assertEquals(true, OneEditAway.is("pale", "bale"));
        assertEquals(false, OneEditAway.is("pale", "bake"));

        assertEquals(true, OneEditAway.is2("pale", "ple"));
        assertEquals(true, OneEditAway.is2("pales", "pale"));
        assertEquals(true, OneEditAway.is2("pale", "bale"));
        assertEquals(false, OneEditAway.is2("pale", "bake"));
    }
}
