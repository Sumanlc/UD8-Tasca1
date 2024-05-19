package es.iesmz.ed.algoritmes;

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
        return (int) Long.toString(any).chars().distinct().count();
    }
}
