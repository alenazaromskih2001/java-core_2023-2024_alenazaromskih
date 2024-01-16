package lr4;

/// Напишите программу, в которой создается двумерный числовой массив
//и этот массив заполняется «змейкой»: сначала первая строка (слева направо),
//затем последний столбец (снизу вверх), вторая строка (слева направо) и так
//далее
public class Example7 {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int[][] ArrayZmeyka = new int[a][b];
        int hvost = 0;
        int telo = 0;
        int h = 0;
        for (int i = 0; h < ArrayZmeyka.length; h++) {
            for (int j = 0; j < (ArrayZmeyka[i].length - hvost); j++) {
                ArrayZmeyka[i][j] = telo;
                telo++;
            }
            if (i < ArrayZmeyka.length - 1) {
                i++;
            }
            for (int o = a - 1; o > hvost; o--) {
                ArrayZmeyka[o][ArrayZmeyka[i].length - 1 - hvost] = telo;
                telo++;
            }
            hvost++;
        }
        int z = 0;
        for (int i = 0; i < ArrayZmeyka.length; i++) {
            int count = i + 1;
            System.out.print("номер строки " + count + " : ");
            for (int j = 0; j < ArrayZmeyka[i].length; j++) {
                System.out.print(ArrayZmeyka[i][j] + " ");
                z++;
            }
            System.out.println(" Количество символов в строке " + z);
            z = 0;
        }
    }
}
