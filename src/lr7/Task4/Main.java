package lr7.Task4;

public class Main {
    public static void main(String[] args) {

        First superClassTest = new First('A');
        String className1 = superClassTest.toString();
        System.out.println(className1);
        First superClassTestCopy = new First(superClassTest);
        String className1copy = superClassTestCopy.toString();
        System.out.println(className1copy);
        Second FirstSubClassTest = new Second('A', "AAA");
        String className2 = FirstSubClassTest.toString();
        System.out.println(className2);
        Second FirstSubClassTestCopy = new Second(FirstSubClassTest);
        String className2Copy = FirstSubClassTestCopy.toString();
        System.out.println(className2Copy);
        Third SecondSubClassTest = new Third('A', "AAA", 666);
        String className3 = SecondSubClassTest.toString();
        System.out.println(className3);
        Third SecondSubClassTestCopy = new Third(SecondSubClassTest);
        String className3Copy = SecondSubClassTestCopy.toString();
        System.out.println(className3Copy);
    }
}