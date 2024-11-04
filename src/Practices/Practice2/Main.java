package Practices.Practice2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bank = input.nextInt();
        float percent = input.nextFloat();
        System.out.println(Main.interest(bank, percent));
    }
    public static float interest(int currentValue, float percent) {
        return currentValue + currentValue*(percent/100);
    }
}