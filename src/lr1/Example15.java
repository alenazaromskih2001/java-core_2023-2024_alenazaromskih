package lr1;

import java.util.Scanner;

/*Напишите программу, в которой Пользователь вводит два числа, а программой вычисляется и отображается сумма и разность этих чисел.*/
public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int num1 = in.nextInt();
        System.out.println("Введите второе число:");
        int num2 = in.nextInt();

        int number1 = num1 + num2;
        int number2 = num1 - num2;

        System.out.println("При сложении " + num1 + " и " + num2 + " получилось " + number1 + ". При вычитании - " + number2 + ".");
    }
}

