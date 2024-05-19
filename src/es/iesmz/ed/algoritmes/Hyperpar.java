package es.iesmz.ed.algoritmes;

/**
 * La classe Hyperpar determina si un nombre és hyperpar.
 * Un nombre és hyperpar quan tots els seus dígits són parells.
 */
public class Hyperpar {
    private long numero;

    /**
     * Constructor de la classe Hyperpar.
     * @param numero el número que es verificarà si és hyperpar.
     */
    public Hyperpar(long numero) {
        this.numero = numero;
    }

    /**
     * Verifica si el número és hyperpar.
     * @return true si el número és hyperpar, false en cas contrari.
     */
    public boolean esHyperPar() {
        String numStr = Long.toString(numero);
        for (char c : numStr.toCharArray()) {
            if (c != '0' && c != '2' && c != '4' && c != '6' && c != '8') {
                return false;
            }
        }
        return true;
    }
}
