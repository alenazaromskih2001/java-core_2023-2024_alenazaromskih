package lr1;

import java.util.Scanner;

/*Напишите программу, в которой пользователю предлагается ввести название месяца и количество дней в этом месяце.
 Программа выводит сообщение о том, что соответствующий месяц содержит указанное количество дней.
 */
public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите название месяца:");
        String month = in.nextLine();

        System.out.println("Введите сколько в нем дней:");
        int number = in.nextInt();

        System.out.println("В месяце" + " " + month + " " + number + " дней.");

        in.close();

    }
}