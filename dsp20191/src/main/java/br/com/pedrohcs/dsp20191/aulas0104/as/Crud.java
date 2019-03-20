package br.com.pedrohcs.dps0104.aula0104.as;

import java.io.*;

public class Crud {

    private String filename = "src/main/resources/samplefile.txt";

    public String getFilename(){
        return this.filename;
    }

    public String write(){
        FileWriter file = null;
        try {
            file = new FileWriter(this.filename);
            PrintWriter writeFile = new PrintWriter(file);
            writeFile.printf("Olá, este arquivo foi criado");
            file.close();
            return "Arquivo Criado";
        } catch (IOException e) {
            e.printStackTrace();
            return "Não foi possível criar o arquivo";
        }
    }

    public String read(){
        return getString(this.filename);

    }

    static String getString(String filename) {
        FileReader file = null;
        String stringFinal = "";
        try {
            file = new FileReader(filename);
            BufferedReader readFile = new BufferedReader(file);
            String linha = readFile.readLine();
            while (linha != null) {
                stringFinal += linha + "\n";
                linha = readFile.readLine();
            }
            file.close();
            return stringFinal;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return "Falha ao ler o arquivo";
        } catch (IOException e) {
            e.printStackTrace();
            return "Falha ao ler o arquivo";
        }
    }
}
