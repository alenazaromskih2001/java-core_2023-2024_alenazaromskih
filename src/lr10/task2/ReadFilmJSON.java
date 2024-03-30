package lr10.task2;
import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ReadFilmJSON {
    public static void read() {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser
                    .parse(new FileReader("src/lr10/task2/F.json"));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray jsonArray = (JSONArray) jsonObject.get("film");

            for (Object o: jsonArray)
            {
                JSONObject film1 = (JSONObject) o;
                System.out.println("Название фильма: "+film1.get("Name"));
                System.out.println("Автор фильма: "+film1.get("Author"));
                System.out.println("Год, в котором выпущен фильм:  "+film1.get("Year"));
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}