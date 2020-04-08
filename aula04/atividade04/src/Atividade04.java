/*
Um sindicato dos professores deseja um sistema que gerencie a contribuição sindical dos professores de uma cidade.
Um professor possui nome, cpf, titulação (Doutor, Mestre, Graduado) e salário.
Realize a entrada de dados para vários professores, enquanto o usuário desejar.
Sabe-se que um Graduado contribui 1,2% do salário, já o Mestre 1,4% e o Doutor 1,6%.
Ao final, após receber todos os dados dos professores, apresente o total arrecadado pelo sindicato e a
quantidade de professores que são Mestre. Fique atento onde cada método e atributo estará distribuído na sua aplicação.
 */

import java.util.Scanner;
import java.util.Locale;
import java.util.List;
import java.util.ArrayList;

import entities.*;
import entities.enums.Titulacao;

public class Atividade04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int opcao;
        List<Professor> corpoDocente = new ArrayList<>();

        do {

            System.out.println("INFORME OS DADOS DO DOCENTE");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("CPF: ");
            String cpf = sc.next();
            System.out.print("Salário: ");
            double salario = sc.nextDouble();
            System.out.print("Titulacao (graduado/mestre/doutor): ");
            String titulacao = sc.next();
            Titulacao titulo = Titulacao.valueOf(titulacao);

            Professor professor = new Professor(nome, cpf, salario, titulo);
            corpoDocente.add(professor);

            System.out.print("Inserir professor? 1 - SIM, 0 - NÃO ");
            opcao = sc.nextInt();
            sc.nextLine();
        } while (opcao == 1);

        double impostoSindicalTotal = 0.0;
        int numMestres = 0;
        for (Professor p : corpoDocente) {
            impostoSindicalTotal += Tributacao.impostoSindical(p);
            if (p.getTitulo() == Titulacao.MESTRE) {
                numMestres++;
            }
        }

        System.out.printf("Imposto sindical arrecadado: R$ %.2f\n", impostoSindicalTotal);
        System.out.println("Total de mestres: " + numMestres);

        sc.close();
    }

}
