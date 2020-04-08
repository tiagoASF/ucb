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
        int quantidadeDeCaracteres;
        int quantidadeDePalavras;

        System.out.print("Digite uma frase qualquer: ");
        String fraseUsuario = sc.nextLine();

        fraseCaixaAlta = fraseUsuario.toUpperCase();
        fraseCaixaBaixa = fraseUsuario.toLowerCase();
        quantidadeDeCaracteres = fraseUsuario.length();

        if (frase.toLowerCase().equals(fraseUsuario.toLowerCase())) {
             saoIguais = "Sim!";
        } else {
            saoIguais = "Não...";
        }

        



        System.out.println("OPERAÇÕES COM A FRASE DIGITADA");
        System.out.println("Caixa alta: " + fraseCaixaAlta);
        System.out.println("Caixa baixa: " + fraseCaixaBaixa);
        System.out.println("Quantidade de caracteres: " + quantidadeDeCaracteres);
        System.out.println("A frase do usuário é \"Eu estou estudando java\" ? " + saoIguais);
        //System.out.println("Quantidade de palavras: " + quantidadeDePalavras);

    }
}
