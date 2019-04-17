package br.com.pedrohcs.dsp20191.aulas1720.ap.persistencia.delete;

import br.com.pedrohcs.dsp20191.aulas1316.ap.persistencia.conexao.PersistenciaJdbc;

public class Delete extends PersistenciaJdbc {

    public void deleteAllObjts(String tabela) throws Exception {
        preparaPersistencia();

        String sql = "DELETE FROM " + tabela;

        stmt.executeUpdate(sql);

        System.out.println(String.format("Elementos da tabela %s foram excluidos", tabela));

        stmt.close();
        connection.close();
    }

}
