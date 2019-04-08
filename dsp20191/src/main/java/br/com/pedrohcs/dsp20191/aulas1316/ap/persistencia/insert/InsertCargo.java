package br.com.pedrohcs.dsp20191.aulas1316.ap.persistencia.insert;

import br.com.pedrohcs.dsp20191.aulas1316.ap.persistencia.conexao.PersistenciaJdbc;
import br.com.pedrohcs.dsp20191.aulas1316.ap.model.Cargo;

public class InsertCargo extends PersistenciaJdbc{

    public void insert(Cargo cargo) throws Exception {
        preparaPersistencia();

        String sql = "INSERT INTO CARGOS VALUES('" +
                cargo.getId() + "','" +
                cargo.getNome() + "','" +
                cargo.getSalario() +
                "')";

        stmt.executeUpdate(sql);

        System.out.println(String.format("O cargo %s foi incluido na tabela!",
                cargo.getNome()));

        stmt.close();
        connection.close();
    }
}
