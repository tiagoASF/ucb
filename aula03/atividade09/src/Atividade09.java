/*
Uma escola deseja fazer um cadastro dos seus alunos. Um aluno possui nome, matrícula e situação,
que pode ser regular ou bolsista. O usuário informará quantos alunos existem em uma turma.
Você receberá os dados de todos os alunos e, na sequência, você deve apresentar todos os alunos informados,
a quantidade de alunos regulares que existe e a quantidade de alunos bolsistas.
 */

import java.util.Scanner;
import entities.*;
import entities.enums.Situacao;

public class Atividade09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fluxo;
        int alunosRegulares = 0;
        int alunosBolsistas = 0;

        System.out.print("Informe o nome da turma: ");
        String nomeDaTurma = sc.nextLine();
        Turma turma = new Turma(nomeDaTurma);

        do {
            System.out.println("INSERIR DADOS DO ALUNO");

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Situacao (bolsista/regular): ");
            String situacao = sc.next().toUpperCase();
            Situacao situacaoEnum = Situacao.valueOf(situacao);

            System.out.print("Matrícula: ");
            String matricula = sc.next();

            Aluno aluno = new Aluno(nome, matricula, situacaoEnum);
            turma.adicionarAluno(aluno);

            System.out.println("Inserir novo aluno na turma? 1 - SIM, 0 - NÃO");
            fluxo = sc.nextInt();
            sc.nextLine();
        } while (fluxo == 1);

        System.out.println("RELATÓRIO DA TURMA");
        System.out.println("Nome da turma: " + turma.getNomeDaTurma());
        System.out.println("Total de alunos: " + turma.totalAlunosNaTurma());
        System.out.println("Total de alunos regulares: " + turma.totalRegulares());
        System.out.println("Total de alunos bolsistas: " + turma.totalBolsistas());
        System.out.println("Lista de alunos da turma\n");
        turma.listagemDeAlunos();
    }
}
