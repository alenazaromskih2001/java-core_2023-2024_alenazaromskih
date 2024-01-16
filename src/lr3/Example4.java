package lr3;

import java.util.Scanner;

/*Напишите программу, в которой пользователем вводится два
целых числа. Программа выводит все целые числа — начиная с наименьшего
(из двух введенных чисел) и заканчивая наибольшим (из двух введенных
чисел). Предложите разные версии программы (с использованием разных
операторов цикла).
*/
public class Example4 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Ввведите первое целое число");
        int x = id.nextInt();
        System.out.println("Ввведите второе целое число");
        int y = id.nextInt();

        if (x > y) {
            for (int y1 = y; y1 <= x; y1++) {
                System.out.printf("%d ", y1);
            }
        } else {
            for (int x1 = x; x1 <= y; x1++) {
                System.out.printf("%d ", x1);
            }
        }
    }
}
