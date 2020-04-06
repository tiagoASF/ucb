import java.lang.Math;

public abstract class Calculadora {

    public static double soma(double valor1, double valor2) {
        return valor1 + valor2;
    }

    public static double subtracao(double valor1, double valor2) {
        return valor1 - valor2;
    }

    public static double multiplicacao(double valor1, double valor2) {
        return valor1 * valor2;
    }

    public static double divisao(double valor1, double valor2) {
        return valor1 / valor2;
    }

    public static double exponenciacao(double valor1, double valor2) {
        return Math.pow(valor1, valor2);
    }
}
