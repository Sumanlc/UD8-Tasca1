package es.iesmz.ed.algoritmes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DividirFactorialTest {
    @Test
    public void testDivisio5entre3() {
        DividirFactorial df = new DividirFactorial(5, 3);
        assertEquals(20, df.divisio());
    }
    @Test
    public void testDivisio6entre2() {
        DividirFactorial df = new DividirFactorial(6, 2);
        assertEquals(360, df.divisio());
    }
    @Test
    public void testDivisio4entre4() {
        DividirFactorial df = new DividirFactorial(4, 4);
        assertEquals(1, df.divisio());
    }
    @Test
    public void testDivisio5entre0() {
        DividirFactorial df = new DividirFactorial(5, 0);
        assertEquals(120, df.divisio());
    }
    @Test
    public void testDivisio1entre0() {
        DividirFactorial df = new DividirFactorial(1, 0);
        assertEquals(1, df.divisio());
    }
    @Test
    public void testDivisioInvalid() {
        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class,
                () -> new DividirFactorial(3, 5),
                "Esperava IllegalArgumentException"
        );

        assertFalse(thrown.getMessage().contains("El numerador ha de ser major o igual que el denominador"));
    }

}