package lr2;

import java.util.Scanner;

/*Напишите программу, которая проверяет, удовлетворяет ли введенное пользователем число следующим критериям: число делится на 4, и при этом оно не меньше 10.*/
public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число:");
        int num = in.nextInt();
        if (num % 4 == 0 && num >= 10) {
            System.out.println("Число " + num + " делится на 4 и больше 10.");
        } else {
            System.out.println("Число " + num + " не удовлетворяет условиям.");
        }

    }
}
