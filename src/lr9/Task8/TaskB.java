package lr9.Task8;
import java.util.Scanner;
public class TaskB {
    private Node head;

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Ввод списка с головы (рекурсия)
    public void createHeadRec() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите элементы списка (введите -1 для завершения ввода): ");

        int value = scanner.nextInt();
        if (value != -1) {
            head = new Node(value);
            createHeadRecHelper(head);
        }
    }

    private void createHeadRecHelper(Node current) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        if (value != -1) {
            Node newNode = new Node(value);
            current.next = newNode;
            createHeadRecHelper(newNode);
        }
    }

    // Ввод списка с хвоста (рекурсия)
    public void createTailRec() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите элементы списка (введите -1 для завершения ввода): ");

        int value = scanner.nextInt();
        if (value != -1) {
            Node newNode = new Node(value);
            if (head == null) {
                head = newNode;
            } else {
                createTailRecHelper(head, newNode);
            }
        }
    }

    private void createTailRecHelper(Node current, Node newNode) {
        if (current.next == null) {
            current.next = newNode;
        } else {
            createTailRecHelper(current.next, newNode);
        }
    }

    // Вывод списка (рекурсия)
    public String toStringRec() {
        return toStringRecHelper(head);
    }

    private String toStringRecHelper(Node current) {
        if (current == null) {
            return "";
        } else if (current.next == null) {
            return Integer.toString(current.data);
        } else {
            return current.data + " -> " + toStringRecHelper(current.next);
        }
    }
}