package lr2;

import java.util.Scanner;

/*Напишите программу, которая проверяет,
 удовлетворяет ли введенное пользователем число следующим критериям:
  при делении на 5 в остатке получается 2, а при делении на 7 в остатке получается 1.*/
public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число:");
        int num = in.nextInt();
        if (num % 5 == 2) {
            System.out.println("Число " + num + " делится на 5 и в остатке получается 2.");
        } else if (num % 7 == 1) {
            System.out.println("Число " + num + " делится на 7 и в остатке получается 1.");
        } else {
            System.out.println("Число " + num +
                    " не удовлетворяет условиям, введите другое.");

        }

    }
}
