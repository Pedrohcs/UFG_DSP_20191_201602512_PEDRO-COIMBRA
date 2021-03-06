package br.com.pedrohcs.dsp20191.aulas0912.ap;

import java.io.File;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

public class LerXml {

    public static void ler() {
        try {
            File inputFile = new File("src/main/resources/students.xml");
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
