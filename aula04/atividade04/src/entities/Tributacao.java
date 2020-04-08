package entities;

import entities.enums.Titulacao;

public abstract class Tributacao {
    public double impostoSindical(Professor professor) {
        double aliquota = 0.0;
        if (professor.getTitulo() == Titulacao.GRADUADO) {
            aliquota = 0.012;
        } else if (professor.getTitulo() == Titulacao.MESTRE) {
            aliquota = 0.014;
        } else if (professor.getTitulo() == Titulacao.DOUTOR) {
            aliquota = 0.016;
        }

        return professor.getSalario() * aliquota;
    }
}
