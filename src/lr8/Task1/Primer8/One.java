package lr8.Task1.Primer8;

import java.io.*;

///Прочитать и вывести на экран информацию из трех источников: файла
//на диске, интернет-страницы и массива данных типа byte. Указать кодировку,
//поддерживающую кириллицу. (Сравнить с работой программы, приведенной в
//примере 2.)
public class One {
    public static void readAllByByte(Reader in) throws IOException {
        while (true) {
            int oneByte = in.read(); // читает 1 байт
            if (oneByte != -1) { // признак конца файла
                System.out.print((char) oneByte);
            } else {
                System.out.print("\n" + " конец ");
                break;
            }
        }
    }

    public static void main(String[] args) {
        try {
// С потоком связан файл
            InputStream inFile = new FileInputStream("src/lr8/Task1/Primer8/Myfile1"); // байтовый поток

            Reader rFile = new InputStreamReader(inFile, "cp1251"); // символьный поток, cp1251- передается русская кодировка

            readAllByByte(rFile);
            System.out.print("\n\n\n");
            inFile.close();
            rFile.close();
// С потоком связана интернет-страница

            InputStream inUrl = new URL("https://edu.itlearn.ru/login/index.php").openStream(); // байтовый поток

            Reader rUrl = new InputStreamReader(inUrl, "cp1251"); // символьный поток

            readAllByByte(rUrl);
            System.out.print("\n\n\n");
            inUrl.close();
            rUrl.close();
// С потоком связан массив типа byte
            InputStream inArray = new ByteArrayInputStream(new byte[]{5, 8, 3, 9, 11});

            Reader rArray = null;
            readAllByByte(rArray);
            System.out.print("\n\n\n");
            inArray.close();
            rArray.close();
        } catch (IOException e) {
            System.out.println("Ошибка: " + e);
        }
    }
}