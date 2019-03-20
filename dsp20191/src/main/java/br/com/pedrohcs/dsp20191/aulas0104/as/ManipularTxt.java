package br.com.pedrohcs.dps0104.aula0104.as;

import java.io.*;

public class ManipularTxt {

    private String filename;

    public ManipularTxt(String filename) {
        this.filename = filename;
        FileReader fileRead = null;
        FileWriter fileWrite = null;
        String stringFinal = "";
        try {
            fileRead = new FileReader(this.filename);
            BufferedReader readFile = new BufferedReader(fileRead);
            String linha = readFile.readLine();
            while (linha != null) {
                stringFinal += linha + "\n";
                linha = readFile.readLine();
            }
            fileWrite = new FileWriter(this.filename);
            PrintWriter writeFile = new PrintWriter(fileWrite);
            writeFile.printf(stringFinal);
            writeFile.printf("Primeira linha\nSegunda Linha\nTerceira Linha\n" +
                    "Quarta Linha\nQuinta linha");
            fileRead.close();
            fileWrite.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String read() {
        Crud crud = new Crud();
        return crud.getString(this.filename);

    }
}
