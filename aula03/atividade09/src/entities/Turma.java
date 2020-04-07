package entities;

import entities.enums.Situacao;

import java.util.ArrayList;
import java.util.List;

import static entities.enums.Situacao.BOLSISTA;

public class Turma {
    private List<Aluno> alunos = new ArrayList();

    private String nomeDaTurma;

    public Turma(String nomeDaTurma) {
        this.nomeDaTurma = nomeDaTurma;
    }

    public String getNomeDaTurma() {
        return this.nomeDaTurma;
    }

    public void setNomeDaTurma(String nomeDaTurma) {
        this.nomeDaTurma = nomeDaTurma;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    public int totalBolsistas() {
        int total = 0;
        for (Aluno al : alunos) {
            if (al.getSituacao() == Situacao.BOLSISTA) {
                total++;
            }
        }
        return total;
    }

    public int totalRegulares() {
        int total = 0;
        for (Aluno al : alunos) {
            if (al.getSituacao() == Situacao.REGULAR) {
                total++;
            }
        }
        return total;
    }

    public int totalAlunosNaTurma() {
        return alunos.size();
    }

    public void listagemDeAlunos() {
        for (Aluno al : alunos) {
            System.out.println(al);
        }
    }

}
