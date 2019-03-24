package br.com.pedrohcs.dsp20191.aulas0508.as;

public class Aluno {
    private String nome;
    private long matricula;
    private double nota1;
    private double nota2;

    public Aluno(String nome, long matricula, double nota1, double nota2){
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    @Override
    public String toString() {
        return this.nome + ", " + this.matricula + ", " + this.nota1 + ", " + this.nota2 + "\n";
    }

}
