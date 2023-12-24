package lr7.Task3;

public class Main  {
    public static void main(String[] args) {
        First SuperClassTest = new First(700);
        String className1 = SuperClassTest.toString();
        System.out.println(className1);

        Second SC2 = new Second(15,'A');
        String className2 = SC2.toString();
        System.out.println(className2);

        Third SC3 = new Third(1500,'A',"hello");
        String className3 = SC3.toString();
        System.out.println(className3);
    }
}