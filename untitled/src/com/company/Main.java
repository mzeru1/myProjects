package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        // prompt user for fahrehenitTemp
        System.out.println("Enter temp in fahrehnite");
        //get fahrehnitTemp
        int temp = input.nextInt();
        // calculate celciusTemp = (fahrehnitTemp - 32) * 5/9
        double celciusTemp = (temp - 32)*5/9;
        System.out.println("The celcius temp is " + celciusTemp);

        //write your code here

        int totlal = 0;
        int counter = 0;
        System.out.println("enter 4 numbers in order");
        while (counter < 4) {
            int numbers = input.nextInt();
            totlal+= numbers;
            counter++;
        }
        int aveNumb = totlal/4;
        System.out.println("yout average number is "+aveNumb);


    }
}
