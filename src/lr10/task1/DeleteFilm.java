package lr10.task1;
import org.w3c.dom.Document;
import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.OutputKeys;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
public class DeleteFilm {
    public static void delete () {
        try {
            File inputFile = new File("src/lr10/task1/FILM.xml");
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            Document film = docBuilder.parse(inputFile);
            film.getDocumentElement().normalize();
            NodeList List = film.getElementsByTagName("Фильм");

            Node fi = List.item(0);
            Element filmElement = (Element) fi;
            filmElement.getElementsByTagName("Фильм").item(0);

            Node fi1 = filmElement.getParentNode();
            fi1.removeChild(filmElement);

            film.setXmlStandalone(true);
            film.normalizeDocument();
            javax.xml.transform.TransformerFactory tf = javax.xml.transform.TransformerFactory.newInstance();
            javax.xml.transform.Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            javax.xml.transform.dom.DOMSource source = new javax.xml.transform.dom.DOMSource(film);
            javax.xml.transform.stream.StreamResult result =
                    new javax.xml.transform.stream.StreamResult(new File("src/lr10/task1/FILM.xml"));
            transformer.transform(source, result);

            System.out.println("Фильм удален");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}