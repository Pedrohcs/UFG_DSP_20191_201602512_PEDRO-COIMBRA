package br.com.pedrohcs.dsp20191.aulas1720.ap;

import br.com.pedrohcs.dsp20191.aulas1720.ap.persistencia.delete.Delete;
import br.com.pedrohcs.dsp20191.aulas1720.ap.persistencia.update.*;

import java.util.Calendar;

public class Main {

    public static void main(String[] args){
        UpdateCargo updateCargo = new UpdateCargo();
        UpdateDepartamento updateDepartamento = new UpdateDepartamento();
        UpdateFuncionario updateFuncionario = new UpdateFuncionario();
        UpdateLotacao updateLotacao = new UpdateLotacao();

        long idCargo = 100;
        long idDepart = 101;
        long idFunc = 105;
        long idLotacao = 104;
        Calendar dataFinal;
        dataFinal = Calendar.getInstance();
        dataFinal.set(2021,6,22);

        try {
            updateCargo.updateNome(idCargo, "Cargo Atualizado");
            updateDepartamento.updateNome(idDepart, "Departamento Atualizado");
            updateFuncionario.updateNome(idFunc, "Funcionario Atualizado");
            updateLotacao.updateDataFinal(idLotacao, dataFinal.getTime());
        } catch (Exception e) {
            e.printStackTrace();
        }

        UpdateSalario updateSalario = new UpdateSalario();
        try {
            updateSalario.updateSalario(102);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Delete delete = new Delete();

        try{
            delete.deleteAllObjts("LOTACAO");
            delete.deleteAllObjts("FUNCIONARIOS");
            delete.deleteAllObjts("DEPARTAMENTOS");
            delete.deleteAllObjts("CARGOS");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
