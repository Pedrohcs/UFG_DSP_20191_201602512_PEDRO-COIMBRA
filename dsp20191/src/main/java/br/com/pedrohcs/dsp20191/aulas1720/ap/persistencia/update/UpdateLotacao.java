package br.com.pedrohcs.dsp20191.aulas1720.ap.persistencia.update;

import br.com.pedrohcs.dsp20191.aulas1316.ap.persistencia.conexao.PersistenciaJdbc;

import java.sql.PreparedStatement;
import java.util.Date;

public class UpdateLotacao extends PersistenciaJdbc {

    public void updateDataFinal(long id, Date dataFinal) throws Exception {
        preparaPersistencia();

        String sql = "UPDATE LOTACAO \n" +
                "SET DATA_FINAL = ? \n" +
                "WHERE ID = " + id;

        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setDate(1, new java.sql.Date(dataFinal.getTime()));

        ps.executeUpdate();

        System.out.println(String.format("A lotação foi atualizado!"));

        stmt.close();
        connection.close();
    }
}
