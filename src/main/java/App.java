/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Luis Corona
 */
import java.util.Scanner;
import java.time.LocalDate;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        App app = new App();
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();
        String currentAge = app.readCurrent();
        String retireAge = app.readRetire();
        int years_left = app.Calc(currentAge, retireAge);
        app.printOutput(years_left, currentYear);

    }

    private int Calc(String currentAge, String retireAge) {
        int currentInt = Integer.parseInt(currentAge);
        int retireInt = Integer.parseInt(retireAge);
        int sum = retireInt - currentInt;
        return sum;
    }

    private void printOutput(int years_left, int currentYear) {
        String message = String.format("You have %s years left until you can retire.", years_left);
        String message2 = String.format("It's %s, so you can retire in %s.", currentYear, currentYear+years_left);
        String newline = System.lineSeparator();
        System.out.println(message + newline + message2);
    }

    private String readCurrent() {
        System.out.print("What is your current age? ");
        String currentAge = in.nextLine();
        return currentAge;
    }

    private String readRetire() {
        System.out.print("At what age would you like to retire? ");
        String retireAge = in.nextLine();
        return retireAge;
    }
}
