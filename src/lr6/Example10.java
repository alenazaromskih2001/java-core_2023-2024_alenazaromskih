package lr6;

//Напишите программу со статическим методом, аргументом которому передается произвольное количество целочисленных аргументов.
// Результатом метод возвращает массив из двух элементов: это значения наибольшего и наименьшего значений среди аргументов, переданных методу.
public class Example10 {
    public static void main(String[] args) {
        Example myex1 = new Example();
        Example myex2 = new Example();
        myex1.calcMaxMin(1, 2, 3, 78, 96, -1000);
        myex1.viewMaxMin();
        Example.calcMaxMin(55, 67, 0, 15, -3, 6);
        Example.viewMaxMin();
        myex2.calcMaxMin(44, 67, -20, 57, 88, 90);
        myex2.viewMaxMin();
    }

    protected static class Example {
        private static int[] MaxMin;

        //методу аргументом передается произвольное количество целочисленных аргументов
        private static int[] calcMaxMin(int... array) {
            int max = array[0];
            int min = array[0];
            for (int i = 0; i < array.length; i++) {
                max = Math.max(max, array[i]);
                min = Math.min(min, array[i]);
            }
            MaxMin = new int[]{max, min};
            //Результатом метод возвращает массив из двух элементов: это значения наибольшего и наименьшего значений среди аргументов, переданных методу.
            return MaxMin;
        }

        private static void viewMaxMin() {
            System.out.println("\nMaxiMin[max] = " + MaxMin[0]);
            System.out.println("MaxiMin[min] = " + MaxMin[1]);
        }
    }
}