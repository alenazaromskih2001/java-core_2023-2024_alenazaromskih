package lr13.examples;
//Пример 9. Генерация исключительной ситуации в методе и дополнительное использование оператора return.

public class Ex9 {
    public static int m() {
        try {
            System.out.println("0");
            return 55;    // выход из метода
        } finally {
            System.out.println("1");
        }
    }

    public static void main(String[] args) {
        System.out.println(m());
    }
}
