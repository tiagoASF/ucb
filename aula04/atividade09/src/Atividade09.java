/*
Receba do usuário uma frase e faça o que se pede baseado na API String:
- Apresente a frase informada em CAIXA ALTA.
- O tamanho da frase (quantidade de caracteres).
- A quantidade de palavras que a frase contém.
- A qualificação da frase (menor que 10 caracteres – PEQUENA, maior que 9 e menor que 29 – MEDIA, maior que 30 é GRANDE).
- A quantidade de letras 'A' que a frase tem.
- Valide para verificar se a String contém a palavra "Corrupção", pois se não houver deve ser solicitada novamente ao usuário.
*/
import java.util.Scanner;

public class Atividade09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fraseDoUsuario;
        String palavraValidadora = "corrupção";

        System.out.print("Digite uma frase qualquer: ");
        fraseDoUsuario = sc.nextLine().toLowerCase();

        //Resposta 01
        System.out.println("Frase em caixa alta: " + fraseDoUsuario.toUpperCase());

        //Resposta 02
        System.out.printf("A frase digitada possui %d caracteres\n", fraseDoUsuario.trim().length());

        //Resposta 03
        String[] frasePartida = fraseDoUsuario.split(" ");
        System.out.printf("São %d palavras na frase digitada\n", frasePartida.length);

        //Resposta 04
        System.out.println("Essa é uma frase " + qualificadorDeFrase(fraseDoUsuario));

        //Resposta 05
        int contadorDeA = 0;
        for (int i = 0; i < fraseDoUsuario.length(); i++) {
            char x = fraseDoUsuario.charAt(i);
            if (x == 'a') {
                contadorDeA++;
            }
        }
        System.out.printf("Há %d vogais \"a\" na frase fornecida\n", contadorDeA);

        //Resposta 06
        if (corrupcaoFinder(fraseDoUsuario, palavraValidadora)) {
            System.out.println("A palavra " + palavraValidadora + " está contida na frase digitada!");
        } else {
            System.out.println("Não foi encontrada a palavra " + palavraValidadora + " na frase digitada.");
        }
    }

    public static String qualificadorDeFrase(String frase) {
        if (frase.length() < 10) {
            return "PEQUENA";
        } else if (frase.length() >= 10 && frase.length() < 29) {
            return "MÉDIA";
        } else {
            return "GRANDE";
        }
    }

    public static Boolean corrupcaoFinder(String frase, String palavraControle) {
        String[] fraseSplitted = frase.trim().split(" ");
        boolean checker = false;
        for (String s : fraseSplitted) {
            if (s.equals(palavraControle)) {
                checker = true;
                break;
            }
        }
        return checker;
    }
}
