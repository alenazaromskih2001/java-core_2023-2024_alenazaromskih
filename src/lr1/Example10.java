package lr1;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите свой год рождения:");
        int num = in.nextInt();

        int number = 2023 - num;

        System.out.println("Вам " + number + " года.");
    }
}
