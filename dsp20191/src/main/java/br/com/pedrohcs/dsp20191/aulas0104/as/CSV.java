package br.com.pedrohcs.dps0104.aula0104.as;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSV {

    private String nomeArquivo = "src/main/resources/UF.csv";
    private String csvDivisor = ",";

    public void init() {
        String linha = "";
        BufferedReader bufferedReader = null;
        try {
            List<UnidadeFederacao> ufs = new ArrayList<UnidadeFederacao>();
            bufferedReader = new BufferedReader(new FileReader(this.nomeArquivo));
            int contador = 0;

            while ((linha = bufferedReader.readLine()) != null) {

                String[] uf = linha.split(csvDivisor);

                if (contador != 0) {
                    UnidadeFederacao unidadeFed = new UnidadeFederacao();
                    unidadeFed.setSigla(uf[1]);
                    unidadeFed.setNome(uf[2]);
                    unidadeFed.setRegiao(uf[3]);
                    ufs.add(unidadeFed);
                } else {
                    System.out.println();
                }

                contador++;
            }
            for (UnidadeFederacao uf : ufs) {
                System.out.println(uf.toString());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
