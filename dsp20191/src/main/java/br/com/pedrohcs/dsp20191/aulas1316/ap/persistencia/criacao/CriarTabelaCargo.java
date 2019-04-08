package br.com.pedrohcs.dsp20191.aulas1316.ap.persistencia.criacao;

import br.com.pedrohcs.dsp20191.aulas1316.ap.persistencia.conexao.PersistenciaJdbc;

public class CriarTabelaCargo extends PersistenciaJdbc{

    public void criarTabela() throws Exception {
        preparaPersistencia();

        System.out.println("Criando tabela de Cargos");

        String sql = "CREATE TABLE IF NOT EXISTS CARGOS(\n" +
                "ID LONG NOT NULL PRIMARY KEY, \n" +
                "NOME VARCHAR(100) NOT NULL, \n" +
                "SALARIO DOUBLE NOT NULL," +
                ")";

        stmt.executeUpdate(sql);

        System.out.println("Operação finalizada\nTabela Cargos criada!");

        stmt.close();
        connection.close();
    }
}
