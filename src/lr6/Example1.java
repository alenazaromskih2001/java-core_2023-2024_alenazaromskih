package lr6;
//Напишите программу с классом, в котором есть два поля: символьное и текстовое.
//  В классе должен быть перегруженный метод для присваивания значений полям.
// Если метод вызывается с символьным аргументом, то соответствующее значение присваивается символьному полю.
// Если метод вызывается с текстовым аргументом, то он определяет значение текстового ноля.
// Методу аргументом также может передаваться символьный массив. Если массив состоит из одного элемента, то он определяет значение символьного поля.
// В противном случае (если в массиве больше одного элемента) из символов массива формируется текстовая строка и присваивается значением текстовому полю.
public class Example1 {
    public static void main(String[] args) {

        Example myexample = new Example();
        myexample.Argument('A');
        myexample.Argument("B");
        char[] CharArray1 = {'a', 'l', 'e', 'n', 'k', 'a'};
        char[] CharArray2 = {'C'};
        myexample.Argument(CharArray1);
        myexample.Argument(CharArray2);

    }

    static class Example {
        private char ch;//символьное
        private String str;//текстовое

        public void Argument(char c) {
            ch = c;
            System.out.print("\n Вызов метода Argument c аргументом char. ch =" + ch);
        }


        public void Argument(String s) {
            str = s;
            System.out.print("\n Вызов метода Argument c аргументом string. str =" + str);
        }

        public void Argument(char[] CharArray) {
            if (CharArray.length == 1) {
                ch = CharArray[0];
                System.out.print("\n Вызов метода Argument c массивом char. ch =" + ch);
            } else {

                str = new String(CharArray);
                System.out.print("\n Вызов метода Argument c массивом string. str =" + str);
            }
        }


    }
}