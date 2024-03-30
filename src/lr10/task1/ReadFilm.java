package lr10.task1;
import org.w3c.dom.Document;
import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
public class ReadFilm {
    public static void read () {
        try {
            File inputFile = new File("src/lr10/task1/FILM.xml");
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            Document film = docBuilder.parse(inputFile);
            film.getDocumentElement().normalize();

            System.out.println("Корневой элемент: " + film.getDocumentElement().getNodeName());
            NodeList nodeList = film.getElementsByTagName("Фильм");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    System.out.println("Название фильма: "
                            + element.getElementsByTagName("Название").item(0)
                            .getTextContent());
                    System.out.println("Автор фильма: "
                            + element.getElementsByTagName("Автор").item(0)
                            .getTextContent());
                    System.out.println("Год, в котором выпущен фильм: "
                            + element.getElementsByTagName("Год").item(0)
                            .getTextContent());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}