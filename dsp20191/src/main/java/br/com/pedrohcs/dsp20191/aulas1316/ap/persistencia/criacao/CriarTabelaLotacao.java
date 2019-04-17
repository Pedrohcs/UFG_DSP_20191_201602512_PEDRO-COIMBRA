package br.com.pedrohcs.dsp20191.aulas1316.ap.persistencia.criacao;

import br.com.pedrohcs.dsp20191.aulas1316.ap.persistencia.conexao.PersistenciaJdbc;

public class CriarTabelaLotacao extends PersistenciaJdbc{

    public void criarTabela() throws Exception {
        preparaPersistencia();

        System.out.println("Criando tabela de Lotacao");

        String sql = "CREATE TABLE IF NOT EXISTS LOTACAO(\n" +
                "ID LONG NOT NULL PRIMARY KEY, \n" +
                "DATA_INICIAL DATE NOT NULL, \n" +
                "DATA_FINAL DATE NOT NULL, \n" +
                "IDDEPART LONG NOT NULL, \n" +
                "IDCARGO LONG NOT NULL, \n" +
                "IDFUNC LONG NOT NULL, \n" +
                "FOREIGN KEY (IDDEPART) REFERENCES  DEPARTAMENTOS(ID), \n" +
                "FOREIGN KEY (IDCARGO) REFERENCES CARGOS(ID), \n" +
                "FOREIGN  KEY (IDFUNC) REFERENCES  FUNCIONARIOS(ID), \n" +
                ")";

        stmt.executeUpdate(sql);

        System.out.println("Operação finalizada\nTabela Lotacao criada!");

        stmt.close();
        connection.close();
    }
}
