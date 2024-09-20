package src;

import java.util.Scanner;

public class UserInput {
    private Scanner scanner = new Scanner(System.in);

    public double getNumber() {
        System.out.print("Enter a number: ");
        return scanner.nextDouble();
    }
}