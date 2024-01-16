package lr7.Task4;

public class Third extends Second {
    Third(char char1) {
        super(char1);
    }

    public int int1; //Во третьем классе появляется открытое целочисленное поле

    public void setChar1Str1Int1(char char1, String str1, int int1) {
        super.char1 = char1;
        super.str1 = str1;
        this.int1 = int1;
    }

    Third(char char1, String str1, int int1) {
        super(char1, str1);
        setChar1Str1Int1(super.char1, super.str1, int1);
    }

    Third(Third copy) {
        super(copy.char1, copy.str1);
        this.setChar1Str1Int1(copy.char1, copy.str1, copy.int1);
    }

    public String toString() {
        String ThirdFieldValue =
                "\n str 2 = " + this.getInt1();
        return super.toString() + ThirdFieldValue;
    }

    public int getInt1() {
        return int1;
    }
}