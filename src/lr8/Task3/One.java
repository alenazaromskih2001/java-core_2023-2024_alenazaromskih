package lr8.Task3;

import java.io.*;

public class One {

    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        PrintWriter out = null;
        try {
            String letters = "бБвВгГдДжЖзЗйЙкКлЛмМнНпПрРсСтТфФхХцЦчЧшШщЩ";
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("src/lr8/Task3/file3")));
            File f1 = new File("src/lr8/Task3/file_perepisanyi");
            f1.createNewFile();
            out = new PrintWriter("src/lr8/Task3/file_perepisanyi");
            String stroka;
            int counterLine = 0;
            int counter = 0;
            while ((stroka = br.readLine()) != null) {
                counter = 0;
                out.print("Строка " + counterLine + ": ");
                System.out.print("Строка " + counterLine + ": ");
                if (stroka.length() != 0) {
                    for (String word : stroka.split(" ")) {
                        if (letters.contains(word.substring(0, 1))) {
                            out.print(word + " ");
                            System.out.print(word + " ");
                            counter++;
                        }

                    }
                }
                out.print("Количество слов в строке начиающихся с согласных - " + counter);
                System.out.print("Количество слов в строке начиающихся с согласных - " + counter + "\n");
                counterLine++;
                out.println();
            }
        } catch (IOException e) {
            System.out.println("ошибка" + e);
        } finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}