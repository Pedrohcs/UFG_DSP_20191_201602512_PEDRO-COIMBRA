package br.com.pedrohcs.dsp20191.aulas0508.ap;

public class Usuario {
    private String nome;
    private String login;
    private String senha;

    public String getNome() {
        return nome;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + ", login: " + this.login + ", senha: " + this.senha;
    }
}
