package entities;
import entities.enums.Titulacao;

public class Professor {
    private String nome;
    private String cpf;
    private double salario;
    private Titulacao titulo;

    public Professor(String nome, String cpf, double salario, Titulacao titulo) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.titulo = titulo;
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

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Titulacao getTitulo() {
        return this.titulo;
    }

    public void setTitulo(Titulacao titulo) {
        this.titulo = titulo;
    }
}
