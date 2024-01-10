package lr8.Task1.Primer7;

import javax.imageio.IIOException;
import java.io.*;

///Чтение из одного файла и запись в другой файл данных построчно с использованием буфера в 1 килобайт.
public class One {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter out = null;
        try {
            br = new BufferedReader(new FileReader("src/lr8/Task1/Primer7/MyFile1"), 1024); //размер буфера 1024
            out = new BufferedWriter(new FileWriter("src/lr8/Task1/Primer7/MyFile2"));
            int lineCount = 0;
            String s;

            while ((s= br.readLine()) !=null){
                lineCount++;
                System.out.println(lineCount + ":"+s);
                out.write(s);
                out.newLine();
            }

        }catch(IIOException e){
            System.out.println("Ошибка!!!!!");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}

