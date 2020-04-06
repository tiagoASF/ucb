/*
Implemente um programa em Java que calcule o juro de uma dívida que você contraiu no mês passado no crediário de uma
loja. A taxa de juros mensal e o valor da dívida serão fornecidos pelo usuário. A dívida deve ser calculada por método
criado por você chamado: calcularDivida e deve receber como parâmetro os valores necessários para o cálculo e retornar
a referida dívida.
*/
import java.util.Locale;
import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Valor da compra: ");
        double montante = sc.nextDouble();
        System.out.print("Tempo, em meses, para pagamento: ");
        int tempo = sc.nextInt();
        System.out.print("Taxa de juros: ");
        double taxa = sc.nextDouble();

        double divida = calcularDivida(montante, taxa, tempo);
        System.out.printf("A dívida total é de R$ %.2f", divida);
    }

    public static double calcularDivida(double montante, double taxa, int tempo) {
        return montante * (1 + ((taxa / 100.00) * tempo));
    }
}
