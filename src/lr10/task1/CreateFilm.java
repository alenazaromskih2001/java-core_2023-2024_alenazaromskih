package lr10.task1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import javax.xml.transform.OutputKeys;
import java.io.File;

import java.util.Scanner;
public class CreateFilm  {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            Document film = docBuilder.newDocument();
            Element rootElement = film.createElement("Фильмы");
            film.appendChild(rootElement);

            Element film1 = film.createElement("Фильм");
            rootElement.appendChild(film1);

            Element name1 = film.createElement("Название");
            name1.appendChild(film.createTextNode("Челюсти"));
            film1.appendChild(name1);

            Element author1 = film.createElement("Автор");
            author1.appendChild(film.createTextNode("Питер Бенчли"));
            film1.appendChild(author1);

            Element year1 = film.createElement("Год");
            year1.appendChild(film.createTextNode("1975"));
            film1.appendChild(year1);

            Element film2 = film.createElement("Фильм");
            rootElement.appendChild(film2);

            Element name2 = film.createElement("Название");
            name2.appendChild(film.createTextNode("Дневник Памяти"));
            film2.appendChild(name2);

            Element author2 = film.createElement("Автор");
            author2.appendChild(film.createTextNode("Ник Кассаветис"));
            film2.appendChild(author2);

            Element year2 = film.createElement("Год");
            year2.appendChild(film.createTextNode("2004"));
            film2.appendChild(year2);

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

            System.out.println("XML-файл создан");
            Scanner in = new Scanner(System.in);
            while (true)
            {
                System.out.println("___________________________________\n");
                System.out.println("Выберите действие: ");
                System.out.println("1 - Добавить фильм");
                System.out.println("2 - Удалить фильм");
                System.out.println("3 - Поиск по автору");
                System.out.println("4 - Вывести список фильмов");;
                System.out.println("0 - Выход");
                System.out.println("___________________________________\n");
                System.out.print("Действие?: ");
                int s1 = in.nextInt();
                in.nextLine();
                switch (s1) {
                    case 1: AdditionFilm.add();
                        break;
                    case 2: DeleteFilm.delete();
                        break;
                    case 3: FilterFilm.search();
                        break;
                    case 4: ReadFilm.read();
                        break;
                    case 0:
                        System.exit(0);
                    default:
                        System.out.println("Не правильно выбран вариант");
                }
            }

        } catch (Exception pce) {
            pce.printStackTrace();
        }
    }

}