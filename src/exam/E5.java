package exam;

import java.util.Scanner;

/*Напишите программу, которая проверяет, сколько тысяч во введенном пользователем числе (определяется четвертая цифра справа в десятичном представлении числа).*/
public class E5 {
    public static void main(String[] args) {
        System.out.println("Введи число");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int num1 = (num/1000);
        System.out.println(num1);
    }
}
