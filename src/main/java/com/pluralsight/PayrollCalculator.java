package com.pluralsight;
import java.util.Scanner;
public class PayrollCalculator {

    public static void main(String[] args) {

        //variables

        Scanner keyboard = new Scanner(System.in);
        String name;
        double hours , payRate, grossPay, overtime;


        //get user input
        System.out.print("Welcome to the Gross Pay Calculator! Please enter your name: ");
        name =keyboard.nextLine();
        System.out.println("Enter hours worked: ");
        hours = keyboard.nextDouble();
        System.out.println("Enter your Pay Rate: ");
        payRate = keyboard.nextDouble();

        if(hours > 40)
        {
            overtime = hours - 40;
            grossPay = (hours * payRate) + (overtime * 1.5);
            System.out.println("Employee name: " + name);
            System.out.println("Your Gross Pay with "+ overtime + " overtime hours is: " + grossPay);

        }
        else if(hours <= 40)
        {
            grossPay = hours * payRate;
            System.out.println("Employee name: " + name);
            System.out.println("Your Gross Pay without overtime is: " + grossPay);

        }




    }


}
