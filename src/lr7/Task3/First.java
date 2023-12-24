package lr7.Task3;

public class First {

    public int int1;//в первом суперклассе есть открытое целочисленное поле

    public void setInt1(int int1) {
        this.int1 = int1;
    } //метод с одним параметром для присваивания значения полю

    First (int int1){//конструктор с одним параметром
        this.setInt1(int1);
    }
    //Для каждого класса определите метод toString () так, чтобы он возвращал строку с названием класса и значениями всех полей объекта.

    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue =
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                        " int 1 = " + this.getInt1();
        return ClassNameAndFieldValue;
    }
    public int getInt1() {
        return int1;
    }
}