package br.com.pedrohcs.dsp20191.aulas1720.ap.persistencia.update;

import br.com.pedrohcs.dsp20191.aulas1316.ap.persistencia.conexao.PersistenciaJdbc;

public class UpdateCargo extends PersistenciaJdbc {

    public void updateNome(long id, String nome) throws Exception {
        preparaPersistencia();

        String sql = "UPDATE CARGOS \n" +
                "SET NOME = '" + nome + "'\n" +
                "WHERE ID = " + id;

        stmt.executeUpdate(sql);

        System.out.println(String.format("O cargo foi atualizado!"));

        stmt.close();
        connection.close();
    }
}
