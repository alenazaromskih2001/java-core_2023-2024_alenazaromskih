package lr7.Task5;

public class First {

    protected String str1;//суперкласс с защищенным текстовым полем

    public void setStr1(String str1) {
        this.str1 = str1;
    }

    First(String str1){
        this.setStr1(str1);
    }

    public void PrintToString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue =
                "\n Class name: " + this.getClass().getSimpleName() + "\n" +
                        " String 1 = \"" + this.getStr1()+"\"";
        System.out.println(ClassNameAndFieldValue);
    }
    public String getStr1() {
        return str1;
    }
}