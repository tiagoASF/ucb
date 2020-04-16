package br.ucb.poo.trabalho;

import br.ucb.poo.trabalho.entidades.*;
import java.text.ParseException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.time.LocalDate;


public class TrabalhoFinal {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dataFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        List<Funcionario> equipe = new ArrayList<>();
        int opcao;
        Funcionario funcionario;

        System.out.println("##### MÓDULO DE CADASTRO DE FUNCIONÁRIOS #####\n");
        do {
            System.out.println("DADOS DO FUNCIONÁRIO");
            System.out.print("Tipo de funcionário (P - Professor / D - Diretor): ");
            char categoriaDoFuncionario = sc.next().toLowerCase().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("CPF (somente números): ");
            String cpf = sc.next();
            System.out.print("Matrícula (somente números): ");
            String matricula = sc.next();
            System.out.print("Salário mensal: R$ ");
            double salario = sc.nextDouble();
            System.out.print("Data de admissão(dd/mm/aaaa): ");
            String admissao = sc.next();
            LocalDate dataAdmissao = LocalDate.parse(admissao, dataFormatter);


            if (categoriaDoFuncionario == 'p') {
                funcionario = new Professor(nome, cpf, matricula, salario, dataAdmissao);
            } else {
                funcionario = new Diretor(nome, cpf, matricula, salario, dataAdmissao);
            }

            if (equipe.contains(funcionario)) {
                System.out.println("Funcionário já cadastrado");
            } else {
                equipe.add(funcionario);
            }

            System.out.print("\nDeseja incluir novo cadastro? (1 - SIM, 9 - NÃO) ");
            opcao = sc.nextInt();
            System.out.println();
            sc.nextLine();

        } while (opcao == 1);

        System.out.println("##### RELATÓRIO DE RECOLHIMENTO DE IMPOSTO DE RENDA #####");

        double totalIR = 0;
        for (Funcionario f : equipe) {
            totalIR += f.getImpostoDeRenda();
        }

        System.out.printf("Montante de Imposto de Renda recolhido: R$ %.2f\n", totalIR);
        System.out.printf("Média de imposto de renda recolhido: R$ %.2f\n\n", totalIR / equipe.size());

        System.out.println("##### FICHAS CADASTRAIS DE FUNCIONÁRIOS #####");
        for (Funcionario f : equipe) {
            System.out.println(f);
        }
        sc.close();
    }


}
