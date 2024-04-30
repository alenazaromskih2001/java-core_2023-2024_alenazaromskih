package timus2.task_1263;

import java.util.Scanner;

//Грядут очередные выборы. Снова все заборы оклеены листовками, почтовые ящики забиты макулатурой,
// с экранов телевизоров на нас взирают мордатые дядьки, обещающие сделать нашу жизнь лучше…
// А программист Васечкин снова завален работой. Необходимо написать программу, которая облегчит подсчет голосов избирателей.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfParties = scanner.nextInt();
        int numberOfPeople = scanner.nextInt();
        int[] numberOfPartiesArr = new int[numberOfParties];
        for (int i = 0; i < numberOfPeople; i++) {
            numberOfPartiesArr[scanner.nextInt() - 1] += 1;
        }
        for (int value : numberOfPartiesArr) {
            double result = 100 / ((double) numberOfPeople / value);
            System.out.printf("%.2f%%%n", result);

        }
    }
}