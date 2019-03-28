package br.com.pedrohcs.dsp20191.aulas0912.ap;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class EditarXml {

    private String aula = "0104";

    public void alterar() {
        try {
            File inputFile = new File("src/main/resources/pedro.xml");
            SAXReader reader = new SAXReader();
            Document document = reader.read(inputFile);
            Element classElement = document.getRootElement();

            List<Node> nodes = document.selectNodes("/class/student");

            for (Node node : nodes) {
                List<Node> aulas = node.selectSingleNode("frequencia").selectNodes("aulas");
                Element element = (Element) node.selectSingleNode("frequencia");
                Iterator<Element> iterator = element.elementIterator("aulas");

                for (Node aula : aulas) {
                    if (this.aula.equals(aula.valueOf("@numero"))) {
                        while (iterator.hasNext()) {
                            Element marksElement = (Element) iterator.next();
                            marksElement.setText("P");
                        }
                    }
                }
            }

            OutputFormat format = OutputFormat.createPrettyPrint();
            XMLWriter output = new XMLWriter(
                    new FileWriter(new File("src/main/resources/pedro.xml")));
            output.write(document);
            output.close();
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
