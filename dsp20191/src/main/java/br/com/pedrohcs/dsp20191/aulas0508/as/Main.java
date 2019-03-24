package br.com.pedrohcs.dsp20191.aulas0508.as;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Aluno pedro = new Aluno("Pedro Henrique", (long)201602512, 6.5,8.9);
        Aluno gabi = new Aluno("Gabriela Gontijo", (long)201803029, 8.5, 4.5);
        Aluno hyago = new Aluno("Hyago Vieira", (long)201602512, 3.0, 4.5);

        FileOutputStream fileOutputStream;
            try {
            fileOutputStream = new FileOutputStream("src/main/resources/avaliacao.dat");

            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
            dataOutputStream.writeUTF(pedro.toString());
            dataOutputStream.writeUTF(gabi.toString());
            dataOutputStream.writeUTF(hyago.toString());

            analisarNota();

            fileOutputStream.close();
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void analisarNota(){
        try {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream("src/main/resources/avaliacao.dat"));

            while(dataInputStream.available() > 0) {
                String linha = dataInputStream.readUTF();
                String atributos[] = linha.split(",");
                String resultado;
                if((Double.parseDouble(atributos[2]) + Double.parseDouble(atributos[3])) / 2 >= 5.0) {
                    resultado = "Aluno Aprovado \n";
                } else {
                    resultado = "Aluno Reprovado \n";
                }
                System.out.println(linha + resultado);
            }
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

