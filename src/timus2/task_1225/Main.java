package timus2.task_1225;

import java.util.Scanner;

//В День флага России владелец магазина решил украсить свою витрину полосками ткани белого, синего и красного цветов. Он хочет, чтобы выполнялись следующие условия:
//Полоски одного цвета не должны располагаться рядом друг с другом.
//Синяя полоска может быть расположена только между белой и красной или между красной и белой.
//Определите количество способов выполнить желание владельца магазина.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        long f[] = new long[46];

        f[1] = 2;
        f[2] = 2;
        for (int i = 3; i <= N; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }

        System.out.println(f[N]);

        scanner.close();

    }
}