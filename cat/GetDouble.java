import java.util.Scanner;

public class GetDouble {

    public static void main(String[] args) {
        getDouble("Please Enter a Double Number: ", 10.00, 100.00);
    }

    public static void getDouble(String prompt, double min, double max) {
        String message = prompt;
        double minNumber = min;
        double maxNumber = max;

        while(true) {
            Scanner input = new Scanner(System.in);

            System.out.println(message);
            Double actualNumber = input.nextDouble();

            if(actualNumber > minNumber && actualNumber < maxNumber && actualNumber != Math.floor(actualNumber)) {
                break;
            } 
            if(actualNumber < minNumber) {
                System.out.println("Value too low");
            } else if(actualNumber > maxNumber) {
                System.out.println("Value Too High");
            } else if(actualNumber == Math.floor(actualNumber)) {
                System.out.println("Value wrong type");
            }
        }
    }
}
