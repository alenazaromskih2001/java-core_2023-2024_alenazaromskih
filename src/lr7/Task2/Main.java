package lr7.Task2;

public class Main {
    public static void main(String[] args) {
        SuperClassTest myTest0 = new SuperClassTest();
        String SuperClassTest0 = myTest0.toString();
        System.out.println(SuperClassTest0);

        SuperClassTest myTest1 = new SuperClassTest("test this");
        String superClassTest1 = myTest1.toString();
        System.out.println(superClassTest1);

        SuperClassTest myTest2 = new SubClassTest();
        String subClassTest0 = myTest2.toString();
        System.out.println(subClassTest0);

        SuperClassTest myTest3 = new SubClassTest("test this too");
        String subClassTest1 = myTest3.toString();
        System.out.println(subClassTest1);

        SuperClassTest myTest4 = new SubClassTest(256);
        String subClassTest2 = myTest4.toString();
        System.out.println(subClassTest2);

        SuperClassTest myTest5 = new SubClassTest("test this and this", 256);
        String subClassTest3 = myTest5.toString();
        System.out.println(subClassTest3);
    }
}