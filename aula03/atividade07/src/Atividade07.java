/*
Faça um programa que receba 5 mil dados do usuário do tipo inteiro.
Sabe-se que valores negativos não são aceitos. Após receber esses valores e popular o array, imprima na saída padrão:
a média dos valores, quantos valores são ímpares e todos os valores que foram informados.
Para esta solução, utilize o maior número de métodos visualizados.
 */

import java.util.Scanner;
import java.util.Locale;
import java.util.Random;

public class Atividade07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Random rand = new Random();
        int[] list = new int[5000];

        for(int i = 0; i < list.length; i++) {
            rand = new Random();
            list[i] = rand.nextInt(10000);
        }

        double media = Operacoes.media(list);
        System.out.printf("MÉDIA = %.2f\n", media);

        int impares = Operacoes.impares(list);
        System.out.printf("ÍMPARES = %d\n", impares);

        System.out.println("LISTA DE VALORES");
        Operacoes.imprimirValores(list);
    }
}
