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
            return factorial(numerador);
        }

        long resultat = 1;
        for (int i = denominador + 1; i <= numerador; i++) {
            resultat *= i;
        }
        return resultat;
    }

    private long factorial(int num) {
        long resultat = 1;
        for (int i = 1; i <= num; i++) {
            resultat *= i;
        }
        return resultat;
    }
}
