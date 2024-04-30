package timus2.task_1010;

import java.util.Scanner;

//Дана дискретная функция. Она определена для целых аргументов из диапазона от 1 до N и может принимать значения от −231 до 231−1.
// Требуется найти такие две точки A и B на графике функции, для которых все точки между ними расположены строго ниже прямой AB.
// Среди всех допустимых пар нужно выдать такую, для которой модуль углового коэффициента прямой AB максимален.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long k = 0;
        int p1 = 0;
        int p2 = 0;
        int N = in.nextInt();

        long prev = in.nextLong();

        for (int i = 2; i <= N; i++) {
            long current = in.nextLong();
            if (Math.abs(current - prev) > k) {
                k = Math.abs(current - prev);
                p1 = i - 1;
                p2 = i;
            }
            prev = current;
        }

        System.out.println(p1 + " " + p2);
    }
}

