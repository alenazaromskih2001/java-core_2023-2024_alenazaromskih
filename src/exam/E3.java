package exam;
/*Напишите программу, которая проверяет, удовлетворяет ли введенное пользователем число следующим критериям: число делится на 4, и при этом оно не меньше 10.*/

import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        System.out.println("Введи число:");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num % 4 == 0 && num >= 10) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
