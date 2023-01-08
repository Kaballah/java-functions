import java.util.Scanner;

public class caseTest {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an option: ");
        int option = input.nextInt();

        switch(option) {
            case 1:
                System.out.println("You selected option 1!");
                break;
            case 2:
                System.out.println("You selected option 2!");
                break;
            default:
                System.out.println("You made an invalid selection!");
                break;
        }
    }
}
