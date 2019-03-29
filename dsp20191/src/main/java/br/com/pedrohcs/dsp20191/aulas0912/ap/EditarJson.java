package br.com.pedrohcs.dsp20191.aulas0912.ap;

import br.com.pedrohcs.dsp20191.aulas0912.ap.classesJson.Aluno;
import br.com.pedrohcs.dsp20191.aulas0912.ap.classesJson.Aula;
import br.com.pedrohcs.dsp20191.aulas0912.ap.classesJson.Ufg;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;

public class EditarJson {

    private String pedroMat = "201602512";
    private String aula = "0104";

    public void editarJson() {
        int contador = 0;
        BufferedReader bufferedReader = null;
        try {
            GsonBuilder builder = new GsonBuilder();
            Gson gson = builder.create();
            bufferedReader = new BufferedReader(
                    new FileReader("src/main/resources/students.json"));
            Ufg ufg = gson.fromJson(bufferedReader, Ufg.class);
            for (Aluno aluno : ufg.getTurmas().getAlunos()) {
                if (aluno.getMatricula().equals(this.pedroMat)) {
                    System.out.println("------------------------");
                    System.out.println(aluno.getMatricula());
                    System.out.println(aluno.getFirstname());
                    System.out.println(aluno.getLastname());
                    System.out.println(aluno.getNickname());
                    for (Aula aula : aluno.getFreq().getAulas()) {
                        if (aula.getNome().equals(this.aula)) {
                            aula.setFreq("P");
                            System.out.println(aula.getNome());
                            System.out.println(aula.getFreq());
                        } else {
                            System.out.println(aula.getNome());
                            System.out.println(aula.getFreq());
                        }
                    }
                    System.out.println("------------------------");
                    break;
                } else {
                    contador++;
                }
            }

            Gson gsonReader = new Gson();
            String json = gsonReader.toJson(ufg.getTurmas().getAlunos().get(contador));
            FileWriter writer = new FileWriter("src/main/resources/pedro.json");
            writer.write(json);
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
