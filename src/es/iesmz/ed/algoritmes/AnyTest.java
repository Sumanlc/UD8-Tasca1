package es.iesmz.ed.algoritmes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnyTest {
    @Test
    public void testDigitsDiferents2013() {
        Any any = new Any(2013);
        assertEquals(4, any.digitsDiferents());
    }
    @Test
    public void testDigitsDiferents2020() {
        Any any = new Any(2020);
        assertEquals(2, any.digitsDiferents());
    }
    @Test
    public void testDigitsDiferents1988() {
        Any any = new Any(1988);
        assertEquals(3, any.digitsDiferents());
    }
    @Test
    public void testDigitsDiferents2000() {
        Any any = new Any(2000);
        assertEquals(2, any.digitsDiferents());
    }
    @Test
    public void testDigitsDiferents2049() {
        Any any = new Any(2049);
        assertEquals(4, any.digitsDiferents());
    }

}