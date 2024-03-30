package lr10.task2;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class DeleteFilmJSON {
    public static void del () {
        Scanner in = new Scanner(System.in);
        JSONParser parser = new JSONParser();
        Object obj = null;
        try {
            obj = parser
                    .parse(new FileReader("src/lr10/task2/F.json"));
        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }
        JSONObject films =  (JSONObject) obj;
        JSONArray film1 = (JSONArray) films.get("film");
        System.out.println("Введите название фильма: ");
        String name = in.nextLine();
        Iterator iterator = film1.iterator();
        while (iterator.hasNext()) {
            JSONObject film2 = (JSONObject) iterator.next();
            if (name.equals(film2.get("Название"))) {
                iterator.remove();
            }
        }
        try(FileWriter file = new FileWriter("src/lr10/task2/F.json"))
        {
            file.write(films.toJSONString());
            System.out.println("Фильм"+name+" удален.");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}