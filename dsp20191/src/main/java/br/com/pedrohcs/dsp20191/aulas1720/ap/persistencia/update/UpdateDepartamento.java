package br.com.pedrohcs.dsp20191.aulas1720.ap.persistencia.update;

import br.com.pedrohcs.dsp20191.aulas1316.ap.persistencia.conexao.PersistenciaJdbc;

public class UpdateDepartamento extends PersistenciaJdbc {

    public void updateNome(long id, String nome) throws Exception {
        preparaPersistencia();

        String sql = "UPDATE DEPARTAMENTOS \n" +
                "SET NOME = '" + nome + "'\n" +
                "WHERE ID = " + id;

        stmt.executeUpdate(sql);

        System.out.println(String.format("O departamento foi atualizado!"));

        stmt.close();
        connection.close();
    }
}
