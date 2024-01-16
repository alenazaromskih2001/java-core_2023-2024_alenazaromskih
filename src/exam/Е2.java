package exam;

import java.util.Scanner;

/*Напишите программу, которая проверяет,
 удовлетворяет ли введенное пользователем число следующим критериям:
  при делении на 5 в остатке получается 2, а при делении на 7 в остатке получается 1.*/
public class Е2 {
    public static void main(String[] args) {
        System.out.println("Введи число:");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num % 5 == 2 && num % 7 == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
