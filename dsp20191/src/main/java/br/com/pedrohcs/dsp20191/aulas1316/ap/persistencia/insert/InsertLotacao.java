package br.com.pedrohcs.dsp20191.aulas1316.ap.persistencia.insert;

import br.com.pedrohcs.dsp20191.aulas1316.ap.persistencia.conexao.PersistenciaJdbc;
import br.com.pedrohcs.dsp20191.aulas1316.ap.model.Lotacao;

import java.sql.PreparedStatement;

public class InsertLotacao extends PersistenciaJdbc {

    public void insert(Lotacao lotacao) throws Exception {
        preparaPersistencia();

        String sql = "INSERT INTO LOTACAO VALUES(" +
                lotacao.getId() + "," +
                "?," +
                "?," +
                lotacao.getDepartamento().getId() + "," +
                lotacao.getCargo().getId() + "," +
                lotacao.getFuncionario().getId() +
                ")";

        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setDate(1, new java.sql.Date(lotacao.getDataInicial().getTime()));
        ps.setDate(2, new java.sql.Date(lotacao.getDataFinal().getTime()));

        ps.executeUpdate();

        System.out.println(String.format("O lotação  do funcionario %s foi incluido na tabela!",
                lotacao.getFuncionario().getNome()));

        stmt.close();
        connection.close();
    }
}
