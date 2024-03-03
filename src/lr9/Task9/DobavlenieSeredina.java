package lr9.Task9;

import java.util.*;

public class DobavlenieSeredina{

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        int index = arrayList.size() / 2; // Определяем индекс середины коллекции
        arrayList.add(index, 10);

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        int index2 = arrayDeque.size() / 2; // Определяем индекс середины коллекции
        arrayDeque.add(index2);

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10); // Сначала добавляем любой элемент
        treeSet.add(treeSet.first() + (treeSet.last() - treeSet.first()) / 2); // Затем добавляем элемент в середину

        System.out.println("Время выполнения операции добавления arrayList = " + getRunningTime(arrayList));
        System.out.println("Время выполнения операции добавления ArrayDeque = " + getRunningTime(arrayDeque));
        System.out.println("Время выполнения операции добавления TreeSet = " + getRunningTime(treeSet));

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
    private static long getRunningTime(Set<Integer> Set){

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления
        for (int i = 0; i < 9000000; i++) {
            Set.add(i);
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }
}