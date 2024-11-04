package Labs.Lab1.Task1;

import java.util.Scanner;

public class Analyzer {
    static public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Data data = new Data();
        while (true) {
            System.out.print("Enter number (Q to quit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("Q")) {
                break;
            }

            try {
                double value = Double.parseDouble(input);
                data.add(value);
            }
            catch(NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or 'Q' to quit.");
            }
        }
        System.out.println("Avarage = " + data.getAvarage());
        System.out.println("Maximum = " + data.getMax());
    }
}