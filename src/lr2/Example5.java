package lr2;
/*Напишите программу, которая проверяет, сколько тысяч во введенном пользователем числе (определяется четвертая цифра справа в десятичном представлении числа).*/

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите целое число больше 1000:");
        int num = in.nextInt();
        int num1 = (num / 1000) % 10;

        System.out.println("В числе " + num + " " + num1 + " тысяч");


    }
}