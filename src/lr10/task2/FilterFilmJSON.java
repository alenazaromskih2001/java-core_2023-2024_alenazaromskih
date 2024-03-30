package lr10.task2;
import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.util.Scanner;

public class FilterFilmJSON {
    public static void search () {
        Scanner in = new Scanner(System.in);
        try {
            JSONParser parser = new JSONParser();
            Object i = parser
                    .parse(new FileReader("src/lr10/task2/F.json"));
            JSONObject jsonObject = (JSONObject) i;
            System.out.print("Введите автора фильма: ");
            String author = in.nextLine();

            JSONArray jsonArray = (JSONArray) jsonObject.get("Author");
            for (Object o: jsonArray)
            {
                JSONObject films = (JSONObject) o;
                jsonArray.stream().filter(film1 -> film1 instanceof JSONObject).map(film1 -> (JSONObject) films).filter(film1 -> author.equals(films.get("Stamp"))).forEach(film1->{
                    System.out.print("Название фильма: " + films.get("Name"));
                    System.out.print("\nАвтор фильма: " + films.get("Author"));
                    System.out.print("\nГод, в котором выпущен фильм: " + films.get("Year"));
                });

            }


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}