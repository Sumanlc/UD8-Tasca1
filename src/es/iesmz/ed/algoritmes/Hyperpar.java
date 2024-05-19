package es.iesmz.ed.algoritmes;

public class Hyperpar {
    private long numero;

    public Hyperpar(long numero) {
        this.numero = numero;
    }

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
