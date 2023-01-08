package football;

import java.util.Scanner;

public class FootballTeam {
    private static String nameOfTheTeam;
    private static int numberOfWins;
    private static int numberOfLosses;

    // Accepts the name, wins and losses of a particular team
    public FootballTeam(String name, int wins, int losses) {
        nameOfTheTeam = name;
        numberOfWins = wins;
        numberOfLosses = losses;

        // Scanner input = new Scanner(System.in);

        // System.out.print("Enter the name of the team: ");
        // this.nameOfTheTeam = input.nextLine();
        // System.out.print("Enter the number of wins: ");
        // this.numberOfWins = input.nextInt();
        // System.out.print("Enter the number of losses: ");
        // this.numberOfLosses = input.nextInt();
    }

    // Increases the wins by 1 points
    private static void increaseWins() {
        numberOfWins = numberOfWins + 1;
    }

    // Increases the losses by 1 point
    private void increaseLosses() {
        this.numberOfLosses = numberOfLosses + 1;
    }

    // Prints the outcome if the records, whether good or bad
    public static void record() {
        if(numberOfWins > numberOfLosses) {
            System.out.println("\nTrue");
        }
    }

    // Prints out the data of a particular team
    public static void printData() {
        System.out.println("Name of the Team: " + nameOfTheTeam);
        System.out.println("Number of wins: " + numberOfWins);
        System.out.println("Number of losses: " + numberOfLosses);
    }

    public static void main(String [] args) {
        FootballTeam teaam1 = new FootballTeam("AITI", 3, 5);
        record();
        printData();
        increaseWins();
        increaseWins();
        increaseWins();
        record();
        printData();
    }
}