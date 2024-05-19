package es.iesmz.ed.algoritmes;

public class DividirFactorial {
    private int numerador;
    private int denominador;

    public DividirFactorial(int numerador, int denominador) {
        if (numerador < denominador) {
            throw new IllegalArgumentException("El numerador debe ser mayor o igual que el denominador");
        }
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public long divisio() {
        if (denominador == 0) {
            return 1;
        }

        long resultat = 1;
        for (int i = denominador + 1; i <= numerador; i++) {
            resultat *= i;
        }
        return resultat;
    }
}
