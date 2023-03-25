package cracking;

import org.junit.Test;
import static org.junit.Assert.*;

public class OneEditAwayTest {
    @Test
    public void shouldAnswerWithTrue() {
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
