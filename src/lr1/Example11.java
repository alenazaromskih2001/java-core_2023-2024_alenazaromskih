package lr1;

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите имя:");
        String name = in.nextLine();

        System.out.println("Введите свой год рождения:");
        int num = in.nextInt();




        int number = 2023 - num;

        System.out.println("Здравствуйте, " +  name + "! В свои " + number + " года вы выглядите прекрасно!");
    }
}
