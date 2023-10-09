package lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число:");
        int num1 = in.nextInt();
        int num2 = num1 - 1;
        int num3 = num1 + 1;
        int num4 = (num1 + num2 + num3) * (num1 + num2 + num3);

        System.out.println("Ваше число: " + num1 +". " + "Число на 1 меньше: "
                + num2 + ". " + "Число на 1 больше: " + num3 + ". "+ "Квадрат суммы первых трех чисел.: "
                + num4 + ".");
    }
}
