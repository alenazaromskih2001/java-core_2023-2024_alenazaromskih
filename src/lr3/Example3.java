package lr3;
import java.util.Scanner;
public class Example3{
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Ввведите количество чисел Фибоначчи");
        int x = id.nextInt();
        int i = x;
        int q = 0;
        int a = 1;
        int b = 1;
        while (i > 0) {
            System.out.printf("%d ", b);
            b = q + a;
            q = a;
            a = b;
            i--;
        }

    }
    }
