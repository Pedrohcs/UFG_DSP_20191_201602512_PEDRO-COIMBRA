package br.com.pedrohcs.dsp20191.aulas0912.ap;

import org.dom4j.*;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CriarXml {

    private String pedroMat = "201602512";

    public void criar() {
        String alunoMat;

        try {
            File inputFile = new File("src/main/resources/students.xml");
            SAXReader reader = new SAXReader();
            Document document = reader.read(inputFile);

            Element classElement = document.getRootElement();

            List<Node> nodes = document.selectNodes("/class/student");
            System.out.println("----------------------------");

            for (Node node : nodes) {
                alunoMat = node.selectSingleNode("matricula").getText();
                if (this.pedroMat.equals(alunoMat)) {
                    Document documentCreat = DocumentHelper.createDocument();
                    Element root = documentCreat.addElement("class");
                    Element aluno = root.addElement("student");
                    aluno.addElement("matricula").addText(node.selectSingleNode("matricula").getText());
                    aluno.addElement("firstname").addText(node.selectSingleNode("firstname").getText());
                    aluno.addElement("lastname").addText(node.selectSingleNode("lastname").getText());
                    aluno.addElement("nickname").addText(node.selectSingleNode("nickname").getText());
                    Element frequencia = aluno.addElement("frequencia");

                    List<Node> aulas = node.selectSingleNode("frequencia").selectNodes("aulas");
                    for (Node aula : aulas) {
                        frequencia.addElement("aulas").addAttribute("numero", aula.valueOf("@numero")).
                                addText(aula.getText());

                    }
                    XMLWriter output = new XMLWriter(
                            new FileWriter(new File("src/main/resources/pedro.xml")));
                    output.write(documentCreat);
                    output.close();
                }

            }
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void ler() {
        try {
            File inputFile = new File("src/main/resources/pedro.xml");
            SAXReader reader = new SAXReader();
            Document document = reader.read(inputFile);

            Element classElement = document.getRootElement();

            List<Node> nodes = document.selectNodes("/class/student");
            System.out.println("----------------------------");

            for (Node node : nodes) {
                System.out.println("Matrícula: "
                        + node.selectSingleNode("matricula").getText());
                System.out.println("Primeiro Nome: "
                        + node.selectSingleNode("firstname").getText());
                System.out.println("Último nome: "
                        + node.selectSingleNode("lastname").getText());
                System.out.println("Nickname: "
                        + node.selectSingleNode("nickname").getText());

                List<Node> aulas = node.selectSingleNode("frequencia").selectNodes("aulas");

                for (Node aula : aulas) {
                    System.out.println("Frequencia da aula " + aula.valueOf("@numero")
                            + ": " + aula.getText());
                }

                System.out.println("----------------------------");

            }
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}
