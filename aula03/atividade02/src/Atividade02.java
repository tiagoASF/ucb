/*
Implemente um programa em Java que receba a temperatura em graus Celsius e apresente-a convertida em graus Fahrenheit.
A fórmula de conversão é: FAR = (9 * CEL + 160) / 5, sendo FAR a temperatura em Fahrenheit e CEL em Celsius.
Esta conversão deve ser feita por meio de um método com a seguinte assinatura:
public static double fahrenheit(double celsius). O método deve receber a temperatura em Celsius e retornar em Fahrenheit.
*/

import java.util.Scanner;
import java.util.Locale;

public class Atividade02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Temperatura em Celcius: ");
        double celcius = sc.nextInt();

        System.out.printf("%.2f° celcius equivalem a %.2f° fahrenheint", celcius, fahrenheint(celcius));
    }

    public static double fahrenheint(double celcius) {
        return (9 * celcius + 160) / 5.00;
    }
}
