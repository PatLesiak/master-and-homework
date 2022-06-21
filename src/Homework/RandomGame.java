package Homework;

import java.util.Random;
import java.util.Scanner;

public class RandomGame {
    public static void main (String [] args){
        Random rand = new Random();

        int randomNum = rand.nextInt(9)+1;
        System.out.println("Number is: "+randomNum);
        int tries = 1;

        while (true) {
            System.out.println("Enter your guess (number between 1 and 9)");

            Scanner scanner = new Scanner(System.in);
            int Guess = scanner.nextInt();

            if (Guess == randomNum) {
                System.out.println("Correct answer! It took you "+tries+" tries");
                break;
            } else if (Guess > randomNum) {
                System.out.println("Number is higher! Play again!");
            } else {
                System.out.println("Number is lower! Play again!");
            }
            ++tries;
        }
    }
}
