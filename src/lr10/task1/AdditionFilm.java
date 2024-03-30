package lr10.task1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class AdditionFilm {
    public static void add () {
        try{
            Scanner in = new Scanner(System.in);
            File inputFile = new File("src/lr10/task1/FILM.xml");
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            Document film = docBuilder.parse(inputFile);

            System.out.print("Введите название фильма: ");
            String name = in.nextLine();

            System.out.print("Введите автора фильма: ");
            String author = in.nextLine();

            System.out.print("Введите год, в котором выпущен фильм: ");
            String year = in.nextLine();

            Element film1 = film.createElement("Фильм");
            film.getDocumentElement().appendChild(film1);

            Element name1 = film.createElement("Название");
            name1.appendChild((film.createTextNode(name)));
            film1.appendChild(name1);

            Element author1 = film.createElement("Автор");
            author1.appendChild(film.createTextNode(author));
            film1.appendChild(author1);

            Element year1 = film.createElement("Год");
            year1.appendChild(film.createTextNode(year));
            film1.appendChild(year1);

            film.setXmlStandalone(true);
            film.normalizeDocument();
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "no");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount","2");
            DOMSource source = new DOMSource(film);
            StreamResult result = new StreamResult(new FileOutputStream("src/lr10/task1/FILM.xml"));
            transformer.transform(source, result);

            System.out.println("Новый фильм добавлен.");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}