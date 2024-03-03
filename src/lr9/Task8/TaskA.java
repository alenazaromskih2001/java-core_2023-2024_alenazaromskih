package lr9.Task8;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class TaskA {
    private Node head;

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Ввод списка с головы
    public void createHead() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите элементы списка (введите -1 для завершения ввода): ");

        int value = scanner.nextInt();
        while (value != -1) {
            Node newNode = new Node(value);

            if (head == null) {
                head = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }

            value = scanner.nextInt();
        }
    }

    // Ввод списка с хвоста
    public void createTail() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите элементы списка (введите -1 для завершения ввода): ");

        int value = scanner.nextInt();
        Node newNode = new Node(value);
        Node current = newNode;

        while (value != -1) {
            current.next = new Node(value);
            current = current.next;

            value = scanner.nextInt();
        }

        if (head == null) {
            head = newNode.next;
        } else {
            current.next = newNode.next;
        }
    }

    // Вывод списка
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head;

        while (current != null) {
            sb.append(current.data).append(" ");
            current = current.next;
        }

        return sb.toString();
    }

    // Добавление элемента в начало списка
    public void AddFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    // Добавление элемента в конец списка
    public void AddLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }
    }

    // Вставка элемента в список с указанным номером
    public void Insert(int data, int index) {
        Node newNode = new Node(data);
        Node current = head;
        int count = 0;

        while (count < index - 1 && current != null) {
            current = current.next;
            count++;
        }

        if (current == null) {
            throw new IndexOutOfBoundsException("Индекс находится за пределами списка");
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    // Удаление элемента с головы списка
    public void RemoveFirst() {
        if (head == null) {
            throw new NoSuchElementException("Список пуст");
        }

        head = head.next;
    }

    // Удаление последнего элемента списка
    public void RemoveLast() {
        if (head == null) {
            throw new NoSuchElementException("Список пуст");
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node current = head;

        while (current.next.next != null) {
            current = current.next;
        }

        current.next = null;
    }

    // Удаление из списка элемента с указанным номером
    public void Remove(int index) {
        if (head == null) {
            throw new NoSuchElementException("Список пуст");
        }

        if (index == 0) {
            head = head.next;
            return;
        }

        Node current = head;
        int count = 0;

        while (count < index - 1 && current != null) {
            current = current.next;
            count++;
        }

        if (current == null || current.next == null) {
            throw new IndexOutOfBoundsException("Индекс находится за пределами списка");
        }

        current.next = current.next.next;
    }

}