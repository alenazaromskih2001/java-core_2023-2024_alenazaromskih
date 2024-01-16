package lr6;

//Напишите программу с классом, в котором есть статические методы, которым можно передавать произвольное количество целочисленных аргументов (или целочисленный массив).
// Методы, на основании переданных аргументов или массива, позволяют вычислить: наибольшее значение, наименьшее значение, а также среднее значение из набора чисел.
public class Example3 {
    public static void main(String[] args) {
        Example.Max(1, 2, -200, 16, 39);
        Example.Min(15, -100, 250, 150, 0);
        Example.Avg(67, 77, 88, 90, 1, -1);
    }

    private static class Example {

        private static void Max(int... array) {
            int max = array[0];
            for (int i = 0; i < array.length; i++) {
                max = Math.max(max, array[i]);
            }
            System.out.println("Maximum array[] = " + max);
        }

        private static void Min(int... array) {
            int min = array[0];
            for (int i = 0; i < array.length; i++) {
                min = Math.min(min, array[i]);
            }
            System.out.println("Minimum array[] = " + min);
        }

        private static void Avg(int... array) {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum = array[i] + sum;
            }
            double avg = (double) sum / array.length;
            System.out.println("Average array[] = " + avg);
        }
    }

}