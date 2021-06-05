/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Rafael Nieves
 */

package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MultistateSalesTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat dfCent = new DecimalFormat("#.##");

        System.out.print("What is the order amount? ");
        String orderString = input.nextLine();
        double orderNumber = Double.parseDouble(orderString);

        System.out.print("What state do you live in? ");
        String stateString = input.nextLine();

        double tax = 0 , total;

        if (stateString.equals("Wisconsin")) {
            System.out.print("What county do you live in? ");
            String countyString = input.nextLine();
            tax = 0.05  * orderNumber;

            if (countyString.equals("Eau Claire")) {
                tax = (0.05 + 0.005) * orderNumber;
            }
            if (countyString.equals("Dunn")) {
                tax = (0.05 + 0.004) * orderNumber;
            }
        }
        if (stateString.equals("Illinois")) {
            tax = 0.08 * orderNumber;
        }

        total = orderNumber + tax;

        System.out.println("The tax is $" + dfCent.format(tax) + ".\n" +
                           "The total is $" + dfCent.format(total) + ".");
    }
}
