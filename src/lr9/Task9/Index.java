package lr9.Task9;

import java.util.*;

public class Index {
    public static void main(String[] args) {


        ArrayList<Integer> people = new ArrayList<Integer>();
        // добавим в список ряд элементов
        people.add(14);
        people.add(12);
        people.add(13);
        people.add(16);
        people.add(1, 18); // добавляем элемент по индексу 1

        System.out.println(people.get(3));


        ArrayDeque<Integer> people2 = new ArrayDeque<Integer>();
        // добавим в ArrayDeque ряд элементов
        people2.add(14);
        people2.add(12);
        people2.add(13);
        people2.add(16);
        people2.addFirst(18); // добавляем элемент в начало дека

        System.out.println(people.get(3));

        System.out.println("Время выполнения операции добавления arrayList = " + getRunningTime(people));
        System.out.println("Время выполнения операции добавления ArrayDeque = " + getRunningTime(people2));

    }
    private static long getRunningTime(List<Integer> list){

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления
        for (int i = 0; i < 9000000; i++) {
            list.add(i);
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }

    private static long getRunningTime(Deque<Integer> Deque){

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления
        for (int i = 0; i < 9000000; i++) {
            Deque.add(i);
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }
}
