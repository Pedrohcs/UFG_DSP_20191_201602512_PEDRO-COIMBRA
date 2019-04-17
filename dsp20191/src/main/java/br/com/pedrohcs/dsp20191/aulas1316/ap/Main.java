package br.com.pedrohcs.dsp20191.aulas1316.ap;

import br.com.pedrohcs.dsp20191.aulas1316.ap.model.Cargo;
import br.com.pedrohcs.dsp20191.aulas1316.ap.model.Departamento;
import br.com.pedrohcs.dsp20191.aulas1316.ap.model.Funcionario;
import br.com.pedrohcs.dsp20191.aulas1316.ap.model.Lotacao;
import br.com.pedrohcs.dsp20191.aulas1316.ap.persistencia.criacao.CriarTabelaCargo;
import br.com.pedrohcs.dsp20191.aulas1316.ap.persistencia.criacao.CriarTabelaDepartamento;
import br.com.pedrohcs.dsp20191.aulas1316.ap.persistencia.criacao.CriarTabelaFuncionario;
import br.com.pedrohcs.dsp20191.aulas1316.ap.persistencia.criacao.CriarTabelaLotacao;
import br.com.pedrohcs.dsp20191.aulas1316.ap.persistencia.insert.InsertCargo;
import br.com.pedrohcs.dsp20191.aulas1316.ap.persistencia.insert.InsertDepartamento;
import br.com.pedrohcs.dsp20191.aulas1316.ap.persistencia.insert.InsertFuncionario;
import br.com.pedrohcs.dsp20191.aulas1316.ap.persistencia.insert.InsertLotacao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args){
        CriarTabelaCargo criarTabelaCargo = new CriarTabelaCargo();
        CriarTabelaDepartamento criarTabelaDepartamento = new CriarTabelaDepartamento();
        CriarTabelaFuncionario criarTabelaFuncionario = new CriarTabelaFuncionario();
        CriarTabelaLotacao criarTabelaLotacao = new CriarTabelaLotacao();

        try{
            criarTabelaCargo.criarTabela();
            criarTabelaDepartamento.criarTabela();
            criarTabelaFuncionario.criarTabela();
            criarTabelaLotacao.criarTabela();
        } catch (Exception e){
            e.printStackTrace();
        }

        InsertCargo insertCargo = new InsertCargo();
        InsertDepartamento insertDepartamento = new InsertDepartamento();
        InsertFuncionario insertFuncionario = new InsertFuncionario();
        InsertLotacao insertLotacao = new InsertLotacao();

        ArrayList<Cargo> cargos = new ArrayList<Cargo>();
        long id = 100;
        cargos.add(new Cargo(id, "Engenheiro de Software", 5500.99));
        id ++;
        cargos.add(new Cargo(id, "Analista de Requisitos", 3660.85));
        id ++;
        cargos.add(new Cargo(id, "Suporte", 1999.99));

        id = 100;
        ArrayList<Departamento> departamentos = new ArrayList<Departamento>();
        departamentos.add(new Departamento(id, "Gerencia"));
        id ++;
        departamentos.add(new Departamento(id, "Desenvolvimento"));
        id ++;
        departamentos.add(new Departamento(id, "Suporte"));
        id ++;
        departamentos.add(new Departamento(id, "RH"));

        id = 100;
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
        funcionarios.add(new Funcionario(id, "Pedro Henrique", 123456));
        id ++;
        funcionarios.add(new Funcionario(id, "Hyago Vieira", 456789));
        id ++;
        funcionarios.add(new Funcionario(id, "Joao Pedro", 789123));
        id ++;
        funcionarios.add(new Funcionario(id, "Estevao Cristino", 123789));
        id ++;
        funcionarios.add(new Funcionario(id, "Gabriela Gontijo", 147258));
        id ++;
        funcionarios.add(new Funcionario(id, "Pedro Paulo", 258369));
        id ++;
        funcionarios.add(new Funcionario(id, "Daniela Duailibe", 147852));
        id ++;
        funcionarios.add(new Funcionario(id, "Jessica Pinheiro", 258963));
        id ++;
        funcionarios.add(new Funcionario(id, "Idelma Rodrigues", 753159));
        id ++;
        funcionarios.add(new Funcionario(id, "Joaniza Nunes", 951753));

        id = 100;
        ArrayList<Lotacao> lotacoes = new ArrayList<Lotacao>();
        Calendar dataInicial, dataFinal;
        dataInicial = Calendar.getInstance();
        dataFinal = Calendar.getInstance();

        dataInicial.set(2019, 1, 1);

        dataFinal.set(2019, 10, 12);
        lotacoes.add(new Lotacao(id, dataInicial.getTime(), dataFinal.getTime(),
                cargos.get(0), departamentos.get(0), funcionarios.get(0)));
        id ++;

        dataFinal.set(2019,2,22);
        lotacoes.add(new Lotacao(id, dataInicial.getTime(), dataFinal.getTime(),
                cargos.get(1), departamentos.get(1), funcionarios.get(1)));
        id ++;

        dataFinal.set(2020,5,6);
        lotacoes.add(new Lotacao(id, dataInicial.getTime(), dataFinal.getTime(),
                cargos.get(2), departamentos.get(2), funcionarios.get(2)));
        id ++;

        dataFinal.set(2019,8,21);
        lotacoes.add(new Lotacao(id, dataInicial.getTime(), dataFinal.getTime(),
                cargos.get(0), departamentos.get(3), funcionarios.get(3)));
        id ++;

        dataFinal.set(2019,4,29);
        lotacoes.add(new Lotacao(id, dataInicial.getTime(), dataFinal.getTime(),
                cargos.get(1), departamentos.get(0), funcionarios.get(4)));
        id ++;

        dataFinal.set(2019,4,20);
        lotacoes.add(new Lotacao(id, dataInicial.getTime(), dataFinal.getTime(),
                cargos.get(2), departamentos.get(1), funcionarios.get(5)));
        id ++;

        dataFinal.set(2020,6,20);
        lotacoes.add(new Lotacao(id, dataInicial.getTime(), dataFinal.getTime(),
                cargos.get(0), departamentos.get(2), funcionarios.get(6)));
        id ++;

        dataFinal.set(2019,6,20);
        lotacoes.add(new Lotacao(id, dataInicial.getTime(), dataFinal.getTime(),
                cargos.get(1), departamentos.get(3), funcionarios.get(7)));
        id ++;

        dataFinal.set(2019,7,11);
        lotacoes.add(new Lotacao(id, dataInicial.getTime(), dataFinal.getTime(),
                cargos.get(2), departamentos.get(0), funcionarios.get(8)));
        id ++;

        dataFinal.set(2019,9,21);
        lotacoes.add(new Lotacao(id, dataInicial.getTime(), dataFinal.getTime(),
                cargos.get(0), departamentos.get(1), funcionarios.get(9)));


        try {
            for (Cargo cargo : cargos){
                insertCargo.insert(cargo);
            }
            for (Departamento departamento : departamentos){
                insertDepartamento.insert(departamento);
            }
            for (Funcionario funcionario : funcionarios){
                insertFuncionario.insert(funcionario);
            }
            for (Lotacao lotacao : lotacoes){
                insertLotacao.insert(lotacao);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
