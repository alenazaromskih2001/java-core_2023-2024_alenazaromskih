package lr9.Task7;

import java.util.LinkedList;
import java.util.List;
public class LinkedL {
    public static void main(String[] args) {
        int n = 10; // Количество человек



        System.out.println("Результат с использованием LinkedList: " + usingLinkedList(n));
    }

    private static int usingLinkedList(int n) {
        List<Integer> people = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            people.add(i);
        }

        int idx = 0;
        while (people.size() > 1) {
            idx = (idx + 1) % people.size();
            people.remove(idx);
        }

        return people.get(0);
    }
}