package lr8.Task2;

import java.io.*;

//utf смотреть страницу 11-12
public class One  {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        PrintWriter out=null;
        try {
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("src/lr8/Task2/file2"),"UTF-8"));
            out = new PrintWriter("src/lr8/Task2/file_perepisanyi", "cp1251");
            int lineCount = 0;
            String s;
            double num;
            while ((s = br.readLine()) != null) {
                lineCount++;
                if (lineCount == 2) {
                    out.println(lineCount + ": " + s);
                }
                if (lineCount > 2) {
                    num = Double.parseDouble(s);
                    if (num > 0) {
                        out.println(lineCount + ": " + s);
                    }}}
        } catch (IOException e) {
            System.out.println("Ошибка !!!!!!!!"); }
        finally{
            br.close();
            out.flush();
            out.close();
        }}}