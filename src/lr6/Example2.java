package lr6;
//Напишите программу с классом, в котором есть закрытое статическое целочисленное ноле с начальным нулевым значением.
//В классе должен быть описан статический метод, при вызове которого отображается текущее значение статического поля, после чего значение поля увеличивается на единицу.
public class Example2 {

        public static class Example {
            private static int meaning;
            public static void view() {
                System.out.println(meaning);
                meaning++;
            }
        }
        public static void main(String[] args) {
            Example myexample = new Example();
            myexample.view();
            myexample.view();
            myexample.view();
            myexample.view();
        }
    }

