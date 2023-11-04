package lr4;
///Напишите программу, в которой создается и инициализируется
//двумерный числовой массив. Затем из этого массива удаляется строка и
//столбец (создается новый массив, в котором по сравнению с исходным
//удалена одна строка и один столбец). Индекс удаляемой строки и индекс
//удаляемого столбца определяется с помощью генератора случайных чисел

import java.util.Random;
public class Example6 {
    public static void main(String[] args) {
        System.out.println("1 массив:");
        Random random = new Random(200);
        int a = 5;
        int b = 5;
        int firstArray[][] = new int[a][b];
        for (int i = 0 ; i <a; i++) {
            for (int j = 0 ; j <b; j++) {
                firstArray[i][j] = random.nextInt(200);
                System.out.println("i = "+i+";j= "+j+";value= "+firstArray[i][j]);
            }
        }
        System.out.println("Удаленные строка и столбец:");

        int deleteS = random.nextInt(a-1);
        int deleteK = random.nextInt(b-1);
        System.out.println("deleteS = "+(deleteS)+";deleteK= "+(deleteK));

        System.out.println("2 массив:");

        int secondArray[][] = new int[a-1][b-1];
        for (int i=0, s = 0; i<a-1; s++) {
            if (s!=deleteS){
                for (int j =0, k = 0 ; j <b-1; k++) {
                    if (k != deleteK) {
                        secondArray[i][j] = firstArray[s][k];
                        System.out.println("i = " + i + ";j= " + j + ";value= " + secondArray[i][j]);
                        j++;
                    }
                }
                i++;
            }
        }
    }
}