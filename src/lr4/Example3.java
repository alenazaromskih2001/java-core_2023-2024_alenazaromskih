package lr4;
///Напишите программу, в которой создается двумерный массив, который
//выводит прямоугольник из цифр 2;

public class Example3 {
    public static void main(String[] args) {
        int width = 5;
        int height = 9;
        int[][] graph = new int[height][width];
        int z = 0;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                graph[i][j] = 2;
            }
        }
        for (int i = 0; i < height; i++) {
            int count = i + 1;
            System.out.print("номер строки " + count + " : ");
            for (int j = 0; j < width; j++) {
                System.out.print(graph[i][j] + " ");
                z++;
            }
            System.out.println(" Количество символов в строке " + z);
            z = 0;
        }
    }
}
