package lr4;

///Напишите программу, в которой создается двумерный массив, который
//выводит прямоугольный треугольник;
public class Example4 {
    public static void main(String[] args) {

        int height = 9;
        int[][] graph = new int[height][];
        for (int i = 0; i < graph.length; i++) {
            int j = i + 1;
            graph[i] = new int[j];
        }
        int z = 0;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < i + 1; j++) {
                graph[i][j] = 9;
            }
        }
        for (int i = 0; i < height; i++) {
            int count = i + 1;
            System.out.print("номер строки " + count + " : ");
            for (int j = 0; j < graph[i].length; j++) {
                System.out.print(graph[i][j] + " ");
                z++;
            }
            System.out.println(" Количество символов в строке " + z);
            z = 0;
        }
    }
}