package br.ucb.poo.trabalho.entidades;

import java.time.LocalDate;


public class Funcionario {
    private String nome;
    private String cpf;
    private String matricula;
    private double salario;
    private LocalDate dataDeAdmissao;

    public Funcionario() {

    }

    public Funcionario(String nome, String cpf, String matricula, double salario, LocalDate dataDeAdmissao) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
        this.salario = salario;
        this.dataDeAdmissao = dataDeAdmissao;
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public LocalDate getDataDeAdmissao() {
        return this.dataDeAdmissao;
    }

    public void setDataDeAdmissao(LocalDate dataDeAdmissao) {
        this.dataDeAdmissao = dataDeAdmissao;
    }

    //Método para calcular imposto de renda. Cada categoria de funcionário
    //possui regra de negócio própria para cálculo do IR, que será calculado pelo
    //overrride do método em cada subclasse.

    public double getImpostoDeRenda() {
        return 0;
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
