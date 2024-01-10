package lr8.Task1.Primer3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

//Прочитать и вывести на экран информацию из предварительно
//созданного файла с использованием буфера в 5 байт.
public class One {
    //считывает по 5 символов(буфер)
    public static void readAllByArray(InputStream in) throws IOException {
        byte[] buff = new byte[5];
        while (true) {
            int count = in.read(buff);
            if(count != -1){
                System.out.println("количество ="+count+", buff="+ Arrays.toString(buff)+", str = "+ new String(buff,0,count,"cp1251"));//UTF8
                //(buff,0,count,"cp1251")) - данные буфера преобразовываются в строку
            } else {
                break;
            }
        }
    }

    public static void main(String[] args) throws  IOException {
        String fileName = "E:\\MyFile1.txt";
        InputStream inFile = null;// переменная объявляется до секции try, чтобы не ограничивать область видимости
        try {
            inFile= new FileInputStream(fileName);
            readAllByArray(inFile);
        } catch (IOException e) {
            System.out.println("Ошибка открытия- закрытия файла " + fileName + e);

        }finally { //корректное закрытие потока
            if(inFile != null){
                try {
                    inFile.close();
                } catch (IOException ignore){
                    /*NOP*/ //No Operation - ничего не делать
                }
            }
        }

    }
}
