package br.com.pedrohcs.dsp20191.aulas1316.ap.persistencia.insert;

import br.com.pedrohcs.dsp20191.aulas1316.ap.persistencia.conexao.PersistenciaJdbc;
import br.com.pedrohcs.dsp20191.aulas1316.ap.model.Departamento;

public class InsertDepartamento extends PersistenciaJdbc{

    public void insert(Departamento departamento) throws Exception {
        preparaPersistencia();

        String sql = "INSERT INTO DEPARTAMENTOS VALUES('" +
                departamento.getId() + "','" +
                departamento.getNome() +
                "')";

        stmt.executeUpdate(sql);

        System.out.println(String.format("O departamento %s foi incluido na tabela!",
                departamento.getNome()));

        stmt.close();
        connection.close();
    }
}
