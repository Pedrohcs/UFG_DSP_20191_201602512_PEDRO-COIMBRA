package br.com.pedrohcs.dsp20191.aulas2124.ead.model;

import java.io.Serializable;

public class Aluno implements Serializable {

    private String nome;
    private String matricula;
    private String disciplina;
    private int frequencia;
    private double nota1;
    private double nota2;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    private double media(){
        double notaFinal = this.nota1 + this.nota2;
        return notaFinal / 2;
    }

    public String avaliacao(){
        if (this.frequencia >= 75){
            if(media() >= 6.0){
                String aprovacao = "Aluno " + this.nome + " foi aprovado na disciplina " + this.disciplina + " com " +
                        "a media " + media();
                return aprovacao;
            }

            String reprovacao = String.format("Aluno %s foi reprovado por nota!", this.nome);
            return reprovacao;
        }

        String reprovacao = String.format("Aluno %s foi reprovado por frequencia!", this.nome);
        return reprovacao;
    }
}
