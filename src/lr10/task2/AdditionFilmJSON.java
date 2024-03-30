package lr10.task2;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class AdditionFilmJSON  {
    public static void add () {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите название фильма: ");
        String name = in.nextLine();

        System.out.println("Введите автора фильма: ");
        String author = in.nextLine();

        System.out.println("Введите год, в котором выпущен фильм: ");
        String year = in.nextLine();

        JSONParser parser = new JSONParser();
        Object i = null;
        try {
            i = parser
                    .parse(new FileReader("src/lr10/task2/F.json"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        JSONObject films =  (JSONObject) i;
        JSONArray film = (JSONArray) films.get("film");
        JSONObject newfilm = new JSONObject();
        newfilm.put("Name", name);
        newfilm.put("Author", author);
        newfilm.put("Year", year);
        film.add(newfilm);

        films.put("film",film);
        try(FileWriter file = new FileWriter("src/lr10/task2/F.json"))
        {
            file.write(films.toJSONString());
            System.out.println("Новая фильм добавлен.");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}