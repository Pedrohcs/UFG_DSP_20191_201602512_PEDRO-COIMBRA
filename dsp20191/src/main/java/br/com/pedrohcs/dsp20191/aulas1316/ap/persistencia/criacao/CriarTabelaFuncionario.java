package br.com.pedrohcs.dsp20191.aulas1316.ap.persistencia.criacao;

import br.com.pedrohcs.dsp20191.aulas1316.ap.persistencia.conexao.PersistenciaJdbc;

public class CriarTabelaFuncionario extends PersistenciaJdbc{

    public void criarTabela() throws Exception{
        preparaPersistencia();

        System.out.println("Criando tabela de Funcionarios");

        String sql = "CREATE TABLE IF NOT EXISTS FUNCIONARIOS(\n" +
                "ID LONG NOT NULL PRIMARY KEY, \n" +
                "NOME VARCHAR(100) NOT NULL, \n" +
                "MATRICULA LONG NOT NULL\n" +
                ")";

        stmt.executeUpdate(sql);

        System.out.println("Operação finalizada\nTabela Funcionarios criada!");

        stmt.close();
        connection.close();

    }
}
