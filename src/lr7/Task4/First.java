package lr7.Task4;

public class First{

    public char char1; //В первом классе есть открытое символьное поле

    public void setChar1(char char1) {
        this.char1 = char1;
    }
    //конструктор с одним параметром
    First(char char1){
        this.setChar1(char1); //конструктор с одним параметром
    }

    First(First copy){ this.setChar1(copy.char1); }  //конструктор копии

    @Override
    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue =
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                        " char 1 = " + this.getChar1();
        return ClassNameAndFieldValue;
    }
    public char getChar1() {
        return char1;
    }
}