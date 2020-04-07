package entities;

import entities.enums.Situacao;

public class Aluno {
    private String nome;
    private String matricula;
    private Situacao situacao;

    public Aluno(String nome, String matricula, Situacao situacao) {
        this.nome = nome;
        this.matricula = matricula;
        this.situacao = situacao;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Situacao getSituacao() {
        return this.situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        return  "Aluno: "
                + nome
                + "\n"
                + "Matrícula: "
                + matricula
                + "\n"
                + "Situação: "
                + situacao
                + "\n";
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (!(object instanceof Aluno)) {
            return false;
        }

        Aluno outroAluno = (Aluno) object;
        return (this.getMatricula().equals(outroAluno.getMatricula()));
    }

}
