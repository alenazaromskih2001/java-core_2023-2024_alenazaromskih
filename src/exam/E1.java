package exam;

import java.util.Scanner;

/*Напишите программу, которая проверяет, делится ли введенное Пользователем число на 3.*/
public class E1 {
    public static void main(String[] args) {
        System.out.println("Введи число:");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num % 3 == 0) {
            System.out.println("ДА");
        } else {
            System.out.println("Нет");
        }
    }
}
