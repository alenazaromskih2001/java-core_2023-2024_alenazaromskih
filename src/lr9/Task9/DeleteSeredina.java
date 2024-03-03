package lr9.Task9;

import java.util.*;

public class DeleteSeredina {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();


        Integer middleIndex = arrayList.size() / 2;
        arrayList.remove(middleIndex);

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();


        Integer middleIndex2 = arrayDeque.size() / 2;
        Iterator<Integer> iterator = arrayDeque.iterator();
        Integer currentIndex = 0;
        while (iterator.hasNext()) {
            if (currentIndex == middleIndex2) {
                iterator.remove();
                break;
            }
            iterator.next();
            currentIndex++;
        }

        TreeSet<Integer> treeSet = new TreeSet<>();
// инициализация и добавление элементов в коллекцию

        Integer middleIndex3 = treeSet.size() / 2; // индекс серединного элемента (если размер четный, то индекс будет округлен вниз)
        Iterator<Integer> iterator3 = treeSet.iterator();
        Integer currentIndex3 = 0;
        while (iterator.hasNext()) {
            Integer currentElement = iterator3.next();
            if (currentIndex3 == middleIndex3) {
                iterator.remove();
                break;
            }
            currentIndex++;
        }

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