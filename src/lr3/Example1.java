package lr3;
import java.util.Scanner;
public class Example1 {

    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);

        System.out.println("Введите целое число от 1 до 7");
        int day = id.nextInt();
        switch (day) {
            case 1:
                System.out.println(day + " Вы ввели число, которое соответствует понедельнику");
                break;
            case 2:
                System.out.println(day + " Вы ввели число, которое соответствует вторнику");
                break;
            case 3:
                System.out.println(day + " Вы ввели число, которое соответствует среде");
                break;
            case 4:
                System.out.println(day + " Вы ввели число, которое соответствует четвергу");
                break;
            case 5:
                System.out.println(day + " Вы ввели число, которое соответствует пятнице");
                break;
            case 6:
                System.out.println(day + " Вы ввели число, которое соответствует субботе");
                break;
            case 7:
                System.out.println(day + " Вы ввели число, которое соответствует воскресенью");
                break;
            default:
                System.out.println(day + " Вы ввели некорректное значение. Ведите число от 1 до 7.");
                break;
        }
    }
}