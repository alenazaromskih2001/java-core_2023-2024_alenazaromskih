package lr1;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите фамилию:");
        String firstName = in.nextLine();
        System.out.println("Введите имя:");
        String secName = in.nextLine();
        System.out.println("Введите отчество:");
        String thName = in.nextLine();
        System.out.println("Hello" + " " + firstName + " " + secName + " " +  thName + "!");

}
}
