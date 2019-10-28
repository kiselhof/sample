package sample;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class SaveToXml {

    private String _url;

    public SaveToXml(String url){ this._url = url; }

    public Human LoadXmlFile(){
        Human human = new Human();
        try{
            File xmlFile = new File(_url);
                DocumentBuilderFactory factory = DocumentBuilderFactory.newDefaultInstance();
                DocumentBuilder builder = factory.newDocumentBuilder();
                Document doc = (Document) builder.parse(xmlFile);

                ParseXmlFile(doc, human);
            }
            catch (IOException | SAXException | ParserConfigurationException  e) {
                e.printStackTrace();
            }
            return human;
        }

        public void ParseXmlFile(Document doc, Human human){
            NodeList TeacherNode = doc.getElementsByTagName("staff");

            if (TeacherNode != null){
                for (int i=0; i < TeacherNode.getLength(); i++) {
                    Node node = TeacherNode.item(i);
                    String T_name = ((Element) node).getElementsByTagName("Name").item(0).getTextContent();
                    String T_surname = ((Element) node).getElementsByTagName("Surname").item(0).getTextContent();

                    human.set_name(T_name);
                    human.set_surname(T_surname);
                }
        }
    }
}
