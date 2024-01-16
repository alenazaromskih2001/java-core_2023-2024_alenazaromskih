package exam;

import java.util.Scanner;

/*Напишите программу, которая проверяет, попадает ли введение пользователем число в диапазон от 5 до 10 включительно.*/
public class E4 {
    public static void main(String[] args) {
        System.out.println("Введи число");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if (num > 4 && num < 11) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
