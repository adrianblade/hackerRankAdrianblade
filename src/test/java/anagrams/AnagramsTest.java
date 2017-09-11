package anagrams;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnagramsTest {

    @Test
    public void testNeeded2() {
        int numberNeeded = Anagrams.numberNeeded("HOLA", "HOLITA");
        assertEquals(numberNeeded, 2);
    }

    @Test
    public void testNeeded3() {
        int numberNeeded = Anagrams.numberNeeded("HOLA", "HOLA123");
        assertEquals(numberNeeded, 3);
    }

    @Test
    public void testNeeded4() {
        int numberNeeded = Anagrams.numberNeeded("HOLA", "HOLA1234");
        assertEquals(numberNeeded, 4);
    }

    @Test
    public void testNeededEquals() {
        int numberNeeded = Anagrams.numberNeeded("HOLA", "HOLA");
        assertEquals(numberNeeded, 0);
    }
}
