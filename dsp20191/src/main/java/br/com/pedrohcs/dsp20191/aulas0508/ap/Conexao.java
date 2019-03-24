package br.com.pedrohcs.dsp20191.aulas0508.ap;

public class Conexao {

    final String OS =
            System.getProperty("os.name").toLowerCase();

    private String sgbd;
    private String tipoConexao;
    private String bancoDados;
    private String urlBd;
    private String sistemaOperacional;

    public Conexao(){
        this.sistemaOperacional = OS;
    }

    public String getSgbd() {
        return sgbd;
    }

    public String getTipoConexao() {
        return tipoConexao;
    }

    public String getBancoDados() {
        return bancoDados;
    }

    public String getUrlBd() {
        return urlBd;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSgbd(String sgbd) {
        this.sgbd = sgbd;
    }

    public void setTipoConexao(String tipoConexao) {
        this.tipoConexao = tipoConexao;
    }

    public void setBancoDados(String bancoDados) {
        this.bancoDados = bancoDados;
    }

    public void setUrlBd(String urlBd) {
        this.urlBd = urlBd;
    }

    @Override
    public String toString() {
        return "Sgbd: " + this.sgbd + ", banco de dados: " + this.bancoDados + ", conexao: " + this.tipoConexao +
                ", url: " + this.urlBd + ", sistema operacional: " + this.sistemaOperacional;
    }

}
