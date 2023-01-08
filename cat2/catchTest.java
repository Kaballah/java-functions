public class catchTest {
    public static void main(String [] args) {
        try {
            int [] numbers = { 1, 10, 100 };
            System.out.println(numbers[10]);
        } catch (Exception e) {
            System.out.println("Error!");
        }
    }
}