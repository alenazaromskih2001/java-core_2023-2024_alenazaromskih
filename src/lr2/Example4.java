package lr2;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число:");
        int num = in.nextInt();
        if (num>4 && num<11){
            System.out.println("Число " + num + " попадает в диапазон от 5 до 10" );
        } else {
            System.out.println("Число " + num + " не попадает в диапазон от 5 до 10" );
        }

    }
}
