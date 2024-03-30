package lr10.task1;

import java.io.File;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilterFilm {
    public static void search () {
        try {
            File inputFile = new File("src/lr10/task1/FILM.xml");
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();

            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document film = docBuilder.parse(inputFile);

            XPathFactory xpathFactory = XPathFactory.newInstance();
            XPath xpath = xpathFactory.newXPath();
            film.getDocumentElement().normalize();
            NodeList nodeList = film.getElementsByTagName("Фильм");
            List<String> search = getAuthor(film, xpath);
            System.out.println("Название фильма: " + search.toString());

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    private static List<String> getAuthor(Document doc, XPath xpath)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите автора: ");
        String author = in.nextLine();

        List<String> list = new ArrayList<>();
        try {
            XPathExpression xPathExpression = xpath.compile("/Фильмы/Фильмы[Название='"+author+"']/Автор/text()");
            NodeList nodes = (NodeList) xPathExpression.evaluate(doc, XPathConstants.NODESET);
            for (int i = 0; i < nodes.getLength(); i++)
                list.add(nodes.item(i).getNodeValue());
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }
        return list;
    }
}