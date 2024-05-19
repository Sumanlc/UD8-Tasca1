package es.iesmz.ed.algoritmes;

/**
 * La clase DividirFactorial calcula la división de dos factoriales.
 * Proporciona un método para dividir el factorial de un número por el factorial de otro número.
 */
public class DividirFactorial {
    private int numerador;
    private int denominador;

    /**
     * Constructor de la clase DividirFactorial.
     * @param numerador el numerador de la división.
     * @param denominador el denominador de la división.
     * @throws IllegalArgumentException si el numerador es menor que el denominador.
     */
    public DividirFactorial(int numerador, int denominador) {
        if (numerador < denominador) {
            throw new IllegalArgumentException("El numerador debe ser mayor o igual que el denominador");
        }
        this.numerador = numerador;
        this.denominador = denominador;
    }

    /**
     * Calcula la división del factorial del numerador por el factorial del denominador.
     * En caso de que el denominador sea 0, se retorna el factorial del numerador.
     * @return el resultado de la división de los dos factoriales.
     */
    public long divisio() {
        if (denominador == 0) {
            return factorial(numerador);
        }

        long resultado = 1;
        for (int i = denominador + 1; i <= numerador; i++) {
            resultado *= i;
        }
        return resultado;
    }

    /**
     * Calcula el factorial de un número dado.
     * @param num el número del cual se quiere calcular el factorial.
     * @return el factorial del número dado.
     */
    private long factorial(int num) {
        long resultado = 1;
        for (int i = 1; i <= num; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
