/*
Manipular Strings é uma atividade corriqueira de um programador. Crie um programa que fará a leitura de uma String do
usuário e você deverá apresentar os seguintes resultados:

- A string informada em caixa alta.
- A string informada em caixa baixa.
- A quantidade de caracteres que a string contém.
- Se a frase digitada é igual ou não a "Eu estou estudando Java".
- A quantidade de palavras que a frase possui.
 */

import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String frase = "Eu estou estudando Java";
        String fraseCaixaAlta;
        String fraseCaixaBaixa;
        String saoIguais;
        int quantidadeDeCaracteres = 0;
        int quantidadeDePalavras = 0;

        System.out.print("Digite uma frase qualquer: ");
        String fraseUsuario = sc.nextLine();

        //Conversão da frase da caixa alta
        fraseCaixaAlta = fraseUsuario.toUpperCase();

        //Conversão da frase para caixa baixa
        fraseCaixaBaixa = fraseUsuario.toLowerCase();

        //Contagem de caracteres
        quantidadeDeCaracteres = fraseUsuario.length();

        //Comparação com a frase "Eu estudo java"
        if (frase.toLowerCase().equals(fraseUsuario.toLowerCase().trim())) {
             saoIguais = "Sim!";
        } else {
            saoIguais = "Não...";
        }

        //Contagem do número de palavras
        fraseUsuario = fraseUsuario.trim();
        String[] fraseSplitted = fraseUsuario.split(" ");
        quantidadeDePalavras = fraseSplitted.length;

        //Respostas
        System.out.println("OPERAÇÕES COM A FRASE DIGITADA");
        System.out.println("Caixa alta: " + fraseCaixaAlta);
        System.out.println("Caixa baixa: " + fraseCaixaBaixa);
        System.out.println("Quantidade de caracteres: " + quantidadeDeCaracteres);
        System.out.println("A frase do usuário é \"Eu estou estudando java\"? " + saoIguais);
        System.out.println("Quantidade de palavras: " + quantidadeDePalavras);
    }
}
