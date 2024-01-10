package lr8.Task1.Primer2;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import static lr8.Task1.Primer2.One.readAllByByte;

//Пример 2. Прочитать и вывести на экран информацию из трех источников:
//файла на диске, интернет-страницы и массива типа byte.
public class Two {
    public static void main(String[] args) throws IOException {
    try {

        //c потоком связан файл
        InputStream inFile = new FileInputStream("c:/tmp/text.txt");
        readAllByByte(inFile);
        System.out.print("/n/n/n");
        inFile.close();
        //c потоком связана интернет страница
        InputStream inUrl = new URL("http://google.com").openStream();
        readAllByByte(inUrl);
        System.out.print("/n/n/n");
        inUrl.close();
        //c потоком связан массив типа byte
        InputStream inArray = new ByteArrayInputStream(new byte[]{7, 9, 3, 7, 4});
        readAllByByte(inArray);
        System.out.print("/n/n/n");
        inArray.close();
    } catch (IOException e){
        System.out.println("Ошибка: "+ e);
    }
}
}
