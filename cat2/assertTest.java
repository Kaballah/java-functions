public class assertTest {
    public static void main(String [] args) {
        int num1 = 10;
        assert num1 >= 100 : "Value is too large";
        System.out.println("Value is " + num1);
    }
}