package es.iesmz.ed.algoritmes;

import java.util.HashSet;
import java.util.Set;

/**
 * La classe Any determina el nombre de dígits diferents que té un any.
 */
public class Any {
    private long any;

    /**
     * Constructor de la classe Any.
     * @param any l'any que es verificarà.
     */
    public Any(long any) {
        this.any = any;
    }

    /**
     * Calcula el nombre de dígits diferents que té l'any.
     * @return el nombre de dígits diferents.
     */
    public int digitsDiferents() {
        String anyStr = Long.toString(any);
        Set<Character> digits = new HashSet<>();
        for (char c : anyStr.toCharArray()) {
            digits.add(c);
        }
        return digits.size();
    }
}
