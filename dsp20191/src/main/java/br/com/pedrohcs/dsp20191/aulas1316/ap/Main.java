package br.com.pedrohcs.dsp20191.aulas1316.ap;

import br.com.pedrohcs.dsp20191.aulas1316.ap.model.Cargo;
import br.com.pedrohcs.dsp20191.aulas1316.ap.model.Departamento;
import br.com.pedrohcs.dsp20191.aulas1316.ap.model.Funcionario;
import br.com.pedrohcs.dsp20191.aulas1316.ap.persistencia.criacao.CriarTabelaCargo;
import br.com.pedrohcs.dsp20191.aulas1316.ap.persistencia.criacao.CriarTabelaDepartamento;
import br.com.pedrohcs.dsp20191.aulas1316.ap.persistencia.criacao.CriarTabelaFuncionario;
import br.com.pedrohcs.dsp20191.aulas1316.ap.persistencia.criacao.CriarTabelaLotacao;
import br.com.pedrohcs.dsp20191.aulas1316.ap.persistencia.insert.InsertCargo;
import br.com.pedrohcs.dsp20191.aulas1316.ap.persistencia.insert.InsertDepartamento;
import br.com.pedrohcs.dsp20191.aulas1316.ap.persistencia.insert.InsertFuncionario;

import java.util.ArrayList;

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
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
