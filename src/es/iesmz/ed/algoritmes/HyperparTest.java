package es.iesmz.ed.algoritmes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HyperparTest {
    @Test
    public void testHyperparTrue() {
        Hyperpar hyperpar = new Hyperpar(24680);
        assertTrue(hyperpar.esHyperPar());
    }
    @Test
    public void testHyperparFalse() {
        Hyperpar hyperpar = new Hyperpar(2568);
        assertFalse(hyperpar.esHyperPar());
    }

    @Test
    public void testHyperparZero() {
        Hyperpar hyperpar = new Hyperpar(0);
        assertTrue(hyperpar.esHyperPar());
    }
    @Test
    public void testHyperparNegative() {
        Hyperpar hyperpar = new Hyperpar(-24680);
        assertFalse(hyperpar.esHyperPar());
    }
    @Test
    public void testHyperparSingleDigit() {
        Hyperpar hyperpar1 = new Hyperpar(2);
        Hyperpar hyperpar2 = new Hyperpar(5);
        assertTrue(hyperpar1.esHyperPar());
        assertFalse(hyperpar2.esHyperPar());
    }

}