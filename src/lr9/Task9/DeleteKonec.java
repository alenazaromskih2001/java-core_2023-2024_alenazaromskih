package lr9.Task9;

import java.util.*;

public class DeleteKonec {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(10);
        Integer lastIndex = arrayList.size() - 1;
        arrayList.remove(lastIndex);

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        arrayDeque.addLast(10);
        arrayDeque.removeLast();

        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(10);
        Integer lastElement = treeSet.last(); // получаем последний элемент
        treeSet.remove(lastElement);

        System.out.println("Время выполнения операции удаления arrayList = " + getRunningTime(arrayList));
        System.out.println("Время выполнения операции удаления ArrayDeque = " + getRunningTime(arrayDeque));
        System.out.println("Время выполнения операции удаления TreeSet = " + getRunningTime(treeSet));

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