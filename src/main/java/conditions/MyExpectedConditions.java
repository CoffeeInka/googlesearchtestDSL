package conditions;

public class MyExpectedConditions {

    public static Condition nthElementText(int index, String text) {
        return new NthElementText(index, text);
    }

    public  static Condition sizeOf(int expectedNumber){
        return new SizeOf(expectedNumber);
    }

    public  static Condition visible(){
        return new Visible();
    }
}
