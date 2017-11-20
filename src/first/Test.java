package first;

public class Test {
    public static void main(String[] args) {
        System.out.println(concat("Happy ", "New ", "Year"));
    }

    public static String concat(String a, String b, String c) {

        String result = a + b + c;
        return result;
    }
}
