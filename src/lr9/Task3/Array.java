package lr9.Task3;

/// Создать приложение, позволяющее ввести и вывести одномерный массив целых чисел. Для ввода и вывода массива разработать рекурсивные методы вместо циклов for.
public class Array {
    int values[];

    Array (int i)
    {
        values = new int[i];
    }
    void PrintArray (int i)
    {
        if(i==0) return;
        else PrintArray(i-1);

        System.out.println("[" + (i-1) + "] " + values[i-1]);
    }
}

class Recurtion {
    public static void main(String args[])
    {
        Array obj = new Array(10);
        int i;
        for (i=0;i<10;i++)
        {
            obj.values[i] = i;
        }

        obj.PrintArray(10);
    }
}