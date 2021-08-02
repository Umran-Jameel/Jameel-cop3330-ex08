/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Umran Jameel
 */

import java.util.*;

public class Exercise8 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("How many people? ");
        int people = 0;
        String peo = in.nextLine();
        try {
            people = Integer.parseInt(peo);
        } catch(NumberFormatException e) {
            System.out.println("Please enter a numeric value!");
            System.exit(0);
        }


        System.out.print("How many pizzas do you have? ");
        String piz = in.nextLine();
        int pizza = 0;
        try {
            pizza = Integer.parseInt(piz);
        } catch(NumberFormatException e) {
            System.out.println("Please enter a numeric value!");
            System.exit(0);
        }

        System.out.print("How many slices per pizza? ");
        String sli = in.nextLine();
        int slices = 0;
        try {
            slices = Integer.parseInt(sli);
        } catch(NumberFormatException e) {
            System.out.println("Please enter a numeric value!");
            System.exit(0);
        }

        System.out.printf("%d people with %d pizzas (%d slices)\n", people, pizza, slices);
        System.out.printf("Each person gets %d slices of pizza.\n", (slices * pizza) / people);
        System.out.printf("There are %d leftover pieces.\n", (slices * pizza) % people);
    }
}
