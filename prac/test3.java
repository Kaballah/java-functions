import java.util.Scanner;

public class test3 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        int myNums[] = new int[10];

        for(int i = 0; i < myNums.length; i++) {
            System.out.print("\n\nEnter your list of numbers: ");
            // int nums = input.nextInt();
            myNums[i] = Integer.parseInt(input.nextLine());

            if(myNums[0] == 0) {
                int sum = 0;
                System.out.print("Sum is: " + sum);
            } else if(myNums[1] == 0) {
                int sum = myNums[0];
                System.out.print("Sum is: " + sum);
            } else if(myNums[2] == 0) {
                int sum = myNums[0] + myNums[1];
                System.out.print("Sum is: " + sum);
            } else if(myNums[3] == 0) {
                int sum = myNums[0] + myNums[1] + myNums[2];
                System.out.print("Sum is: " + sum);
            } else if(myNums[4] == 0) {
                int sum = myNums[0] + myNums[1] + myNums[2] + myNums[3];
                System.out.print("Sum is: " + sum);
            } else if(myNums[5] == 0) {
                int sum = myNums[0] + myNums[1] + myNums[2] + myNums[3] + myNums[4];
                System.out.print("Sum is: " + sum);
            } else if(myNums[6] == 0) {
                int sum = myNums[0] + myNums[1] + myNums[2] + myNums[3] + myNums[4] + myNums[5];
                System.out.print("Sum is: " + sum);
            } else if(myNums[7] == 0) {
                int sum = myNums[0] + myNums[1] + myNums[2] + myNums[3] + myNums[4] + myNums[5] + myNums[6];
                System.out.print("Sum is: " + sum);
            } else if(myNums[8] == 0) {
                int sum = myNums[0] + myNums[1] + myNums[2] + myNums[3] + myNums[4] + myNums[5] + myNums[6] + myNums[7];
                System.out.print("Sum is: " + sum);
            } else if(myNums[9] == 0) {
                int sum = myNums[0] + myNums[1] + myNums[2] + myNums[3] + myNums[4] + myNums[5] + myNums[6] + myNums[7] + myNums[8];
                System.out.print("Sum is: " + sum);
            } else {
                int sum = myNums[0] + myNums[1] + myNums[2] + myNums[3] + myNums[4] + myNums[5] + myNums[6] + myNums[7] + myNums[8] + myNums[9];
                System.out.print("Sum is: " + sum);
            }
        }
    }
}
