package exam;

import java.util.Scanner;

/*Напишите программу, в которой пользователь вводит целое число
в диапазоне от 1 до 7, а программа определяет по этому числу день недели.
Если введенное пользователем число выходит за допустимый диапазон,
выводится сообщение о том, что введено некорректное значение. Используйте
оператор выбора switch.*/
public class E6 {
    public static void main(String[] args) {
        System.out.println("Введи число от 1 до 7");
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();
        switch (day) {
            case 1:
                System.out.println("Вы ввели понедельник");
                break;
            case 2:
                System.out.println("Вы ввели вторник");
                break;

            case 3:
                System.out.println("Вы ввели среду");
                break;

            case 4:
                System.out.println("Вы ввели четверг");
                break;

            case 5:
                System.out.println("Вы ввели пятницу");
                break;

            case 6:
                System.out.println("Вы ввели субботу");
                break;

            case 7:
                System.out.println("Вы ввели воскресенье");
                break;

            default:
                System.out.println("Вы ввели неправильное число");
                break;


        }
    }
}
