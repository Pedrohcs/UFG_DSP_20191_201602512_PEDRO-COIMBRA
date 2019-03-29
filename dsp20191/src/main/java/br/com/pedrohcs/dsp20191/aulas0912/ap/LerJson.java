package br.com.pedrohcs.dsp20191.aulas0912.ap;

import br.com.pedrohcs.dsp20191.aulas0912.ap.classesJson.Aluno;
import br.com.pedrohcs.dsp20191.aulas0912.ap.classesJson.Aula;
import br.com.pedrohcs.dsp20191.aulas0912.ap.classesJson.Ufg;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;

public class LerJson {

    public void ler(){

        BufferedReader bufferedReader = null;
        try {
            GsonBuilder builder = new GsonBuilder();
            Gson gson = builder.create();
            bufferedReader = new BufferedReader(
                    new FileReader("src/main/resources/students.json"));
            Ufg ufg = gson.fromJson(bufferedReader, Ufg.class);
            for (Aluno aluno : ufg.getTurmas().getAlunos()){
                System.out.println("------------------------");
                System.out.println(aluno.getMatricula());
                System.out.println(aluno.getFirstname());
                System.out.println(aluno.getLastname());
                System.out.println(aluno.getNickname());
                for (Aula aula : aluno.getFreq().getAulas()){
                    System.out.println(aula.getNome());
                    System.out.println(aula.getFreq());
                }
                System.out.println("------------------------");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
