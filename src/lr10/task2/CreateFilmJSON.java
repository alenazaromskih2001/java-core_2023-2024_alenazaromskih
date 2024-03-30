package lr10.task2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.util.Scanner;
public class CreateFilmJSON {
    public static void main(String[] args) {
        JSONObject films = getJsonObject();


        try (FileWriter file = new FileWriter("src/lr10/task2/F.json")) {
            file.write(films.toJSONString());
            System.out.println("JSON файл успешно создан");

            Scanner in = new Scanner(System.in);

            while (true) {
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
                    case 1:
                        AdditionFilmJSON.add();
                        break;
                    case 2:
                        DeleteFilmJSON.del();
                        break;
                    case 3:
                       FilterFilmJSON.search();
                        break;
                    case 4:
                        ReadFilmJSON.read();
                        break;
                    case 0:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Н" + "Не правильно выбран вариант");
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static JSONObject getJsonObject() {
        JSONObject films = new JSONObject();
        JSONArray film = new JSONArray();

        JSONObject film1 = new JSONObject();
        film1.put("Name", "Дневник Памяти");
        film1.put("Author", "Ник Кассаветис");
        film1.put("Year", "2010");

        JSONObject film2 = new JSONObject();
        film2.put("Name", "Челюсти");
        film2.put("Author", "Питер Бенчли");
        film2.put("Year", "1975");

        film.add(film1);
        film.add(film2);

        films.put("film", film);
        return films;
    }
}