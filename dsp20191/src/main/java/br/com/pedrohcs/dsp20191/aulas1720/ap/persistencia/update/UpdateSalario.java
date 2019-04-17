package br.com.pedrohcs.dsp20191.aulas1720.ap.persistencia.update;

import br.com.pedrohcs.dsp20191.aulas1316.ap.persistencia.conexao.PersistenciaJdbc;

import java.sql.ResultSet;

public class UpdateSalario extends PersistenciaJdbc {

    // Este método altera o salario do funcionario para 3000
    public void updateSalario(long id) throws Exception {
        preparaPersistencia();

        String sql = "UPDATE CARGOS \n" +
                "SET SALARIO = "+ 3000 + "\n" +
                "WHERE ID = " + id;

        stmt.executeUpdate(sql);

        String sqlLotacao = "SELECT IDFUNC FROM LOTACAO\n" +
                "WHERE IDCARGO=" + id;

        ResultSet resultSet = stmt.executeQuery(sqlLotacao);

        while(resultSet.next()) {
            listarFuncionarios(resultSet.getLong(1));
        }

        stmt.close();
        connection.close();

    }

    private void listarFuncionarios(Long id) throws Exception {

        preparaPersistencia();

        String sql = "SELECT NOME FROM FUNCIONARIOS WHERE ID=" + id;

        ResultSet resultSet = stmt.executeQuery(sql);
        while(resultSet.next()) {
            System.out.println(resultSet.getString(1));
        }
    }

}