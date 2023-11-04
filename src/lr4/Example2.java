package lr4;
//Напишите программу, которая выводит в консольное окно
//прямоугольный треугольник;
public class Example2 {
    public static void main(String[] args) {
        int figure = 10;
        int z = 0;
        for (int i = 1; i <= figure; i++) {
            System.out.print("номер строки: " + i + " ");
            for (int j = 0; j <= z; j++) {
                System.out.print("+");
            }
            z = z + 1;
            System.out.println(" Количество символов в строке " + z);
        }
    }
}
