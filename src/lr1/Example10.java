package lr1;

import java.util.Scanner;

/*Напишите программу, в которой по году рождения определяется возраст пользователя.*/
public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите свой год рождения:");
        int num = in.nextInt();

        int number = 2023 - num;

        System.out.println("Вам " + number + " года.");
    }
}
