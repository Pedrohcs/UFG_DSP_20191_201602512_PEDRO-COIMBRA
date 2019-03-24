package br.com.pedrohcs.dsp20191.aulas0104.as;

public class UnidadeFederacao {

    private String sigla;
    private String nome;
    private String regiao;

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    @Override
    public String toString() {
        return "Sigla: " + this.sigla + ", " +
                "Nome: " + this.nome + ", " +
                "Região: " + this.regiao;
    }
}
