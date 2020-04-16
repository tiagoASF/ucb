package br.ucb.poo.trabalho.entidades;

import java.time.LocalDate;
import java.time.Period;

//classe Diretor herda de Funcionário
public class Diretor extends Funcionario {
    private Period tempoDeCasa;

    public Diretor(String nome, String cpf, String matricula, double salario, LocalDate dataDeAdmissao) {
        super(nome, cpf, matricula, salario, dataDeAdmissao);
        LocalDate agora = LocalDate.now();
        this.tempoDeCasa = Period.between(getDataDeAdmissao(), agora);

    }

    public Period getTempoDeCasa() {
        return this.tempoDeCasa;
    }

    public double getImpostoDeRenda() {
        return getSalario() * 0.23;
    }

    public String toString() {
        return  "Nome: "
                + getNome()
                + "\nCargo: Diretor"
                + "\nCPF: "
                + getCpf()
                + "\nMatrícula: "
                + getMatricula()
                + "\nTempo de casa: "
                + getTempoDeCasa().getYears()
                +" anos e "
                + getTempoDeCasa().getMonths()
                + " meses"
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
