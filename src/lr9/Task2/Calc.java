package lr9.Task2;

import java.util.Scanner;

///Создать приложение с использованием рекурсии для перевода целого числа, введенного с клавиатуры, в двоичную систему счисления.
public class Calc {

    public static void binar(int a) {
        int i, b;
        while(a !=0 ) {
            b = a%2;
            System.out.print(b);
            a = a/2;
        }
    }
    public static void main(String [] args) {
        binar(8);

    }
}