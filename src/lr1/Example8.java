package lr1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите день недели:");
        String day = in.nextLine();

        System.out.println("Введите название месяца:");
        String month = in.nextLine();

        System.out.println("Введите дату (номер дня в месяце)");
        int number = in.nextInt();

        System.out.println("Сегодня"+ " " + number + " " + "число,"+ " "
                + month + ", " + day + ", хорошего тебе дня!");

        in.close();

    }
}
