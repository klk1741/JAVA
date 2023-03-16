package ch5;
import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Let's play Mad Libs!");

        System.out.print("Enter an adjective: ");
        String adjective1 = input.nextLine();

        System.out.print("Enter a noun: ");
        String noun1 = input.nextLine();

        System.out.print("Enter a verb: ");
        String verb1 = input.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective2 = input.nextLine();

        System.out.print("Enter a noun: ");
        String noun2 = input.nextLine();

        System.out.print("Enter a number: ");
        int number1 = input.nextInt();

        System.out.println("Here is your silly story:");

        System.out.println("Once upon a time, there was a " + adjective1 + " " + noun1 + " who loved to " + verb1 + " all day long. One day, " + adjective2 + " " + noun2 + "s appeared out of nowhere and " + verb1 + "d with the " + noun1 + " for " + number1 + " hours straight. And that's how the world ended.");

        input.close();
    }
}