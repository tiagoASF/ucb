package br.ucb.poo.trabalho.entidades;

import java.time.LocalDate;

//Classe Professor herda de Funcionario
public class Professor extends Funcionario{
    private int anoDeAdmissao;

    public Professor(String nome, String cpf, String matricula, double salario, LocalDate dataDeAdmissao) {
        super(nome, cpf, matricula, salario, dataDeAdmissao);
        this.anoDeAdmissao = getDataDeAdmissao().getYear();
    }

    public int getAnoDeAdmissao() {
        return this.anoDeAdmissao;
    }

    @Override
    public double getImpostoDeRenda() {
        return getSalario() * 0.20;
    }

    public String toString() {
        return  "Nome: "
                + getNome()
                + "\nCargo: Professor"
                + "\nCPF: "
                + getCpf()
                + "\nMatrícula: "
                + getMatricula()
                + "\nAno de admissão: "
                + getAnoDeAdmissao()
                + "\nSalário mensal: R$"
                + String.format("%.2f", getSalario())
                + "\nImposto de renda devido: R$"
                + String.format("%.2f\n", getImpostoDeRenda());
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (!(object instanceof Funcionario)) {
            return false;
        }

        Funcionario outroFuncionario = (Funcionario) object;
        return (this.getMatricula().equals(outroFuncionario.getMatricula()));
    }
}
