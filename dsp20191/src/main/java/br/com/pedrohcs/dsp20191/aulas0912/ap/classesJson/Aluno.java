package br.com.pedrohcs.dsp20191.aulas0912.ap.classesJson;

public class Aluno {

    private String matricula = "";
    private String firstname = "";
    private String lastname = "";
    private String nickname = "";
    private Frequencia frequencia;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Frequencia getFreq() {
        return frequencia;
    }

    public void setFreq(Frequencia freq) {
        this.frequencia = freq;
    }
}
