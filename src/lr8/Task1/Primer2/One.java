package lr8.Task1.Primer2;

import java.io.IOException;
import java.io.InputStream;

//Пример 2. Прочитать и вывести на экран информацию из трех источников:
//файла на диске, интернет-страницы и массива типа byte.
public class One {
    //Метод для чтенния данных из потока по байтам с выводом

    public static void readAllByByte(InputStream in) throws IOException {
        while (true) {
            int oneByte = in.read();
            if (oneByte != -1) {
                System.out.print((char) oneByte);
            } else {
                System.out.print("/n" + "end");
                break;
            }

        }}}
