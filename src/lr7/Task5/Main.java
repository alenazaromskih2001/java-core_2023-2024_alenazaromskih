package lr7.Task5;

public class Main{
    public static void main(String[] args) {
        First SuperClassTest1 = new First("hello");
        SuperClassTest1.PrintToString();

       Second SubClassTest1 = new Second("world", 55);
        SubClassTest1.PrintToString();

        Third SubClassTest2 = new Third("!!!", 'A');
        SubClassTest2.PrintToString();

        First SuperClassTest2 = new First(SubClassTest1.getStr1());
        SuperClassTest2.PrintToString();

        First SuperClassTest3 = new First(SubClassTest2.str1);
        SuperClassTest3.PrintToString();
    }
}