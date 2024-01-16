package lr3;

import java.util.Scanner;
/*Напишите программу, в которой пользователю предлагается
ввести название дня недели. По введенному названию программа определяет
порядковый номер дня в неделе. Если пользователь вводит неправильное
название дня, программа выводит сообщение о том, что такого дня нет.
Предложите версию программы на основе вложенных условных операторов и
на основе оператора выбора switch*/

public class Example2 {

    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);

        System.out.println("Введите название дня недели.(по-русски и с маленькой буквой)");
        String day = id.nextLine();
        switch (day) {
            case "понедельник":
                System.out.println(day + " это 1 день недели.");
                break;
            case "вторник":
                System.out.println(day + " это 2 день недели.");
                break;
            case "среда":
                System.out.println(day + " это 3 день недели.");
                break;
            case "четверг":
                System.out.println(day + " это 4 день недели.");
                break;
            case "пятница":
                System.out.println(day + " это 5 день недели.");
                break;
            case "суббота":
                System.out.println(day + " это 6 день недели.");
                break;
            case "воскресенье":
                System.out.println(day + " это 7 день недели.");
                break;
            default:
                System.out.println(" Вы ввели некорректное значение. Введите название дня недели.(по-русски и с маленькой буквой)");
                break;
        }
    }
}
