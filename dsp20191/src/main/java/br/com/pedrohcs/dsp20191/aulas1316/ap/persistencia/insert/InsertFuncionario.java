package br.com.pedrohcs.dsp20191.aulas1316.ap.persistencia.insert;

import br.com.pedrohcs.dsp20191.aulas1316.ap.persistencia.conexao.PersistenciaJdbc;
import br.com.pedrohcs.dsp20191.aulas1316.ap.model.Funcionario;

public class InsertFuncionario extends PersistenciaJdbc{

    public void insert(Funcionario funcionario) throws Exception {
        preparaPersistencia();

        String sql = "INSERT INTO FUNCIONARIOS VALUES('" +
                funcionario.getId() + "','" +
                funcionario.getNome() + "','" +
                funcionario.getMatricula() +
                "')";

        stmt.executeUpdate(sql);

        System.out.println(String.format("O funcionário %s foi incluido na tabela!",
                funcionario.getNome()));

        stmt.close();
        connection.close();
    }
}
