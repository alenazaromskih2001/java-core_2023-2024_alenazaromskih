package lr7.Task2;

public class SubClassTest  extends SuperClassTest {
    private String str2;   //В подклассе появляется дополнительное открытое целочисленное поле.
    public int int1;

    SubClassTest() {setStr1();} //версия метода без параметров,

    SubClassTest(String str2) {setStr1(str2);}//версия метода с текстовым параметром,

    SubClassTest(int int1) {setStr1(); this.setInt1(int1);}//версия метода с целочисленным параметром,

    SubClassTest(String str2, int int1) {setStr1(str2); this.setInt1(int1);}  //версия метода с текстовым и целочисленным параметром.

    public void setInt1(int int1) {
        this.int1 = int1;
    }
    public void setStr1 (){
        this.str2 = "Привет";
    }

    public void setStr1 (String str2){
        this.str2 = str2;
    }

    public int getInt1(){

        return int1;
    }

    public String getStr1(){

        return str2;
    }

    public int getStr1length(){

        return str2.length();
    }

    @Override
    public String toString() {
        String ClassNameAndFieldValue = "subClassTest{" + "str2=\"" + getStr1() + '\"' + " string.length = " +"\""+getStr1length()+"\"}"
                +"\nsubClassTest{" + "int1=\"" + getInt1() + "\"}";
        return ClassNameAndFieldValue;
    }

}