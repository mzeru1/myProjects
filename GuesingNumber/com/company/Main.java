package com.company;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        //declare variables at the beginning of the program
        boolean done = false;
        String again = "";
        Scanner scan = new Scanner(System.in);

        // first thing we need to do is think of a number
        Random rand = new Random();
        int secretNumber = 1 + rand.nextInt(10);
        System.out.println("I am thinking of a number between 1 and 10 can you gues?");

        while (done != true) {
            int guess = scan.nextInt();
            scan.nextLine();
            //print the number for a hint
            System.out.println("Hint:" + secretNumber);

            //new give some feedback about the guess
            if (guess < secretNumber) {
                System.out.println("your number is too low");
            } else if (guess > secretNumber) {
                System.out.println("your number is too high");
            } else {
                System.out.println("you are correct!");
            }

            System.out.println("so you want to guess again? (y/n)");
            again = scan.nextLine();
            if (again.equalsIgnoreCase("y")) {
                done = false;
            } else {
                done = true;
            }
        }
        System.out.println("Good bye");
    }
}
