/*
Receba do usuário uma frase e faça o que se pede baseado na API String:
- A quantidade de letras 'A' que a frase tem.
- O tamanho da frase (quantidade de caracteres).
- A qualificação da frase (menor que 10 caracteres – PEQUENA, maior que 9 e menor que 29 – MEDIA, maior que 30 é GRANDE).
- Apresente a frase informada em CAIXA ALTA.
- A quantidade de palavras que a frase contém.
- Valide para verificar se a String contém a palavra "Corrupção", pois se não houver deve ser solicitada novamente ao usuário.
*/
import java.util.Scanner;

public class Atividade09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fraseDoUsuario;

        System.out.print("Digite uma frase qualquer: ");
        fraseDoUsuario = sc.nextLine().toLowerCase();
        
        //Respostas
        System.out.print("Frase em caixa alta: " + fraseDoUsuario.toUpperCase());

    }
}
