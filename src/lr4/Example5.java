package lr4;
/// Напишите программу, в которой создается двумерный целочисленный
//массив. Он заполняется случайными числами. Затем в этом массиве строи и
//столбцы меняются местами: первая строка становится первым столбцом,
//вторая строка становиться вторым столбцом и так далее. Например, если
//исходный массив состоял из 3 строк и 5 столбцов, то в итоге получаем массив
//из 5 строк и 3 столбцов

import java.util.Random;

public class Example5 {
    public static void main(String[] args) {
        System.out.println("Массив 3 строки и 5 столбцов.");
        Random random = new Random(200);
        int a = 5;
        int b = 3;
        int[][] firstArray = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                firstArray[i][j] = random.nextInt(200);
                ;
                System.out.println("i = " + i + "; j= " + j + "; value= " + firstArray[i][j]);
            }
        }
        System.out.println("Массив 5 строк и 3 столбца.");

        int[][] secondArray = new int[b][a];
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                secondArray[i][j] = firstArray[j][i];
                System.out.println("i = " + i + ";j= " + j + ";value= " + secondArray[i][j]);
            }
        }
    }
}