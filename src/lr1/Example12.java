package lr1;

import java.util.Scanner;

/*Напишите программу, в которой по возрасту определяется год рождения*/
public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите свой возраст:");
        int num = in.nextInt();

        int number = 2023 - num;

        System.out.println("Вы " + number + " года рождения.");
    }
}

