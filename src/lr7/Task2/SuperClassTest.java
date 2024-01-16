package lr7.Task2;

public class SuperClassTest {

    private String str1; //приватное текстовое поле

    SuperClassTest() {
        setStr1();
    } //Объект суперкласса создается передачей одного текстового аргумента конструктору.

    SuperClassTest(String str1) {
        setStr1(str1);
    }//метод для присваивания значения полю без параметров

    public void setStr1() {
        this.str1 = "Привет";
    } //метод для присваивания значения полю с одним текстовым параметром

    public void setStr1(String str1) {
        this.str1 = str1;
    }

    public String getStr1() {

        return str1;
    }

    public int getStr1length() {
        //   System.out.println("Длина текстовой строки="+str1.length());
        return str1.length();
    }


    @Override
    public String toString() {
        String superClassNameAndFieldValue = "superClassTest{" + "str1=\"" + getStr1() + '\"' + " string.length = " + "\"" + getStr1length() + "\"}";
        return superClassNameAndFieldValue;
    }
}