/*
Você deve implementar uma calculadora. O usuário informará um valor, um operador e outro valor. Execute a operação
e apresente o resultado. Faça uso do maior número de métodos que conseguir visualizar (na entrada de dados, nas operações).
 As operações disponíveis para esta calculadora são: adicionar, subtrair, dividir, multiplicar e expoente.
 */

import java.util.Scanner;
import java.util.Locale;

public class Atividade03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double resultado = 0.0;

        System.out.print("Informe o primeiro valor: ");
        double valor1 = sc.nextDouble();
        System.out.print("Informe o segundo valor: ");
        double valor2 = sc.nextDouble();

        System.out.println("Operações disponíveis");
        System.out.println("1 - Soma | 2 - Subtração | 3 - Multiplicação | 4 - Divisão | 5 - Potenciação ");
        System.out.print("Informe a operação desejada: ");
        int operacao = sc.nextInt();

        switch (operacao) {
            case 1:
                resultado = Calculadora.soma(valor1, valor2);
                break;
            case 2:
                resultado = Calculadora.subtracao(valor1, valor2);
                break;
            case 3:
                resultado = Calculadora.multiplicacao(valor1, valor2);
                break;
            case 4:
                resultado = Calculadora.divisao(valor1, valor2);
                break;
            case 5:
                resultado = Calculadora.exponenciacao(valor1, valor2);
                break;
            default:
                System.out.println("Operação inexistente");
                break;

        }

        System.out.printf("Resultado = %.2f", resultado);



    }
}
