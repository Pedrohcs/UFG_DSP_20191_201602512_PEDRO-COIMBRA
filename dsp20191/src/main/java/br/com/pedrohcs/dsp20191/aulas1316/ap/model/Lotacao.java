package br.com.pedrohcs.dsp20191.aulas1316.ap.model;

import java.util.Date;

public class Lotacao {

    private long id;
    private Date dataInicial;
    private Date dataFinal;
    private Cargo cargo;
    private Departamento departamento;

    public Lotacao(long id, Date dataInicial, Date dataFinal, Cargo cargo, Departamento departamento){
        this.id = id;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.cargo = cargo;
        this.departamento = departamento;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDataInicial() {
        return this.dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataFinal() {
        return this.dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public Cargo getCargo() {
        return this.cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Departamento getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
